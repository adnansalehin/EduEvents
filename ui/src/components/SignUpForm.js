import React from 'react';
import axios from 'axios';

var style = {

  form: {
    position: 'relative',
    marginLeft: '350px',
    top: '2%',
    width: '16%'
  }
}

class SignUpForm extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      username: '',
      firstname: '',
      lastname: '',
      email: '',
      password: '',
      passwordConfirmation: ''
    }

    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  }

  onChange(e) {
    this.setState({
      [e.target.name] : e.target.value
    })
  }

  onSubmit(e) {
    e.preventDefault();
    console.log(this.state);
    //Example of a post request
    //axios.post('/api/users', this.state)
  }

  render() {
    return (
      <form onSubmit={this.onSubmit} style={style.form}>

        <div className="form-group">
          <label className="control-label">First Name</label>
          <input
            value={this.state.firstname}
            onChange={this.onChange}
            type="text"
            name="firstname"
            className="form-control"
          />
        </div>

        <div className="form-group">
          <label className="control-label">Last Name</label>
          <input
            value={this.state.lastname}
            onChange={this.onChange}
            type="text"
            name="lastname"
            className="form-control"
          />
        </div>

        <div className="form-group">
          <label className="control-label">Username</label>
          <input
            value={this.state.username}
            onChange={this.onChange}
            type="text"
            name="username"
            className="form-control"
          />
        </div>

        <div className="form-group">
          <label className="control-label">Email</label>
          <input
            value={this.state.email}
            onChange={this.onChange}
            type="text"
            name="email"
            className="form-control"
          />
        </div>

        <div className="form-group">
          <label className="control-label">Password</label>
          <input
            value={this.state.password}
            onChange={this.onChange}
            type="password"
            name="password"
            className="form-control"
          />
        </div>

        <div className="form-group">
          <label className="control-label">Confirm password</label>
          <input
            value={this.state.passwordConfirmation}
            onChange={this.onChange}
            type="password"
            name="passwordConfirmation"
            className="form-control"
          />
        </div>

        <div className="form-group">
          <button className="btn btn-primary btn-lg">
            Sign up
          </button>
        </div>
      </form>
    );
  }
}

export default SignUpForm;
