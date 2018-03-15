import React from 'react';

import Header from '../Header';
import Footer from '../Footer';

class MemberRoot extends React.Component {
  render() {
    return (
      <div>
        <Header element1="Member" element2="Create Event" element3="Log out" element1Link="/memberID/account" element2Link="/memberID/create_event" element3Link="log_out" />
        {this.props.children}
        <Footer />
      </div>
    );
  }
}

export default MemberRoot;
