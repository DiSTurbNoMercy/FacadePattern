package com.FacadePattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Log in");
        System.out.print("UserName: ");

        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Authen authen = new Authen();
        authen.authenticate(userName, password);
    }
}
