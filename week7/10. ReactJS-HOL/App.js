import React from 'react';

function App() {
  // Object: Single office details
  const office = {
    name: "Elite Co-Work Hub",
    rent: 55000,
    address: "123, MG Road, Bengaluru"
  };

  // Array of offices
  const officeSpaces = [
    { name: "Prime Spaces", rent: 75000, address: "Koramangala, Bengaluru" },
    { name: "Budget Desk", rent: 45000, address: "BTM Layout, Bengaluru" },
    { name: "Urban Office", rent: 90000, address: "Indiranagar, Bengaluru" },
    { name: "Smart Space", rent: 60000, address: "Whitefield, Bengaluru" }
  ];

  // JSX Style
  const headingStyle = {
    fontSize: '28px',
    fontWeight: 'bold',
    marginBottom: '20px'
  };

  const imageStyle = {
    width: '400px',
    height: '250px',
    objectFit: 'cover',
    marginBottom: '20px'
  };

  const getRentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div className="App" style={{ padding: '20px', fontFamily: 'Arial' }}>
      {/* JSX Heading */}
      <h1 style={headingStyle}>Office Space Rental App</h1>

      {/* JSX Attribute - image */}
      <img
        style={imageStyle}
        src="https://images.unsplash.com/photo-1573164574396-9d4a08e813d6"
        alt="Office Space"
      />

      {/* JSX Object Rendering */}
      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Address:</strong> {office.address}</p>
      <p><strong>Rent:</strong> <span style={getRentStyle(office.rent)}>₹{office.rent}</span></p>

      {/* JSX List Rendering */}
      <h2>All Available Spaces</h2>
      {officeSpaces.map((space, index) => (
        <div key={index} style={{ marginBottom: '15px' }}>
          <p><strong>Name:</strong> {space.name}</p>
          <p><strong>Address:</strong> {space.address}</p>
          <p><strong>Rent:</strong> <span style={getRentStyle(space.rent)}>₹{space.rent}</span></p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;
