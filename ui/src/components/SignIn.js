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

class SignIn extends React.Component {

  constructor(props) {
    super(props);
    
  }

  render() {
    return (
      <div style={style.body}>
        <div>
          <SubHeader subheader="Sign in" />
        </div>
        <SignInForm changeUsername={this.props.changeUsername} username={this.props.username} logIn={this.props.logIn} />
      </div>
    );
  }
}

export default SignIn;
