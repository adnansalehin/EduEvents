import React from 'react';

import SubHeader from './SubHeader';

const style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  }
}

const SignUp = () => {
  return (
    <div style={style.body}>
      <SubHeader subheader="Create an account" />
    </div>
  );
}

export default SignUp;
