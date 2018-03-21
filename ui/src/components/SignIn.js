import React from 'react';

import SubHeader from './SubHeader';
import SignInForm from './SignInForm';

var style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  },
}

const SignIn = () => {
  return (
    <div style={style.body}>
      <div>
        <SubHeader subheader="Sign in" />
      </div>
      <SignInForm />
    </div>
  );
}

export default SignIn;
