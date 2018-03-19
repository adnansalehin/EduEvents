import React from 'react';

var style = {

  container: {
    marginLeft: '10%',
    marginRight: '10%',
    fontStyle: 'italic',
  },

  eventMain: {
    position: 'relative',
    top: '140px',
    paddingBottom: '10px'
  },

  eventTitle: {
    fontWeight: 'bold'
  },

  eventDetails: {
    position: 'absolute',
    bottom: '0px'
  }
}

const EventInfo = () => {
  return (
    <div style={style.container}>
      <div style={style.eventMain}>
        <h2 style={style.eventTitle}>Event name</h2>
        <h5>This is a description. This is a description. This is a description. This is a description. This is a description.</h5>
      </div>
      <div style={style.eventDetails}>
        <h4>Time</h4>
        <h4>Location</h4>
      </div>
    </div>
  );
}

export default EventInfo;
