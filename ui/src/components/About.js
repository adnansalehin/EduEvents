import React from 'react';

import SubHeader from './SubHeader';

const style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  },

  topRow: {
    marginLeft: '250px',
    marginTop: '50px',
    float:'left'
  },

  botRow: {
    clear: 'both',
    marginLeft: '250px',
    paddingTop: '40px'

  },

  box1: {
    borderRadius: '25px',
    backgroundColor: '#00CCCC',
    border: '2px solid #009999',
    width: '250px',
    height: '200px',
    float: 'left',
    padding: '20px',
    textAlign: 'center'
  },

  box2: {
    borderRadius: '25px',
    backgroundColor: '#8c1aff',
    border: '2px solid #4d0099',
    width: '250px',
    height: '200px',
    float: 'left',
    padding: '20px',
    marginLeft: '50px',
    textAlign: 'center'
  },

  box3: {
    borderRadius: '25px',
    backgroundColor: '#ff6666',
    border: '2px solid #b30000',
    width: '250px',
    height: '200px',
    float: 'left',
    padding: '20px',
    textAlign: 'center'
  },

  box4: {
    borderRadius: '25px',
    backgroundColor: '#b3ff66',
    border: '2px solid #408000',
    width: '250px',
    height: '200px',
    float: 'left',
    padding: '20px',
    marginLeft: '50px',
    textAlign: 'center'
  },

  numCircle: {
    width: '35px',
    lineHeight: '30px',
    borderRadius: '50%',
    textAlign: 'center',
    fontSize: '30px',
    border: '2px solid black'
  }
}

const About = () => {
  return (
    <div style={style.body}>
      <SubHeader subheader="About" />
      <div style={style.topRow}>
        <div style={style.box1}>
          <div style={style.numCircle}>1</div>
          <h4>BROWSE</h4>
          <div>Search for events!</div>
        </div>
        <div style={style.box2}>
          <div style={style.numCircle}>2</div>
          <h4>BOOK</h4>
          <div>Book an event!</div>
        </div>
      </div>
      <div style={style.botRow}>

        <div style={style.box3}>
          <div style={style.numCircle}>1</div>
          <h4>CREATE</h4>
          <div>Create an event!</div>
        </div>
        <div style={style.box4}>
          <div style={style.numCircle}>2</div>
          <h4>ADD DETAILS</h4>
          <div>Add in all the event details!</div>
        </div>
      </div>
    </div>
  );
}

export default About;
