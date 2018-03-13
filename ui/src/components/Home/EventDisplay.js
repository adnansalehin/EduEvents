import React from 'react';

const style = {

  body: {
    position: 'relative',
    backgroundColor: 'white',
    marginLeft: '350px',
    top: '10%',
    width: '600px',
    height: '300px'
  }
}

class EventDisplay extends React.Component {
  render() {
    return (
      <div style={style.body}>
        Featured events render in here.
      </div>
    );
  }
}

export default EventDisplay;
