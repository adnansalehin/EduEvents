import React from 'react';

import MemberRoot from '../MemberRoot';
import NavBar from '../NavBar';
import EventsHeader from './EventsHeader';

//Root component for events pages.
//Content is passed as child components.
class MemberEvents extends React.Component {
  render() {
    return (
      <MemberRoot>
        <NavBar>
          <EventsHeader />
        </NavBar>
        {this.props.children}
      </MemberRoot>
    );
  }
}

export default MemberEvents;
