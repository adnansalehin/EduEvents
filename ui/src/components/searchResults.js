import React from 'react';

import Event from './Event';
import SubHeader from './SubHeader';

import Client from '../Client';

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
    this.state = ({
      data: []
    })

    this.componentWillMount = this.componentWillMount.bind(this);
  }

  async componentWillMount() {

    var response = await Client.searchEvents("python", "lel");

    this.setState({
      data: response
    })
  }

  async displayEvents() {

    var response = await Client.searchEvents("python", "lel");

    return response;

  }

  //Strange interaction between this component and subheader so remade subheader in this component.
  render() {

    var list = [];

    var data = this.displayEvents();



    for (var i = 0; i < data.length; i++) {
      list.push(
        <Event name={data[i].name} />
      )
    }

    return (
      <div style={style.body}>
        <div style={style.subHeaderContainer}>
          <h4 style={style.subHeader}>Search Results</h4>
        </div>
        <div style={style.content}>
          {list}
        </div>
      </div>
    );
  }
}

export default SearchResults;
