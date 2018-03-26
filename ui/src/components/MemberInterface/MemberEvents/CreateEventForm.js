import React from 'react';

import { withRouter } from 'react-router-dom';

import Client from '../../../Client';

var style = {

  body: {
    position: 'relative',
    top: '3%',
    marginLeft: '250px',
  },

  form: {
    position: 'relative',
    top: '12px',
    width: '16%',
  },

  label: {
    width: '100%'
  },

  description: {
    width: '100%',
    height: '120px',
    resize: 'none',
  },

  selectList: {
    width: '75%',
    padding: '5px 10px 5px 10px',
    borderRadius: '5px',
    border: '0'
  },

  button: {
    color: 'white',
    backgroundColor: '#3baf36'
  }
}

class CreateEventForm extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      name: '',
      description: '',
      address: '',
      price: null,
      maxTickets: null
    }

    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  }

  onChange(e) {
    this.setState({
      [e.target.name]: e.target.value
    })
  }

  onSubmit(e) {
    e.preventDefault();
    var response = Client.createEvent(this.state.name, this.state.description, this.state.address, this.state.price, this.state.maxTickets, this.state.tag);
    console.log(response);
  }

  options(reps) {

    var list = [];

    for (var i = 0; i <= reps; i++) {
      if (i < 10) {
        list.push(<option key={i} value={i}>0{i}</option>)
      } else {
        list.push(<option key={i} value={i}>{i}</option>)
      }
    }

    return list;
  }

  render() {
    return (
      <div style={style.body}>
        <h3>Create and share your event!</h3>

        <form
          onSubmit={this.onSubmit}
          style={style.form}
        >

          <div className="form-group">
            <label className="control-label"><h5>Event name</h5></label>
            <input
              onChange={this.onChange}
              type="text"
              name="name"
              className="form-control"
            />
          </div>

          <div className="form-group">
            <label className="control-label" style={style.label}><h5>Describe your event!</h5></label>
            <textarea
              onChange={this.onChange}
              name="description"
              style={style.description}
              className="form-control"
            />
          </div>

          <div className="form-group">
            <label className="control-label" style={style.label}><h5>Label your event!</h5></label>
            <select
              onChange={this.onChange}
              name="tag"
              style={style.selectList}
            >
              <option>tag...</option>
              <option value="tag1">tag1</option>
              <option value="tag2">tag2</option>
            </select>
          </div>

          <div className="form-group">
            <label className="control-label" style={style.label}><h5>Address</h5></label>
            <input
              onChange={this.onChange}
              type="text"
              name="address"
              className="form-control"
            />
          </div>

          <div className="form-group">
            <label className="control-label" style={style.label}><h5>Price of ticket</h5></label>
            <input
              onChange={this.onChange}
              type="number"
              name="price"
              step="1"
              className="form-control"
            />
          </div>

          <div className="form-group">
            <label className="control-label" style={style.label}><h5>Max tickets</h5></label>
            <input
              onChange={this.onChange}
              type="number"
              name="maxTicket"
              step="1"
              className="form-control"
            />
          </div>

          <div className="form-group">
            <button
              className="btn"
              style={style.button}
            >
              Create Event
            </button>
          </div>
          

        </form>
      </div>
    );
  }
}

export default withRouter(CreateEventForm);
