/* eslint-disable no-undef */
function getSummary(cb) {
  return fetch('/api/summary', {
    accept: "application/json"
  })
    .then(checkStatus)
    .then(parseJSON)
    .then(cb);
}

//Post login information
//TO-DO define url
function postLogin(username, password) {

  var url = "/login/" + username + "/" + password

  return fetch(url)
    .then(checkStatus)
}

//Test function
function testLogin() {
  return fetch('/testLogin')
    .then(checkStatus)
    .then(parseJSON);
}

function checkStatus(response) {
  if (response.status >= 200 && response.status < 300) {
    return response;
  }
  const error = new Error(`HTTP Error ${response.statusText}`);
  error.status = response.statusText;
  error.response = response;
  console.log(error); // eslint-disable-line no-console
  throw error;
}

function parseJSON(response) {
  return response.json();
}

//Exported variable
//Define the methods that components need access to.
const Client = { getSummary, postLogin, testLogin };

export default Client;
