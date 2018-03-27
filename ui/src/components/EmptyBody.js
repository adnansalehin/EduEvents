import React from 'react';

var style = {

  body: {
    position: 'relative',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  }
}

const EmptyBody = ({ children }) => {
  return (
    <div style={style.body}>
      {children}
    </div>
  );
}

export default EmptyBody;
