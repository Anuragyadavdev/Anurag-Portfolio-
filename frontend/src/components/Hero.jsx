import React from 'react';

const Hero = () => {
  return (
    <header className="hero">
      <div className="hero-content">
        <h1>Hi, I'm <span className="highlight">Developer Name</span></h1>
        <p>Full-Stack Engineer building robust applications</p>
        <a href="#projects-section" className="cta-btn">See My Work</a>
      </div>
    </header>
  );
};

export default Hero;