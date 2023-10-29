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
    public static void menuphone() {
        System.out.println("Telefon brendini tanlang");

            int telmodel = (new Scanner(System.in)).nextInt();
            switch (telmodel) {
                case 1:
                    Apple();
                    break;
                case 2:
                    Samsung();
                    break;
                case 3:
                    Redmi();
                    break;
                default:
            }
        }




    private static void Redmi() {

        int Redmimodel = (new Scanner(System.in)).nextInt();
        switch (Redmimodel) {
            case 1:
                Redmi_12();
                break;
            case 2:
                Redmi_Note_12();
                break;
            case 3:
                Redmi_Note_12_Pro();
                break;

            case 4:
                Xiamoi_13();
                break;

            case 5:
                Xiamoi_13_Pro();
                break;

            case 6:
                Xiamoi_13T();
                break;

            case 7:
                Xiamoi_13T_Pro();
                break;

            default:

        }

    }

    private static void Xiamoi_13T_Pro() {
    }

    private static void Xiamoi_13T() {
    }

    private static void Xiamoi_13_Pro() {
    }

    private static void Xiamoi_13() {
    }

    private static void Redmi_Note_12_Pro() {
    }

    private static void Redmi_Note_12() {

    }

    private static void Redmi_12() {
    }

    private static void Samsung() {

        int samsungmodel = (new Scanner(System.in)).nextInt();
        switch (samsungmodel) {
            case 1:
                Samsung_A04();
                break;
            case 2:
                Samsung_A14();
                break;
            case 3:
                Samsung_A34();
                break;
            case 4:
                Samsung_A54();
                break;
            case 5:
                Samsung_S23();
                break;
            case 6:
                Samsung_S23_Ultra();
                break;
            case 7:
                Samsung_Z_Fold_5();
                break;
            case 8:
                Samsung_Z_Flip_5();
                break;

            default:

        }

    }

    private static void Samsung_Z_Flip_5() {
    }

    private static void Samsung_Z_Fold_5() {
    }

    private static void Samsung_S23_Ultra() {
    }

    private static void Samsung_S23() {
    }

    private static void Samsung_A54() {
    }

    private static void Samsung_A34() {
    }

    private static void Samsung_A14() {
    }

    private static void Samsung_A04() {
    }


    private static void Apple() {

            int applemodel = (new Scanner(System.in)).nextInt();
            switch (applemodel) {
                case 1:
                    iPhone_X();
                    break;
                case 2:
                    iPhone_11();
                    break;
                case 3:
                    iPhone_11_Pro();
                    break;
                case 4:
                    iPhone_11_Pro_Max();
                    break;
                case 5:
                    iPhone_12();
                    break;
                case 6:
                    iPhone_12_Pro();
                    break;
                case 7:
                    iPhone_12_Pro_Max();
                    break;
                case 8:
                    iPhone_13();
                    break;
                case 9:
                    iPhone_13_Pro();
                    break;
                case 10:
                    iPhone_13_Pro_Max();
                    break;
                case 12:
                    iPhone_14();
                    break;
                case 13:
                    iPhone_14_Pro();
                    break;
                case 14:
                    iPhone_14_Pro_Max();
                    break;


                default:

        }

    }



    private static void iPhone_14_Pro_Max() {
    }

    private static void iPhone_14_Pro() {

    }

    private static void iPhone_14() {
    }

    private static void iPhone_13_Pro_Max() {

    }

    private static void iPhone_13_Pro() {

    }

    private static void iPhone_13() {

    }

    private static void iPhone_12_Pro_Max() {

    }

    private static void iPhone_12_Pro() {

    }

    private static void iPhone_12() {

    }

    private static void iPhone_11_Pro_Max() {

    }

    private static void iPhone_11_Pro() {
        
    }

    private static void iPhone_11() {
        
    }

    private static void iPhone_X() {}
}





