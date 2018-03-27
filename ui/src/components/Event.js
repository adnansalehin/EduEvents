import React from 'react';

var style = {

  container: {
    position: 'relative',
    height: '190px',
    width: '230px',
    fontSize: '10px',
    border: 'solid 2px black',
    borderRadius: '5px 5px 5px 5px',
    display: 'inline-block',
    marginRight: '25px',
    marginBottom: '25px',
    padding: '10px',
    backgroundColor: '#3baf36'
  }
}

class Event extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div style={style.container}>
        <h5>{this.props.name}</h5>
        {this.props.description}
        Address: {this.props.address}
        Price: {this.props.price}
        Fully Booked: {this.props.fullyBooked}
      </div>
    );
  }
}

export default Event;
