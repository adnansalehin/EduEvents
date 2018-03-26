import React from 'react';

import { withRouter } from 'react-router-dom';

var style = {

  searchForm: {
    backgroundColor: 'lightgray',
    height: '180px',
    padding: '15px',
    border: 'solid 2px black',
    borderRadius: '0 0 10px 10px',
  },

  selectList: {
    position: 'relative',
    width: '75%',
    marginLeft: '100%',
    float: 'right',
    marginBottom: '10%',
    padding: '5px 10px 5px 10px',
    borderRadius: '5px',
    border: '0'
  },

  searchButton: {
    position: 'relative',
    float: 'right',
    width: '50%',
    backgroundColor: '#3baf36',
    color: 'white'
  }
}

class SearchField extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      search: '',
      tag: ''
    };

    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  };

  onChange(e) {
    this.setState({
      [e.target.name]: e.target.value
    })
    console.log(this.state.tag);
  }

  async onSubmit(e) {
    e.preventDefault();
    console.log(this.state);
    this.props.setSearch(this.state.search, this.state.tag);
    if (this.props.loggedIn) {
      this.props.history.push("/loggedIn/search_results");
    } else {
      this.props.history.push("/search_results");
    }
  }

  render() {
    return (
      <form onSubmit={this.onSubmit} style={style.searchForm}>

        <div className="form-group">
          <input
            onChange={this.onChange}
            value={this.state.search}
            type="text"
            name="search"
            className="form-control"
            placeholder="Search event..."
          />
        </div>

        <div className="form-group">
          <select
            onChange={this.onChange}
            name="tag"
            style={style.selectList}
          >
            <option value="">tag...</option>
            <option value="tag1">tag1</option>
            <option value="tag2">tag2</option>
          </select>
        </div>

        <div className="form-group">
          <button className="btn" style={style.searchButton}>
            Search
          </button>
        </div>

      </form>
    );
  }
}

export default withRouter(SearchField);
