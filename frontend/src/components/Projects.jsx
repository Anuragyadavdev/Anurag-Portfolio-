import React, { useState, useEffect } from 'react';

const Projects = () => {
  const [projects, setProjects] = useState([]);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch('http://localhost:8080/api/projects')
      .then(res => {
        if (!res.ok) throw new Error('Network response failure');
        return res.json();
      })
      .then(data => setProjects(data))
      .catch(err => setError(err.message));
  }, []);

  return (
    <section className="projects-container">
      <h2>Projects Pipeline</h2>
      {error && <p className="error-msg">Backend connection issue: {error}</p>}
      <div className="projects-grid">
        {projects.map(proj => (
          <div key={proj.id} className="project-card">
            <h3>{proj.title}</h3>
            <p>{proj.description}</p>
            <span className="tech-tag">{proj.technologies}</span>
            <a href={proj.githubLink} target="_blank" rel="noreferrer" className="code-link">Source Code</a>
          </div>
        ))}
      </div>
    </section>
  );
};

export default Projects;