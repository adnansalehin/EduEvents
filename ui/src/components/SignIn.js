import React from 'react';

import Radium from 'radium';

import SubHeader from './SubHeader';

var style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  },

  container: {
    position: 'relative',
    marginLeft: '350px',
    top: '5%'
  },

  list: {
    padding: '0'
  },

  fields: {
    listStyleType: 'none',
    paddingBottom: '10px',
  },

  input: {
    width: '250px',
    height: '40px'
  },

  button: {
  }
}

const SignIn = () => {
  return (
    <div style={style.body}>
      <div>
        <SubHeader subheader="Sign in" />
      </div>
      <div style={style.container}>
        <ul style={style.list}>
          <div>
            <li style={style.fields}><input type="text" placeholder="username" style={style.input} /></li>
            <li style={style.fields}><input type="password" placeholder="password" style={style.input} /></li>
          </div>
          <li style={[style.button, style.fields]}><button type="submit">Login</button></li>
        </ul>
        <ul style={style.list}>
          <div>
            <li style={style.fields}><a>Forgot your password?</a></li>
            <li style={style.fields}><a>Create account</a></li>
          </div>
        </ul>
      </div>
    </div>
  );
}

export default Radium(SignIn);
