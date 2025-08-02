import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 40 },
    { name: "Rahul", score: 75 },
    { name: "Shreyas", score: 65 },
    { name: "Gill", score: 90 },
    { name: "Hardik", score: 60 },
    { name: "Jadeja", score: 72 },
    { name: "Pant", score: 68 },
    { name: "Bumrah", score: 35 },
    { name: "Shami", score: 55 },
    { name: "Siraj", score: 80 },
  ];

  // Filter players with scores below 70 using ES6 arrow function
  const filteredPlayers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>All Players (Using map)</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h2>Filtered Players (Score below 70)</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
