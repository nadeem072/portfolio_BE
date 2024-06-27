package com.example.spring1.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProfileHelper {

    public List<Profile> getProfileHelper(){

        List<Profile> profileList = new ArrayList<>();
        Profile profile = new Profile();

        //this is basic
        Basic basic = new Basic();
        basic.setContact("7019370291");
        basic.setDescription("this is description");
        basic.setEmail("nadeemahmed0270@gamil.com");
        basic.setFirstName("Nadeem");
        basic.setLastName("Ahmed");
        basic.setFullName("Nadeem Ahmed");

        profile.setBasic(basic);


        //certifications
        List<Certifications> certificationsList = new ArrayList<>();
        Certifications certifications = new Certifications();
        certifications.setNumberOfCertificate("1111");
        certifications.setDateOfIssue(LocalDate.of(2023, 3,22));
        certifications.setNameOfIssuer("demo issuer");
        certifications.setNameOfTheCertification("demo certificate");
        certificationsList.add(certifications);

        profile.setCertifications(certificationsList);

        //Eduction
        List<Education> educationList = new ArrayList<>();
        Education education = new Education();
        education.setModeOfStudy("full Time");
        education.setNameOfCourse("Bachelor of engineering");
        education.setSpecification("electronics and communication");
        education.setYearOfPassing(LocalDate.of(2021, 6,21));
        education.setNameOfInstitution("kalpataru Institute Of Technology");
        educationList.add(education);

        profile.setEducation(educationList);


        //experience
        List<Experience> experienceList = new ArrayList<>();
        Experience experience = new Experience();
        experience.setDateOfJoining(LocalDate.of(2021,11,22));
        experience.setDesignation("Senior Systems Engineer");
        experience.setNameOfOrg("Infosys ltd");
        experience.setDateOfRelieving(LocalDate.of(2024,8,13));
        experienceList.add(experience);

        profile.setExperience(experienceList);

        //Projects
        List<Projects> projectsList = new ArrayList<>();
        Projects projects = new Projects();
        projects.setProjectDescription("sample description");
        projects.setDeploymentLink("sample Deployment link");
        projects.setNameOfTheProject("portfolio");
        projects.setGithubLink("sample github link");
        projectsList.add(projects);

        profile.setProjects(projectsList);

        // skills
        List<Skill> skillList = new ArrayList<>();
        Skill skill1 = new Skill();
        skill1.setSkillName("Java");
        skillList.add(skill1);
        Skill skill2 = new Skill();
        skill2.setSkillName("Spring Boot");
        skillList.add(skill2);
        Skill skill3 = new Skill();
        skill3.setSkillName("React JS");
        skillList.add(skill3);
        Skill skill4 = new Skill();
        skill4.setSkillName("java script");
        skillList.add(skill4);
        Skill skill5 = new Skill();
        skill5.setSkillName("HTML");
        skillList.add(skill5);
        Skill skill6 = new Skill();
        skill6.setSkillName("CSS");
        skillList.add(skill6);

        profile.setSkill(skillList);

        //Social
        List<Social> socialList = new ArrayList<>();
        Social social1 = new Social();
        social1.setNameOfPlatform("twitter");
        social1.setLinkOfProfile("sample Twitter profile");
        socialList.add(social1);
        Social social2 = new Social();
        social2.setNameOfPlatform("LinkedIn");
        social2.setLinkOfProfile("sample LinkedIn profile");
        socialList.add(social2);

        profile.setSocial(socialList);

        profileList.add(profile);
        return profileList;
    }
}
