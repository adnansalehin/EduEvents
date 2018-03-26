import React from 'react';

import Client from '../Client';

import { withRouter } from 'react-router-dom';

var style = {

  form: {
    position: 'relative',
    marginLeft: '250px',
    top: '2%',
    width: '14%'
  },

  button: {
    backgroundColor: '#3baf36',
    color: 'white'
  },

  failed: {
    color: 'red'
  }
}

class SignUpForm extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      username: '',
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
    //Passing information to backend to create new user
    var response = Client.signupUser(this.state.username, this.state.password, this.state.email);
    if (response !== false) {
      this.props.history.push("/sign_up_successful");
    } else {
      this.props.history.push("/sign_up_failed");
    }
  }

  render() {
    return (
      <form onSubmit={this.onSubmit} style={style.form}>

        <h5 style={style.failed}>{this.props.failed}</h5>

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
          <button className="btn" style={style.button}>
            Sign up
          </button>
        </div>
      </form>
    );
  }
}

export default withRouter(SignUpForm);
