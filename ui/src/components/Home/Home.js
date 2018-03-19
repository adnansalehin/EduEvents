import React from 'react';

import SubHeader from '../SubHeader';
import EventDisplay from './EventDisplay';
import SearchField from './SearchField';

import backgroundPicture from '../../res/eeBackground.png';

const style = {

  body: {
    position: 'relative',
    backgroundImage: 'url(' + backgroundPicture + ')',
    backgroundPosition: 'center',
    backgroundRepeat: 'no-repeat',
    backgroundSize: '155%',
    width: '100%',
    height: '100vh',
  },

  featuredContainer: {
    position: 'relative',
    top: '8%',
  },

  featuredHeader: {
    marginLeft: '350px',
    backgroundColor: '#3baf36',
    textShadow: '2px 2px gray',
    width: '312px',
    padding: '10px',
    borderRadius: '10px 10px 0 0',
    border: 'solid 2px black',
    marginBottom: '0',
  },

  searchContainer: {
    position: 'relative',
    top: '-435px',
    float: 'right',
    marginRight: '350px',
  },

  searchHeader: {
    backgroundColor: '#3baf36',
    textShadow: '2px 2px gray',
    padding: '10px',
    borderRadius: '10px 10px 0 0',
    border: 'solid 2px black',
    marginBottom: '0'
  }
}

class Home extends React.Component {
  render() {
    return (
      <div style={style.body}>
        <SubHeader subheader="A tool for easier learning" />
        <div style={style.featuredContainer}>
          <h1 style={style.featuredHeader}>Featured Events</h1>
          <EventDisplay />
        </div>
        <div style={style.searchContainer}>
          <h3 style={style.searchHeader}>Search for event</h3>
          <SearchField />
        </div>
      </div>
    );
  }
}

export default Home;
