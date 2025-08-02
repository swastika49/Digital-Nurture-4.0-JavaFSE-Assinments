import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Element variable for rendering conditionally
  let content;
  if (isLoggedIn) {
    content = <UserPage />;
  } else {
    content = <GuestPage />;
  }

  return (
    <div style={{ padding: "20px" }}>
      <h1>Flight Ticket Booking App</h1>

      {/* Conditional rendering using element variable */}
      {content}

      {/* Login/Logout button toggling */}
      <button onClick={() => setIsLoggedIn(!isLoggedIn)} style={{ marginTop: "20px" }}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>
    </div>
  );
}

export default App;
