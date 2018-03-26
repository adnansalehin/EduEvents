import React from 'react';

import Event from './Event';
import SubHeader from './SubHeader';

var style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  },

  subHeaderContainer: {
    backgroundColor: '#999999',
    height: '100px',
  },

  subHeader: {
    color: 'white',
    position: 'relative',
    marginLeft: '250px',
    top: '32%'
  },

  content: {
    position: 'relative',
    marginLeft: '250px',
    marginRight: '250px',
    top: '2%'
  },

  inlineBlock: {
    display: 'inline-block',
    marginRight: '25px',
    marginBottom: '25px'
  }
}

class SearchResults extends React.Component {

  constructor(props) {
    super(props);

    this.displayEvents = this.displayEvents.bind(this);
  }

  component() {
    return (
      <div style={style.inlineBlock}>
        Events
      </div>
    );
  }

  displayEvents() {
    var list = [];

    //api call

    for (var i = 0; i < 20; i++){
      list.push(this.component());
    }

    return list;
  }

  //Strange interaction between this component and subheader so remade subheader in this component.
  render() {
    return (
      <div style={style.body}>
        <div style={style.subHeaderContainer}>
          <h4 style={style.subHeader}>Search Results</h4>
        </div>
        <div style={style.content}>
          {this.displayEvents()}
        </div>
      </div>
    );
  }
}

export default SearchResults;
