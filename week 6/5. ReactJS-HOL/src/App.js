import React from 'react';
import CohortDetails from './Components/CohortDetails';

function App() {
  return (
    <div style={{ padding: '30px' }}>
      <CohortDetails name="React Bootcamp" status="ongoing" mentor="Swastika" />
      <CohortDetails name="Java Sprint" status="completed" mentor="Amit" />
    </div>
  );
}

export default App;
