import React, { useState } from 'react';
import axios from '../api';

const AddBookPage = () => {
  const [title, setTitle] = useState('');
  const [author, setAuthor] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post('/books', { title, author });
      // Redirect or show success message after adding the book
    } catch (error) {
      console.error("Failed to add book", error);
    }
  };

  return (
    <div>
      <h1>Add a New Book</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={title}
          onChange={(e) => setTitle(e.target.value)}
          placeholder="Book Title"
        />
        <input
          type="text"
          value={author}
          onChange={(e) => setAuthor(e.target.value)}
          placeholder="Author"
        />
        <button type="submit">Add Book</button>
      </form>
    </div>
  );
};

export default AddBookPage;
