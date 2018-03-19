import React from 'react';
import Radium from 'radium';

import EventInfo from './EventInfo';

import arrowButton from '../../res/arrowButton.png';

const style = {

  body: {
    backgroundColor: 'lightgray',
    margin: '0',
    marginLeft: '250px',
    width: '650px',
    height: '350px',
    borderRadius: '0 10px 10px 10px',
    border: '3px solid black',
  },

  button: {
    marginTop: '145px',
    border: '0',
    height: '30px',
    width: '30px'
  },

  leftButton: {
    float: 'left',
    marginLeft: '10px',
  },

  rightButton: {
    float: 'right',
    marginRight: '10px',
    transform: 'rotate(180deg)'
  }
}

class EventDisplay extends React.Component {
  render() {
    return (
      <div style={style.body}>
        <a>
          <img
            src={arrowButton}
            style={[style.button, style.leftButton]}
            alt=""
          />
        </a> 
        <a>
          <img
            src={arrowButton}
            style={[style.button, style.rightButton]}
            alt=""
          />
        </a> 
        <EventInfo />
      </div>
    );
  }
}

export default Radium(EventDisplay);
