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
  return fetch('/login', {
    method: 'POST',
    headers: {
      'Accept': 'application.json',
      'Content-Type': 'application.json'
    },
    body: JSON.stringify({
      'username': username,
      'password': password
    })
  })
    .then(checkStatus)
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
const Client = { getSummary, postLogin };

export default Client;
