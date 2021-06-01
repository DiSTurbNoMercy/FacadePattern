package com.FacadePattern;

public abstract class User {

    private String userName;
    private String password;

    public abstract String getUserRole();

    public String getPasswordHashCode() {
        return String.valueOf(password.hashCode());
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
