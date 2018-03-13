import React from 'react';

import SubHeader from '../SubHeader';
import EventDisplay from './EventDisplay';

const style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  }
}

class Home extends React.Component {

  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div style={style.body}>
        <SubHeader subheader="A tool for easier learning" />
        <EventDisplay />
      </div>
    );
  }
}

export default Home;
