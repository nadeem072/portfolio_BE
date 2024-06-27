package com.example.spring1.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private ProfileHelper profileHelper;
    @Autowired
    public ProfileService(ProfileHelper profileHelper) {
        this.profileHelper = profileHelper;
    }

    public ProfileService() {
    }

    public List<Profile> getProfileService(){
        return profileHelper.getProfileHelper();
    }
}
