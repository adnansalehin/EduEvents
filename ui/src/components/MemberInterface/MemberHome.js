import React from 'react';

import Home from '../Home/Home';
import MemberRoot from './MemberRoot';

class MemberHome extends React.Component {
  render() {
    return (
      <div>
        <MemberRoot>
          <Home />
        </MemberRoot>
      </div>
    );
  }
}

export default MemberHome;
