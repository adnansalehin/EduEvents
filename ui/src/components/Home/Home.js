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
    backgroundSize: '170%',
    width: '100%',
    height: '110vh',
    marginRight: '250px',

  },

  featuredContainer: {
    position: 'relative',
    top: '8%',
    margin: '0'
  },

  featuredHeader: {
    margin: '0',
    marginLeft: '250px',
    backgroundColor: '#3baf36',
    textShadow: '2px 2px gray',
    width: '312px',
    padding: '10px',
    borderRadius: '10px 10px 0 0',
    border: 'solid 2px black',
  },

  searchContainer: {
    position: 'absolute',
    right: '250px',
    top: '180px',
    margin: '0'
  },

  searchHeader: {
    marginTop: '100px',
    backgroundColor: '#3baf36',
    textShadow: '2px 2px gray',
    padding: '10px',
    borderRadius: '10px 10px 0 0',
    border: 'solid 2px black',
    margin: '0'
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
        <div style={style.featuredContainer}>
          <h1 style={style.featuredHeader}>Featured Events</h1>
          <EventDisplay />
        </div>
        <div style={style.searchContainer}>
          <h3 style={style.searchHeader}>Search for event</h3>
          <SearchField setSearch={this.props.setSearch} loggedIn={this.props.loggedIn} />
        </div>
      </div>
    );
  }
}

export default Home;
