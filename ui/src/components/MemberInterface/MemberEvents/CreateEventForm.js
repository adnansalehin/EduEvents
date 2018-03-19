import React from 'react';

var style = {

  body: {
    position: 'relative',
    top: '3%',
    marginLeft: '250px',
  },

  form: {
    position: 'relative',
    top: '30px',
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
      isValid: false
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
    console.log(this.state)
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
        <h2>Create and share your event!</h2>

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
            <label className="control-label" style={style.label}><h5>Time of event</h5></label>
            <select
              onChange={this.onChange}
              name="hour"
            >
              {this.options(23)}            
            </select>
            :
            <select
              onChange={this.onChange}
              name="minutes"
            >
              {this.options(59)}
            </select>
          </div>

          <div className="form-group">
            <label className="control-label" style={style.label}><h5>Date of event</h5></label>
            <select
              onChange={this.onChange}
              name="day"
            >
              <option value="">day</option>
              {(() => {
                var list = [];

                for (var i = 1; i <= 31; i++) {
                  if (i < 10) {
                    list.push(<option key={i} value={i}>0{i}</option>)
                  } else {
                    list.push(<option key={i} value={i}>{i}</option>)
                  }
                }

                return list;
              })()}
            </select>
            :
            <select
              onChange={this.onChange}
              name="month"
            >
              <option value="">month</option>
              {(() => {
                var list = [];

                for (var i = 1; i <= 12; i++) {
                  if (i < 10) {
                    list.push(<option key={i} value={i}>0{i}</option>)
                  } else {
                    list.push(<option key={i} value={i}>{i}</option>)
                  }
                }

                return list;
              })()}
            </select>
            :
            <select
              onChange={this.onChange}
              name="year"
            >
              <option value="">year</option>
              {(() => {
                var list = [];

                for (var i = 2018; i <= 2030; i++) {
                  list.push(<option key={i} value={i}>{i}</option>)
                }

                return list;
              })()}
            </select>
          </div>

          <div className="form-group">
            <label className="control-label" style={style.label}><h5>Location</h5></label>
            <input
              onChange={this.onChange}
              type="text"
              name="location"
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

export default CreateEventForm;
