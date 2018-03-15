import React, {Component} from 'react';
import {
  BrowserRouter as Router,
  Route,
  Link,
  browserHistory
} from 'react-router-dom';

import Root from './components/Root';
import Home from './components/Home/Home';
import About from './components/About';
import SignIn from './components/SignIn';
import SignUp from './components/SignUp';

import MemberHome from './components/MemberInterface/MemberHome';
import MemberAccount from './components/MemberInterface/MemberAccount/MemberAccount';

//Components to be rendered
//Root renders a header and footer, where children can be passed as parameters.
const home = () => {
  return (
    <Root>
      <Home />
    </Root>
  );
}

const signIn = () => {
  return (
    <Root>
      <SignIn />
    </Root>
  );
}

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
//---

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      
    };
  }

  //Routing set-up
  render() {
    return (
      <Router>
        <div>
          <Route exact path="/" component={home} />
          <Route exact path="/sign_in" component={signIn} />
          <Route exact path="/sign_up" component={signUp} />
          <Route exact path="/about" component={about} />
          <Route exact path="/memberID" component={MemberHome} />
          <Route exact path="/memberID/account" component={MemberAccount} />
        </div>
      </Router>
    );
  }
}

export default App;
