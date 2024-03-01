package FactoryMethod;

import java.util.ArrayList;

public class UserProfiles {
    private static ArrayList<String> userNames = new ArrayList<>(); // need to be loaded from local

    public static ArrayList<String> getUserNames() {
        return userNames;
    }

    public static void addUserName(String userName) {
        userNames.add(userName);
    }
    public static boolean isAlreadyTaken(String userName) {
        return userNames.contains(userName);
    }
    
    
}
