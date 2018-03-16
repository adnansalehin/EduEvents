import React from 'react';

var style = {

  body: {
    position: 'relative',
    margin: '0 auto',
    backgroundColor: 'lightgray',
    width: '100%',
    height: '100vh'
  },

  list: {
    listStyleType: 'none',
    marginLeft: '350px',
    padding: '0'
  },

  button: {
    fontSize: '15px',
    fontWeight: '600'
  }
}

class AccountDetails extends React.Component {

  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div style={style.body}>
        <ul style={style.list}>
          <li>
            <li>Email</li>
            <li>{this.props.email}</li>
          </li>
          <li>
            <li>Full name</li>
            <li>{this.props.fullname}</li>
          </li>
          <li>
            <li>Username</li>
            <li>{this.props.username}</li>
          </li>
          <li><button style={style.button}>Change password</button></li>
        </ul>
      </div>
    );
  }
}

export default AccountDetails;
