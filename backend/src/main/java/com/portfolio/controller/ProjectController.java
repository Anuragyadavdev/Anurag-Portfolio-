package com.portfolio.controller;

import com.portfolio.model.Project;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:5173") 
public class ProjectController {

    @GetMapping
    public List<Project> getProjects() {
        return Arrays.asList(
            new Project(
                1L, 
                "uApply - Job Recommendation System", 
                "An intelligent backend system designed to match resumes to jobs seamlessly using advanced filter algorithms.", 
                "Python, Flask, Machine Learning, REST APIs", 
                "https://github.com"
            ),
            new Project(
                2L, 
                "SmartSIM AI Assistant", 
                "An AI-driven helper application built as a core college project to simulate telecom asset workflows.", 
                "Java, Spring Boot, OpenAI API, React", 
                "https://github.com"
            )
        );
    }
}