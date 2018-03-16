import React from 'react';

import MemberEvents from './MemberEvents';

var style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  }
}

class FavouritedEvents extends React.Component {
  render() {
    return (
      <MemberEvents>
        <div style={style.body}>
          <h3>Favourited events page</h3>
        </div>
      </MemberEvents>
    );
  }
}

export default FavouritedEvents;
