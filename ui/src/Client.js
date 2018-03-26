/* eslint-disable no-undef */
function getSummary(cb) {
  return fetch('/api/summary', {
    accept: "application/json"
  })
    .then(checkStatus)
    .then(parseJSON)
    .then(cb);
}

async function postLogin(username, password) {

  var url = "/login/" + username + "/" + password

  return fetch(url)
    .then(checkStatus)
    .then(parseJSON)
}

async function signupUser(username, password, email) {

  var url = "/signup/" + username + "/" + password + "/" + email;

  return fetch(url)
    .then(checkStatus)
    .then(parseJSON)
}

async function createEvent(name, description, address, price, maxTickets) {

  var url = "/createEvent/" + name + "/" + description + "/" + address + "/" + price + "/" + maxTickets;

  return fetch(url)
    .then(checkStatus)
    .then(parseJSON)
}

async function searchEvents(term, tags) {

  var url = "/searchEvents" + term + "/" + tags;

  return fetch(url)
    .then(checkStatus)
    .then(parseJSON)
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
const Client = { getSummary, postLogin, signupUser, createEvent, searchEvents };

export default Client;
