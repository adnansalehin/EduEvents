import React from 'react';

import MemberRoot from '../MemberRoot';
import NavBar from '../NavBar';
import AccountDetails from './AccountDetails';
import AccountHeader from './AccountHeader';

class MemberAccount extends React.Component {
  render() {
    return (
      <MemberRoot>
        <NavBar>
          <AccountHeader />
        </NavBar>
        <AccountDetails />
      </MemberRoot>
    );
  }
}

export default MemberAccount;
