import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [view, setView] = useState("book");

  // 1. Element variable
  let component;
  if (view === "book") {
    component = <BookDetails />;
  } else if (view === "blog") {
    component = <BlogDetails />;
  } else {
    component = <CourseDetails />;
  }

  return (
    <div style={{ padding: "20px" }}>
      <h1>Blogger App</h1>

      {/* Buttons to change view */}
      <button onClick={() => setView("book")}>Book Details</button>{' '}
      <button onClick={() => setView("blog")}>Blog Details</button>{' '}
      <button onClick={() => setView("course")}>Course Details</button>

      <hr />

      {/* 2. Conditional with variable */}
      {component}

      <hr />

      {/* 3. Ternary Operator */}
      <div>
        {view === "book" ? <p>Currently viewing: Books</p> : view === "blog" ? <p>Currently viewing: Blogs</p> : <p>Currently viewing: Courses</p>}
      </div>

      {/* 4. Logical AND rendering */}
      {view === "book" && <p>You chose Book Details using && operator</p>}
    </div>
  );
}

export default App;
