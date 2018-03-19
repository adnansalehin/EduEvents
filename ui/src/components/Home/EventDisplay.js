import React from 'react';
import Radium from 'radium';

import EventInfo from './EventInfo';

import arrowButton from '../../res/arrowButton.png';

const style = {

  body: {
    backgroundColor: 'lightgray',
    marginLeft: '350px',
    width: '750px',
    height: '450px',
    borderRadius: '0 10px 10px 10px',
    border: '3px solid black'
  },

  button: {
    marginTop: '200px',
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
          <img src={arrowButton} style={[style.button, style.leftButton]} />
        </a> 
        <a>
          <img src={arrowButton} style={[style.button, style.rightButton]} />
        </a> 
        <EventInfo />
      </div>
    );
  }
}

export default Radium(EventDisplay);
