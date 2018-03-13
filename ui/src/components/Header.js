import React from 'react';

import { Link } from 'react-router-dom';
import Radium from 'radium';

//The css is inline and uses a tool called Radium, which allows effective styling capabilites.
//Many powerful capabilites such as giving support for :hover, :active, :focus
var style = {

  body: {
    position: 'relative',
    margin: '0',
    top: '0px',
    width: '100%',
    height: '84px',
    backgroundColor: '#3baf36',
    overflow: 'hidden'
  },

  brandName: {
    float: 'left',
    marginLeft: '350px',
    textDecoration: 'none',
    color: 'white'
  },

  nav: {
    marginRight: '350px',
    float: 'right',
    marginTop: '-16px'
  },

  list: {
    listStyleType: 'none',
    display: 'inline-block',
    padding: '30px 18px',

    ":hover": {
      backgroundColor: 'black'
    }
  },

  listElement: {
    textDecoration: 'none',
    color: 'white',
    padding: '30px 18px',
    margin: '-30px -18px'
  }
};

//Navigation bar component with styling. This will be rendered for every route page.
//Components using the same radium style element need unique keys (e.g key="x")!
class Header extends React.Component {
  render() {
    return (
      <div style={style.body}>
        <nav>
          <Link to={"/"} style={style.brandName}><h1>EduEvents</h1></Link>
          <ul>
            <div style={style.nav}>
              <li key="1" style={style.list}><Link to={"/sign_in"} style={style.listElement}>Sign in</Link></li>
              <li key="2" style={style.list}><Link to={"/sign_up"} style={style.listElement}>Sign up</Link></li>
              <li key="3" style={style.list}><Link to={"/about"} style={style.listElement}>About</Link></li>
            </div>
          </ul>
        </nav>
      </div>
    );
  }
}

export default Radium(Header);
