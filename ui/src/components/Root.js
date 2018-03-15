import React from 'react';

import Header from './Header';
import Footer from './Footer';

class Root extends React.Component {

  constructor(props) {
    super(props);
  };

  render() {
    return (
      <div>
        <Header element1="Sign in" element2="Sign up" element3="About" element1Link="sign_in" element2Link="sign_up" element3Link="about" />
        {this.props.children}
        <Footer />
      </div>
    );
  }
}

export default Root;
