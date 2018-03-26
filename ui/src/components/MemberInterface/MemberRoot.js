import React from 'react';

import Header from '../Header';
import Footer from '../Footer';

//Used as a default component, which you then pass the content in children.
//Here the default components are the header and footer.
class MemberRoot extends React.Component {
  render() {
    return (
      <div>
        <Header element1="Member" element2="My Events" element3="Log out" element1Link="/loggedIn/account" element2Link="/loggedIn/my_events" element3Link="/" />
        {this.props.children}
        <Footer />
      </div>
    );
  }
}

export default MemberRoot;
