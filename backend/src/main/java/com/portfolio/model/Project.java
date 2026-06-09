package com.portfolio.model;

public class Project {
    private Long id;
    private String title;
    private String description;
    private String technologies;
    private String githubLink;

    public Project(Long id, String title, String description, String technologies, String githubLink) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.githubLink = githubLink;
    }

    // Getters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getTechnologies() { return technologies; }
    public String getGithubLink() { return githubLink; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setTechnologies(String technologies) { this.technologies = technologies; }
    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }
}