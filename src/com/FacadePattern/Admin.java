package com.FacadePattern;

public class Admin extends  User {

    private String userRole;

    public Admin(String userName, String password, String userRole) {
        setUserName(userName);
        setPassword(password);
        this.userRole = userRole;
    }

    @Override
    public String getUserRole() {
        return this.userRole;
    }
}
