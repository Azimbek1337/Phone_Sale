package ONLINE;

import java.util.Scanner;

import static ONLINE.Main.*;

public class     Methods {


    public static void login() {
        System.out.println("Entor your phone number");
        String enterPn = (new Scanner(System.in)).next();
        boolean isInUsersExists = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(enterPn)){
                isInUsersExists = true;
                System.out.println("Enter your password");
                String enterPassword = (new Scanner(System.in)).next();
                for (int j = 0; j <Passwords.length ; j++) {
                    if(enterPassword.equals(Passwords[j]) && i==j){
                        showmenu(enterPassword);
                    }
                }
            }

        }


            if (isInUsersExists == false){
                for (int j = 0; j <Admins.length ; j++) {
                    if (Admins[j].equals(enterPn)){
                        isInUsersExists  = true;
                    }
                }
            }
            if (isInUsersExists == false){
                System.out.println( "No user");
            }
    }

    private static void showmenu(String Passwords) {
        System.out.println("Login Succesfully");
    }


    public static void register() {

    }
}





