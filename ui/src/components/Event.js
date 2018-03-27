import React from 'react';

import { Link } from 'react-router-dom';

import Client from '../Client';

var style = {

  container: {
    position: 'relative',
    height: '160px',
    width: '230px',
    fontSize: '12px',
    fontWeight: 'bold',
    border: 'solid 2px black',
    borderRadius: '5px 5px 5px 5px',
    display: 'inline-block',
    marginRight: '100%',
    marginBottom: '25px',
    padding: '10px',
    backgroundColor: '#3baf36',
    color: 'white'
  },

  name: {
    textDecoration: 'underline'
  },
}

class Event extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    if (this.props.loggedIn) {
      return (
        <Link to="/">
          <div style={style.container}>
            <div style={style.element}>
              <h5 style={style.name}>{this.props.name}</h5>
            </div>
            <div>
              {this.props.description}
            </div>
            <div>
              Address: {this.props.address}
            </div>
            <div>
              Price: {this.props.price}
            </div>
          </div>
        </Link>
      );
    } else {
      return (
          <div style={style.container}>
            <div style={style.element}>
              <h5 style={style.name}>{this.props.name}</h5>
            </div>
            <div>
              {this.props.description}
            </div>
            <div>
              Address: {this.props.address}
            </div>
            <div>
              Price: {this.props.price}
            </div>
          </div>
      );
    }
  }
}

export default Event;
