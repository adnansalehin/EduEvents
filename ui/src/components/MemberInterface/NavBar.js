import React from 'react';

var style = {

  body: {
    position: 'relative',
    backgroundColor: '#999999',
    width: '100%',
    height: '70px'
  }
}

//Navigation bar for my accounts and my events pages.
//Takes a child component, which would be the elements in the nav bar.
const NavBar = ({ children }) => {
  return (
    <div style={style.body}>
      {children}
    </div>
  );
}

export default NavBar;
