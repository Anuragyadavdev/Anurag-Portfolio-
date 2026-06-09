import React from 'react';
import Hero from './components/Hero';
import Projects from './components/Projects';
import './App.css';

function App() {
  return (
    <div className="portfolio-app">
      <Hero />
      <main id="projects-section">
        <Projects />
      </main>
    </div>
  );
}

export default App;