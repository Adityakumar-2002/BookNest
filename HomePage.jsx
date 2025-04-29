import React, { useEffect, useState } from 'react';
import axios from '../api'; // We'll create this file next

const HomePage = () => {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    const fetchBooks = async () => {
      try {
        const response = await axios.get('/books');
        setBooks(response.data);
      } catch (error) {
        console.error("Error fetching books", error);
      }
    };
    fetchBooks();
  }, []);

  return (
    <div>
      <h1>Book List</h1>
      <ul>
        {books.map(book => (
          <li key={book.id}>{book.title}</li>
        ))}
      </ul>
    </div>
  );
};

export default HomePage;
