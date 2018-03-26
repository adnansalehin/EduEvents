import React from 'react';

import SignUpForm from './SignUpForm';
import SubHeader from './SubHeader';

const style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  }
}

class SignUp extends React.Component {

  constructor(props) {
    super(props);
  }

  render() {

    const { userSignupRequest } = this.props;

    return (
      <div style={style.body}>
        <SubHeader subheader="Create an account" />
        <SignUpForm userSignupRequest={userSignupRequest} failed={this.props.failed} />
      </div>
    );
  }
}

export default SignUp;
