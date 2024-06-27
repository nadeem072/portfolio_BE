package com.example.spring1.profile;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Profile {
    private Basic basic;
    private List<Education> education;
    private List<Experience> experience;
    private List<Skill> skill;
    private List<Social> social;
    private List<Projects> projects;
    private List<Certifications> certifications;

    //constructor
    public Profile(Basic basic,
                   List<Education> education,
                   List<Experience> experience,
                   List<Skill> skill,
                   List<Social> social,
                   List<Projects> projects,
                   List<Certifications> certifications) {

        this.basic = basic;
        this.education = education;
        this.experience = experience;
        this.skill = skill;
        this.social = social;
        this.projects = projects;
        this.certifications = certifications;
    }

    public Profile() {
    }

    //getters and setters
    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Skill> getSkill() {
        return skill;
    }

    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }

    public List<Social> getSocial() {
        return social;
    }

    public void setSocial(List<Social> social) {
        this.social = social;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public List<Certifications> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<Certifications> certifications) {
        this.certifications = certifications;
    }
}
