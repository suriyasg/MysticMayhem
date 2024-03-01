package FactoryMethod;

import java.util.Scanner;

public class SignUp {
    public static Scanner scanner = new Scanner(System.in);
    public static User newUser = new User();
    public static void render(){

        System.out.println("Welcome To Sign Up Page!");

        System.out.print("Enter your name :");
        String name = scanner.nextLine();
        newUser.setName(name);

        System.out.print("Enter your user name (you can not reset it later) :");
        String userName = scanner.nextLine();
        while(UserProfiles.isAlreadyTaken(userName)){
            System.out.println("User name is already taken! try a different one");
            System.out.print("Enter your user name (you can not reset it later) :");
            userName = scanner.nextLine();
        }
        newUser.setUserName(userName);

    }
}
