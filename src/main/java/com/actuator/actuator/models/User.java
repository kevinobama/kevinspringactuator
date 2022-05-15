package com.actuator.actuator.models;

public class User {
    private UserProfile userProfile;

    User() {

    }

    User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserInfo() {
        return "construction injection: user data and "+userProfile.getDetail();
    }

    public String getUserInfo1(UserProfile userProfile) {

        return "method injection:user data and "+userProfile.getDetail();
    }
}
