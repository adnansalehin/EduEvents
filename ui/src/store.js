import { createStore, applyMiddleware } from 'redux';
import logger from 'redux-logger';

import member from './reducers/memberReducer';

export default createStore(
  member,
  applyMiddleware(logger)
);
