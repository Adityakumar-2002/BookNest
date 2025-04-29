import React, { useEffect, useState } from 'react';
import axios from '../api';

const WishlistPage = () => {
  const [wishlist, setWishlist] = useState([]);

  useEffect(() => {
    const fetchWishlist = async () => {
      try {
        const response = await axios.get('/wishlist');
        setWishlist(response.data);
      } catch (error) {
        console.error("Error fetching wishlist", error);
      }
    };
    fetchWishlist();
  }, []);

  return (
    <div>
      <h1>Your Wishlist</h1>
      <ul>
        {wishlist.map(book => (
          <li key={book.id}>{book.title}</li>
        ))}
      </ul>
    </div>
  );
};

export default WishlistPage;
