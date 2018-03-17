const memberReducer = (state = {
  id: null,
  info: [
    {
      firstName: null,
      lastName: null,
      email: null,
      password: null
    }
  ]
}, action) => {
  switch (action.type) {
    case "CREATE_USER":
      return [
        ...state,
        {
          id: action.id,
          info:
          {
            firstName: action.firstName,
            lastName: action.lastName,
            email: action.email,
            password: action.password
          }
        }
      ]
    default:
      break;
  }
  return state;
};

export default memberReducer;
