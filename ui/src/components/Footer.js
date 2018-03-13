import React from 'react';

const style = {

  body: {
    position: 'relative',
    bottom: '0px',
    height: '60px',
    width: '100%',
    backgroundColor: 'black'
  },

  footer: {
    color: 'white',
    float: 'right',
    marginRight: '350px'
  }
}

const Footer = () => {
  return (
    <div style={style.body}>
      <h6 style={style.footer}>Footer</h6>
    </div>
  );
}

export default Footer;
