package com.example.spring1.profile;

import org.springframework.stereotype.Component;

@Component
public class Projects {
    private String nameOfTheProject;
    private String projectDescription;
    private String githubLink;
    private String deploymentLink;

    //constructor
    public Projects(String nameOfTheProject,
                    String projectDescription,
                    String githubLink,
                    String deploymentLink) {
        this.nameOfTheProject = nameOfTheProject;
        this.projectDescription = projectDescription;
        this.githubLink = githubLink;
        this.deploymentLink = deploymentLink;
    }

    public Projects() {
    }

    //getters and setters
    public String getNameOfTheProject() {
        return nameOfTheProject;
    }

    public void setNameOfTheProject(String nameOfTheProject) {
        this.nameOfTheProject = nameOfTheProject;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public String getDeploymentLink() {
        return deploymentLink;
    }

    public void setDeploymentLink(String deploymentLink) {
        this.deploymentLink = deploymentLink;
    }
}
