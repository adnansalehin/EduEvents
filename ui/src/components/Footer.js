import React from 'react';

import { Link } from 'react-router-dom';
import Radium from 'radium';

const style = {

  body: {
    position: 'relative',
    bottom: '0px',
    height: '120px',
    width: '100%',
    backgroundColor: '#000000'
  },

  footer: {
    marginLeft: '500px',
    paddingTop: '40px'
  },

  list: {
    display: 'inline',
    color: '#0b9d00',
    fontSize: '17px'
  },

  listElement: {
    color: '#ffffff'
  },

  copyright: {
    color: '#b3b3b3',
    fontSize: '11px',
    display: 'inline-block',
    margin: '0 0 0 50px'
  },

  logo: {
    float: 'left',
    color: '#ffffff',
    fontSize: '25px'
  }

}

class Footer extends React.Component {
  render() {
    return (
      <div style={style.body}>
        <div style={style.footer}>
          <ul>
            <li key="1" style={style.list}><Link to={this.props.element1Link} style={style.listElement}>{this.props.element1}</Link> | </li>
            <li key="2" style={style.list}><Link to={this.props.element2Link} style={style.listElement}>{this.props.element2}</Link> | </li>
            <li key="3" style={style.list}><Link to={this.props.element3Link} style={style.listElement}>{this.props.element3}</Link></li>
          </ul>
          <div style={style.logo}>EduEvents</div>
          <div style={style.copyright}>Copyright 2018</div>
        </div>

      </div>
    );
  }
}

export default Radium(Footer);
