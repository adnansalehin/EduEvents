import React from 'react';

import Client from '../Client';

import { Link } from 'react-router-dom';

var style = {

  form: {
    position: 'relative',
    marginLeft: '250px',
    top: '2%',
    width: '12%'
  },

  button: {
    backgroundColor: '#3baf36',
    color: 'white'
  }
}

class SignInForm extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      username: '',
      password: ''
    }

    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
    this.logInUser = this.logInUser.bind(this);
  }

  logInUser() {
    this.props.changeUsername(this.state.username);
    this.props.logIn();
  }

  changeUser() {
    this.props.changeUsername(this.state.username);
  }

  onChange(e) {
    this.setState({
      [e.target.name]: e.target.value
    });
  }

  async onSubmit(e) {
    e.preventDefault();
    this.logInUser();
    //Passing information to backend server
    Client.postLogin(this.state.username, this.state.password);
  }

  render() {
    return (
      <form onSubmit={this.onSubmit} style={style.form}>

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
          <button className="btn" style={style.button}>
            Login
          </button>
        </div>
      </form>
    );
  }
}

export default SignInForm;
