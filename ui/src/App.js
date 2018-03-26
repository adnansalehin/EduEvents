import React, {Component} from 'react';
import {
  BrowserRouter as Router,
  Route,
} from 'react-router-dom';

import Root from './components/Root';
import Home from './components/Home/Home';
import About from './components/About';
import SignIn from './components/SignIn';
import SignUp from './components/SignUp';

import MemberHome from './components/MemberInterface/MemberHome';
import MemberAccount from './components/MemberInterface/MemberAccount/MemberAccount';
import MyEvents from './components/MemberInterface/MemberEvents/MyEvents';
import BookedEvents from './components/MemberInterface/MemberEvents/BookedEvents';
import FavouritedEvents from './components/MemberInterface/MemberEvents/FavouritedEvents';
import CreateEvents from './components/MemberInterface/MemberEvents/CreateEvents';

//Components to be rendered
//Root renders a header and footer, where children can be passed as parameters.
const signUp = () => {
  return (
    <Root>
      <SignUp />
    </Root>
  );
}

const about = () => {
  return (
    <Root>
      <About />
    </Root>
  );
}

const successfulSignUp = () => {
  return (
    <Root>
      <h4>Sign up successful</h4>
    </Root>
  );
}

const failedSignUp = () => {
  return (
    <Root>
      <SignUp failed="Sign up failed!" />
    </Root>
  );
}
//---

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      username: '',
      loggedIn: false,
      search: '',
      tag: ''
    };

    this.changeUsername = this.changeUsername.bind(this);
    this.logIn = this.logIn.bind(this);
    this.setSearch = this.setSearch.bind(this);
  }

  componentDidMount() {
    console.log(this.state);
  }

  componentDidUpdate() {
    console.log(this.state);
  }

  home = () => {
    return (
      <Root>
        <Home setSearch={this.setSearch} loggedIn={this.state.loggedIn}/>
      </Root>
    );
  }

  signIn = () => {
    return (
      <Root>
        <SignIn changeUsername={this.changeUsername} username={this.state.username} logIn={this.logIn}/>
      </Root>
    );
  }

  signInFailed = () => {
    return (
      <Root>
        <SignIn changeUsername={this.changeUsername} username={this.state.username} logIn={this.logIn} failed="Sign in failed!" />
      </Root>
    );
  }

  setSearch(search, tag) {
    this.setState({
      search: search,
      tag: tag
    })
  }

  changeUsername(newUsername) {
    this.setState({
      username: newUsername
    })
  }

  logIn() {
    this.setState({
      loggedIn: true
    })
  }

  //Routing set-up
  render() {
    return (
      <Router>
        <div>
          <Route exact path="/" component={this.home} />
          <Route exact path="/sign_in" component={this.signIn} />
          <Route exact path="/sign_in_failed" component={this.signInFailed} />
          <Route exact path="/sign_up" component={signUp} />
          <Route exact path="/sign_up_successful" component={successfulSignUp} />
          <Route exact path="/sign_up_failed" component={failedSignUp} />
          <Route exact path="/about" component={about} />
          <Route exact path={"/loggedin"} component={MemberHome} />
          <Route exact path="/loggedin/account" component={MemberAccount} />
          <Route exact path="/loggedin/my_events" component={MyEvents} />
          <Route exact path="/loggedin/booked_events" component={BookedEvents} />
          <Route exact path="/loggedin/favourited_events" component={FavouritedEvents} />
          <Route exact path="/loggedin/create_events" component={CreateEvents} />
        </div>
      </Router>
    );
  }
}

export default App;
