package com.FacadePattern;

public class MainUser extends User {
    private String userRole;

    MainUser(String userName, String password, String userRole) {
        setUserName(userName);
        setPassword(password);
        this.userRole = userRole;
    }

    @Override
    public String getUserRole() {
        return this.userRole;
    }
}
