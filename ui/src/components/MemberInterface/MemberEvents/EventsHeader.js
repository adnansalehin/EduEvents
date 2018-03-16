import React from 'react';

import { Link } from 'react-router-dom';
import Radium from 'radium';

var style = {

  list: {
    marginLeft: '350px',
    listStyleType: 'none',
    padding: '0',
  },

  listElement: {
    display: 'inline-block',
    paddingRight: '30px',
    fontSize: '21px',
    fontWeight: '630',
    paddingTop: '16px',
  },

  link: {
    textDecoration: 'none',
    color: 'black',
  }
}

const EventsHeader = () => {
  return (
    <div>
      <ul style={style.list}>
        <li key="1" style={style.listElement}><Link to="/memberID/my_events" style={style.link}>My Events</Link></li>
        <li key="2" style={style.listElement}><Link to="/memberID/booked_events" style={style.link}>Booked Events</Link></li>
        <li key="3" style={style.listElement}><Link to="/memberID/favourited_events" style={style.link}>Favourited Events</Link></li>
        <li key="4" style={style.listElement}><Link to="/memberID/create_events" style={style.link}>Create Event</Link></li>
      </ul> 
    </div>
  );
}

export default Radium(EventsHeader);
