import React from 'react';

import MemberEvents from './MemberEvents';
import CreateEventForm from './CreateEventForm.js';

var style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  }
}

class CreateEvents extends React.Component {
  render() {
    return (
      <MemberEvents>
        <div style={style.body}>
          <CreateEventForm />
        </div>
      </MemberEvents>
    );
  }
}

export default CreateEvents;
