package com.example.spring1.profile;

import org.springframework.stereotype.Component;

@Component
public class Skill {
    private String skillName;

    //constructor
    public Skill(String skillName) {
        this.skillName = skillName;
    }

    public Skill() {
    }

    //getters and setters
    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
