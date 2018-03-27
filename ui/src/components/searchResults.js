import React from 'react';

import { withRouter } from 'react-router-dom';

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

    var response = await Client.searchEvents(this.props.search, null);

    this.setState({
      data: response
    })
   
  }

  //Strange interaction between this component and subheader so remade subheader in this component.
  render() {
    try {
      var list = [];

      var event = [];

      console.log(this.state.data[0])

      for (var i = 0; i < this.state.data.length; i++) {
        event = this.state.data[i];
        list.push(
          <Event name={event.name} description={event.description} address={event.address} price={event.price} maxTickets={event.maxTickets} loggedIn={this.props.loggedIn} />
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
    } catch (e) {
      if (this.props.loggedIn) {
        this.props.history.push("/loggedIn/nothing_found_search");
      } else {
        this.props.history.push("/nothing_found_search");
      }
    }
    }
}

export default withRouter(SearchResults);
