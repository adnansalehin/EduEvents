import React from 'react';

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
    paddingTop: '16px'
  }
}

const AccountHeader = () => {
  return (
    <div>
      <ul style={style.list}>
        <li style={style.listElement}>Account Details</li>
      </ul>
    </div>
  );
}

export default AccountHeader;
