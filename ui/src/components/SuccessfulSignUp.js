import React from 'react';

import Root from './Root';
import EmptyBody from './EmptyBody';

var style = {

  header: {
    position: 'relative',
    marginLeft: '250px',
    top: '2%'
  }
}

const SuccessfulSignUp = () => {
  return (
    <Root>
      <EmptyBody>
        <h3 style={style.header}>Sign up successful!</h3>
      </EmptyBody>
    </Root>
  );
}

export default SuccessfulSignUp;
