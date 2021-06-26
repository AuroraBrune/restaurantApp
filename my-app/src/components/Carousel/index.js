import React from 'react';
import { Carousel } from 'react-responsive-carousel';
import "react-responsive-carousel/lib/styles/carousel.min.css";
import './style.css';
import img1 from '../../assets/img/img1.jpg';
import img2 from '../../assets/img/img2.jpg';
import img3 from '../../assets/img/img3.jpg';

export default function CarouselComponent() {
  return (
    <div className="carousel-wrapper">
      <Carousel>
        <div>
          <img src={img1} alt="" className="image"/>
          <p className="legend">Legend 1</p>
        </div>
        <div>
          <img src={img2} alt="" className="image"/>
          <p className="legend">Legend 2</p>
        </div>
        <div>
          <img src={img3} alt="" className="image"/>
          <p className="legend">Legend 3</p>
        </div>
      </Carousel>
    </div>
  );
}

