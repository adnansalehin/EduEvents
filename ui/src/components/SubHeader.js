import React from 'react';

const style = {

  subHeaderContainer: {
    backgroundColor: '#999999',
    height: '100px',
  },

  subHeader: {
    color: 'white',
    position: 'relative',
    marginLeft: '350px',
    top: '32%'
  }
}

const SubHeader = (props) => {
  return (
    <div style={style.subHeaderContainer}>
      <h4 style={style.subHeader}>{props.subheader}</h4>
    </div>
  );
}

export default SubHeader;
