package com.FacadePattern;

public class Authen {

    public void authenticate(String userName, String password) {
        ServerData sb = new AppServerData("sb.txt");
        User user = sb.search(userName);
        if(user != null) {
            if (String.valueOf(password.hashCode()).equals(user.getPasswordHashCode())) {
                System.out.println("Come back " + user.getUserName().substring(0, 1).toUpperCase()
                    + user.getUserName().substring(1) + "!");
                System.out.println("You're logged in as " + user.getUserRole());
            } else {
                System.out.println("Error, Wrong password");
            }
        } else {
            System.out.println("Not found user");
        }
    }
}
