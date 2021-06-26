import React from 'react';
import Carousel from '../components/Carousel/index';
import Sidebar from '../components/Sidebar';
import Header from '../components/Header';
import Footer from '../components/Footer';

function Home() {
  return (
    <div>
      <div>
        <Header />
      </div>
      <div className="main">
        <div className="panel">
          <Carousel />
        </div>
        <div className="sidebar">
          <Sidebar />
        </div>
      </div>
      <div>
        <Footer />
      </div>
    </div>

  );
}

export default Home;


