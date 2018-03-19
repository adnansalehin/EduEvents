import React from 'react';

var style = {

  searchForm: {
    backgroundColor: 'lightgray',
    height: '250px',
    padding: '15px',
    border: 'solid 2px black',
    borderRadius: '0 0 10px 10px',
    
  }
}

class SearchField extends React.Component {
  render() {
    return (
      <form style={style.searchForm}>

        <div className="form-group">
          <input
            type="text"
            name="search"
            className="form-control"
            placeholder="Search event..."
          />
        </div>

        <div className="form-group">
          <button className="btn btn-primary">
            Search
          </button>
        </div>

      </form>
    );
  }
}

export default SearchField;
