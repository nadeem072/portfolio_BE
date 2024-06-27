package com.example.spring1.profile;

import org.springframework.stereotype.Component;

@Component
public class Social {
    private String nameOfPlatform;
    private String linkOfProfile;

    public Social(String nameOfPlatform,
                  String linkOfProfile) {
        this.nameOfPlatform = nameOfPlatform;
        this.linkOfProfile = linkOfProfile;
    }

    public Social() {
    }

    public String getNameOfPlatform() {
        return nameOfPlatform;
    }

    public void setNameOfPlatform(String nameOfPlatform) {
        this.nameOfPlatform = nameOfPlatform;
    }

    public String getLinkOfProfile() {
        return linkOfProfile;
    }

    public void setLinkOfProfile(String linkOfProfile) {
        this.linkOfProfile = linkOfProfile;
    }
}
