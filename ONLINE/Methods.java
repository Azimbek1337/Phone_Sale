package ONLINE;

import java.util.Scanner;

import static ONLINE.ConstantTil.*;
import static ONLINE.Main.*;

public class     Methods {


    public static void login() {
        System.out.println(til == 'e'
                ? LOGIN_MESSAGE_EN
                : til == 'r'
                ? LOGIN_MESSAGE_RU
                : LOGIN_MESSAGE_UZ);
        String enterPn = (new Scanner(System.in)).next();
        boolean isInUsersExists = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(enterPn)) {
                isInUsersExists = true;
                System.out.println(til == 'e'
                        ? LOGIN_PASSWORD_EN
                        : til == 'r'
                        ? LOGIN_PASSWORD_RU
                        : LOGIN_PASSWORD_UZ);
                String enterPassword = (new Scanner(System.in)).next();
                for (int j = 0; j < Passwords.length; j++) {
                    if (enterPassword.equals(Passwords[j]) && i == j) {
                        Methods.menuphone();
                    }
                }
            }

        }


        if (isInUsersExists == false) {
            for (int i = 0; i < Admins.length; i++) {
                if (Admins[i].equals(enterPn)) {
                    isInUsersExists = true;
                    System.out.println();
                    String enterPassword = (new Scanner(System.in)).next();
                    for (int j = 0; j < adminPasswords.length; j++) {
                        if (enterPassword.equals(adminPasswords[j]) && i == j) {
                            showmenuForAdmins(enterPassword);
                        }
                    }
                }
            }
        }
        if (isInUsersExists == false) {
            System.out.println(til == 'e'
                    ? LOGIN_ERROR_EN
                    : til == 'r'
                    ? LOGIN_ERROR_RU
                    : LOGIN_ERROR_UZ);
        }
    }

    private static void showmenuForAdmins(String enterPassword) {
        System.out.println("Admin menu");
    }
//


    public static void register() {
        System.out.println(til == 'e'
                ? REGISTER_MESSAGE_EN
                : til == 'r'
                ? REGISTER_MESSAGE_RU
                : REGISTER_MESSAGE_UZ);
        String enteredPN = (new Scanner(System.in)).next();
        int sentcode = (int) (Math.random() * 10000);
        System.out.println(til == 'e'
                ? CODE_EN
                : til == 'r'
                ? CODE_RU
                : CODE_UZ );
        System.out.println( sentcode);
        int enteredCode = (new Scanner(System.in)).nextInt();
        if (enteredCode == sentcode) {
            String[] newUsers = new String[users.length + 1];
            for (int i = 0; i < users.length; i++) {
                newUsers[i] = users[i];
            }
            newUsers[newUsers.length - 1] = enteredPN;
            users = newUsers;

            System.out.println(til == 'e'
                    ? REGISTER_PASSWORD_EN
                    : til == 'r'
                    ? REGISTER_PASSWORD_RU
                    : REGISTER_PASSWORD_UZ);
            String enteredPassword = (new Scanner(System.in)).next();
            String[] newUsersPS = new String[Passwords.length + 1];
            for (int i = 0; i < Passwords.length; i++) {
                newUsersPS[i] = Passwords[i];
            }
            newUsersPS[newUsersPS.length - 1] = enteredPassword;
            Passwords = newUsersPS;
            System.out.println(
                    til == 'e'
                            ? SUCCSES_ENTER_EN
                            : til == 'r'
                            ? SUCCSES_ENTER_RU
                            : SUCCSES_ENTER_UZ);;
        }


    }

    public static void menuphone() {


        System.out.println(
               til == 'e'
                    ? MENU_PHONE_ENG
                    : til == 'r'
                    ? MENU_PHONE_RU
                    : MENU_PHONE_UZ);;

        int telmodel = (new Scanner(System.in)).nextInt();
        switch (telmodel) {
            case 1:
                Apple();
                break;
            case 2:
                Samsung();
                break;
            case 3:
                xiamoi();
                break;
            default:
        }
    }
    //gaysvyvtvuyxas


    private static void Redmi() {

        System.out.println(til == 'e'
                ? MENU_REDMI_EN
                : til == 'r'
                ? MENU_REDMI_RU
                : MENU_REDMI_UZ);



    }

    private static void xiamoi() {
        System.out.println(til == 'e'
                ? MENU_REDMI_EN
                : til == 'r'
                ? MENU_REDMI_RU
                : MENU_REDMI_UZ);
        String tanlanganModel = "";
        int tanlanganXotira = 0 ;
        String tanlanganRang = "";
        int menu = (new Scanner(System.in)).nextInt();
        switch (menu) {
            case 1:
                tanlanganModel = "12";
                break;
        case 2:
            tanlanganModel = "12_Pro";
            break;
        case 3:
            tanlanganModel = "13";
                break;
        case 4:
            tanlanganModel = "13_Pro";
                break;
        case 5:
            tanlanganModel = "13T";
                break;
        case 6:
            tanlanganModel = "13T_Pro";
                break;
        }
        System.out.println(til == 'e'
                ? TANLASH_XOTIRA_EN
                : til == 'r'
                ? TANLASH_XOTIRA_RU
                : TANLASH_XOTIRA_EN);
        int xotiraMenu = (new Scanner(System.in)).nextInt();
        switch (xotiraMenu) {
            case 1:
                tanlanganXotira = 64;
                break;
            case 2:
                tanlanganXotira = 128;
                break;
            case 3:
                tanlanganXotira = 256;
                break;
        }
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_EN);
        int rangMenu = (new Scanner(System.in)).nextInt();
        switch (rangMenu) {
            case 1:
                tanlanganRang = "Black";
                break;
            case 2:
                tanlanganRang = "White";
                break;
            case 3:
                tanlanganRang = "Green";
                break;
        }
        if (tanlanganModel.equals("12 Pro") && tanlanganXotira == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 180$");
        } else if (tanlanganModel.equals("12 Pro") && tanlanganXotira == 128 ) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 200$");
        } else if (tanlanganModel.equals("12 Pro") && tanlanganXotira == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 210$");
        }

        if (tanlanganModel.equals("12 ") && tanlanganXotira == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 150$");
        } else if (tanlanganModel.equals("12 ") && tanlanganXotira == 128 ) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 170$");
        } else if (tanlanganModel.equals("12") && tanlanganXotira == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 180$");
        }
        if (tanlanganModel.equals("13") && tanlanganXotira == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 800$");
        } else if (tanlanganModel.equals("13") && tanlanganXotira == 128 ) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 820$");
        } else if (tanlanganModel.equals("13") && tanlanganXotira == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 840$");
        }
        if (tanlanganModel.equals("13T") && tanlanganXotira == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1100$");
        } else if (tanlanganModel.equals("13T_Pro") && tanlanganXotira == 128 ) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1120$");
        } else if (tanlanganModel.equals("13T_Pro") && tanlanganXotira == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1140$");
        }
//        if (tanlanganModel.equals("13") && tanlanganXotira == 64 && tanlanganRang.equals("Black")) {
//            System.out.println("200");
//        } else if (tanlanganModel.equals("13") && tanlanganXotira == 128 && tanlanganRang.equals("Black")) {
//            System.out.println("220");
//        } else if (tanlanganModel.equals("13") && tanlanganXotira == 256 && tanlanganRang.equals("Black")) {
//            System.out.println("240");
//        }


        else if (tanlanganModel.equals("13_Pro") && tanlanganXotira == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 930$");
        } else if (tanlanganModel.equals("13_Pro") && tanlanganXotira == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 950$");
        } else if (tanlanganModel.equals("13_Pro")&& tanlanganXotira == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 970$");
        }
        else if (tanlanganModel.equals("13T") && tanlanganXotira == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1020$");
        } else if (tanlanganModel.equals("13T") && tanlanganXotira == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1040$");
        } else if (tanlanganModel.equals("13T")&& tanlanganXotira == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1060$");
        }
    }
    private static void Samsung() {

        System.out.println(til == 'e'
                ? MENU_SAMSUNG_EN
                : til == 'r'
                ? MENU_SAMSUNG_RU
                : MENU_SAMSUNG_UZ);
        String tanlanganModelSAM = "";
        int tanlanganXotiraSAM = 0;
        String tanlanganRangSAM = "";
        int menu = (new Scanner(System.in)).nextInt();
        switch (menu) {
            case 1:
                tanlanganModelSAM = "Samsung A04";
                break;
            case 2:
                tanlanganModelSAM = "Samsung A14 ";
                break;
            case 3:
                tanlanganModelSAM = "Samsung A34";
                break;
            case 4:
                tanlanganModelSAM = "Samsung S23";
                break;
            case 5:
                tanlanganModelSAM = "Samsung S23 Plus";
                break;
            case 6:
                tanlanganModelSAM = "Samsung_S23_Ultra";
                break;
            case 7:
                tanlanganModelSAM = "Samsung Z Flip";
                break;
            case 8:
                tanlanganModelSAM = "Samsung_Z_Fold_5";
                break;


        }
        System.out.println(til == 'e'
                ? TANLASH_XOTIRA_EN
                : til == 'r'
                ? TANLASH_XOTIRA_RU
                : TANLASH_XOTIRA_EN);
        int xotiraMenu = (new Scanner(System.in)).nextInt();
        switch (xotiraMenu) {
            case 1:
                tanlanganXotiraSAM = 64;
                break;
            case 2:
                tanlanganXotiraSAM = 128;
                break;
            case 3:
                tanlanganXotiraSAM = 256;
                break;
        }
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_EN);
        int rangMenu = (new Scanner(System.in)).nextInt();
        switch (rangMenu) {
            case 1:
                tanlanganRangSAM = "Black";
                break;
            case 2:
                tanlanganRangSAM = "White";
                break;
            case 3:
                tanlanganRangSAM = "Green";
                break;
        }
        if (tanlanganModelSAM.equals("Samsung A04") && tanlanganXotiraSAM == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 150$");
        } else if (tanlanganModelSAM.equals("Samsung A04") && tanlanganXotiraSAM == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 170$");
        } else if (tanlanganModelSAM.equals("Samsung A04") && tanlanganXotiraSAM == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 180$");
        }

        if (tanlanganModelSAM.equals("Samsung A14") && tanlanganXotiraSAM == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 150$");
        } else if (tanlanganModelSAM.equals("Samsung A14") && tanlanganXotiraSAM == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 170$");
        } else if (tanlanganModelSAM.equals("Samsung A14") && tanlanganXotiraSAM == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 180$");
        }
        if (tanlanganModelSAM.equals("Samsung A34") && tanlanganXotiraSAM == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 300$");
        } else if (tanlanganModelSAM.equals("Samsung A34") && tanlanganXotiraSAM == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 320$");
        } else if (tanlanganModelSAM.equals("Samsung A34") && tanlanganXotiraSAM == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 340$");
        }
        if (tanlanganModelSAM.equals("Samsung S23") && tanlanganXotiraSAM == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 800$");
        } else if (tanlanganModelSAM.equals("Samsung S23") && tanlanganXotiraSAM == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 820$");
        } else if (tanlanganModelSAM.equals("Samsung S23") && tanlanganXotiraSAM == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 840$");
        }
//        if (tanlanganModel.equals("13") && tanlanganXotira == 64 && tanlanganRang.equals("Black")) {
//            System.out.println("200");
//        } else if (tanlanganModel.equals("13") && tanlanganXotira == 128 && tanlanganRang.equals("Black")) {
//            System.out.println("220");
//        } else if (tanlanganModel.equals("13") && tanlanganXotira == 256 && tanlanganRang.equals("Black")) {
//            System.out.println("240");
//        }


        else if (tanlanganModelSAM.equals("Samsung S23 Plus") && tanlanganXotiraSAM == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println("830$");
        } else if (tanlanganModelSAM.equals("Samsung S23 Plus") && tanlanganXotiraSAM == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 860$");
        } else if (tanlanganModelSAM.equals("Samsung S23 Plus") && tanlanganXotiraSAM == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println("880$");

        } else if (tanlanganModelSAM.equals("Samsung_S23_Ultra") && tanlanganXotiraSAM == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1000$");
        } else if (tanlanganModelSAM.equals("Samsung_S23_Ultra") && tanlanganXotiraSAM == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1030$");
        } else if (tanlanganModelSAM.equals("Samsung_S23_Ultra") && tanlanganXotiraSAM == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1070$");
        }
        else if (tanlanganModelSAM.equals("Samsung Z Flip 5") && tanlanganXotiraSAM == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1000$");
        } else if (tanlanganModelSAM.equals("Samsung Z Flip 5") && tanlanganXotiraSAM == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1020$");
        } else if (tanlanganModelSAM.equals("Samsung Z Flip 5") && tanlanganXotiraSAM == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1040$");

        }
        else if (tanlanganModelSAM.equals("Samsung_Z_Fold_5") && tanlanganXotiraSAM == 64) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1500$");
        } else if (tanlanganModelSAM.equals("Samsung_Z_Fold_5") && tanlanganXotiraSAM == 128) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1550$");
        } else if (tanlanganModelSAM.equals("Samsung_Z_Fold_5") && tanlanganXotiraSAM == 256) {
            System.out.print(
                    til == 'e'
                            ? NARX_CIQARISH_EN
                            : til == 'r'
                            ? NARX_CIQARISH_RU
                            : NARX_CIQARISH_UZ
            );
            System.out.println(" 1600$");
        }

    }
    private static void Apple() {

        System.out.println(
                til == 'e'
                        ? MENU_IPHONE_EN
                        : til == 'r'
                        ? MENU_IPHONE_RU
                        : MENU_IPHONE_UZ
                );
        int applemodel = (new Scanner(System.in)).nextInt();
        switch (applemodel) {
            case 1:
                iPhone_11();
                break;
            case 2:
                iPhone_11_Pro();
                break;
            case 3:
                iPhone_11_Pro_Max();
                break;
            case 4:
                iPhone_12();
                break;
            case 5:
                iPhone_12_Pro();
                break;
            case 6:
                iPhone_12_Pro_Max();
                break;
            case 7:
                iPhone_13();
                break;
            case 8:
                iPhone_13_Pro();
                break;
            case 9:
                iPhone_13_Pro_Max();
                break;
            case 10:
                iPhone_14();
                break;
            case 11:
                iPhone_14_Pro();
                break;
            case 12:
                iPhone_14_Pro_Max();
                break;
            case 13:
                iPhone_15();
                break;
            case 14:
                iPhone_15_Pro();
                break;
            case 15:
                iPhone_15_Pro_Max();
                break;

            default:

        }

    }
    //hsiua8usdgycsd

    private static void iPhone_15_Pro_Max() {
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_UZ);
        int iphone15promxcolor = (new Scanner(System.in)).nextInt();
        switch (iphone15promxcolor) {
            case 1:
                beshpromBlack();
                break;
            case 2:
                beshpromWhite();
                break;
            case 3:
                beshpromGreen();
                break;
        }

    }

    private static void beshpromGreen() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );



        int iphone15prommemory = (new Scanner(System.in)).nextInt();
        switch (iphone15prommemory) {
            case 1:
                beshpromgreenbirinchiGB();
                break;
            case 2:
                beshpromgreenikkinchiGB();
                break;
            case 3:
                beshpromgreenuchichinchiGB();
                break;
        }
    }

    private static void beshpromgreenikkinchiGB() {
//        System.out.println("Telefon narxi 1380$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println("  1380$");
    }

    private static void beshpromgreenuchichinchiGB() {
//        System.out.println("Telefon narxi 1360$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1360$");
    }

    private static void beshpromgreenbirinchiGB() {
//        System.out.println("Telefon narxi 1340$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1340$");
    }

    private static void beshpromWhite() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        System.out.println(" 1340$");

        int iphone15prommemory = (new Scanner(System.in)).nextInt();
        switch (iphone15prommemory) {
            case 1:
                beshpromwhitebirinchiGB();
                break;
            case 2:
                beshpromwhiteikkinchiGB();
                break;
            case 3:
                beshpromwhiteuchichinchiGB();
                break;
        }
    }

    private static void beshpromwhiteuchichinchiGB() {
//        System.out.println("Telefon narxi 1360$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1360$");
    }

    private static void beshpromwhiteikkinchiGB() {
//        System.out.println("Telefon narxi 1340$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1340$");
    }

    private static void beshpromwhitebirinchiGB() {
//        System.out.println("Telefon narxi 1320$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println("1320$");

    }


    private static void beshpromBlack() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ

        );


        int iphone15prommemory = (new Scanner(System.in)).nextInt();
        switch (iphone15prommemory) {
            case 1:
                beshpromblackbirinchiGB();
                break;
            case 2:
                beshpromblackikkinchiGB();
                break;
            case 3:
                beshpromblackuchichinchiGB();
                break;
        }
    }

    private static void beshpromblackuchichinchiGB() {
//        System.out.println("Telefon narxi 1360$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1360$");
    }

    private static void beshpromblackikkinchiGB() {
//        System.out.println("Telefon narxi 1340$");
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1340$");
    }

    private static void beshpromblackbirinchiGB() {
//        System.out.println("Telefon narxi 1320$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1320$");

    }

    private static void iPhone_15_Pro() {
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_EN);
        int iphone15procolor = (new Scanner(System.in)).nextInt();
        switch (iphone15procolor) {
            case 1:
                beshpBlack();
                break;
            case 2:
                beshpWhite();
                break;
            case 3:
                beshpGreen();
                break;
        }

    }

    private static void beshpGreen() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ

        );

        int iphone15pmemory = (new Scanner(System.in)).nextInt();
        switch (iphone15pmemory) {
            case 1:
                beshpgreenbirinchiGB();
                break;
            case 2:
                beshpgreenikkinchiGB();
                break;
            case 3:
                beshpgreenuchichinchiGB();
                break;
        }
    }

    private static void beshpgreenikkinchiGB() {
//        System.out.println("Telefon narxi 1240$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1240$");
    }

    private static void beshpgreenuchichinchiGB() {
//        System.out.println("Telefon narxi 1220$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1220$");

    }

    private static void beshpgreenbirinchiGB() {
//        System.out.println("Telefon narxi 1200$");
       System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1220$");

    }

    private static void beshpWhite() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );


        int iphone15pmemory = (new Scanner(System.in)).nextInt();
        switch (iphone15pmemory) {
            case 1:
                beshpwhitebirinchiGB();
                break;
            case 2:
                beshpwhiteikkinchiGB();
                break;
            case 3:
                beshpwhiteuchichinchiGB();
                break;
        }
    }

    private static void beshpwhiteuchichinchiGB() {
//        System.out.println("Telefon narxi 1220$");
        System.out.print(
                til == 'e'
                        ?NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1220$");
    }

    private static void beshpwhiteikkinchiGB() {
        System.out.print(
                til == 'e'
                        ?NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1220$");

    }

    private static void beshpwhitebirinchiGB() {
//        System.out.println("Telefon narxi 1180$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println("1180$");

    }


    private static void beshpBlack() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );

        int iphone15pmemory = (new Scanner(System.in)).nextInt();
        switch (iphone15pmemory) {
            case 1:
                beshpblackbirinchiGB();
                break;
            case 2:
                beshpblackikkinchiGB();
                break;
            case 3:
                beshpblackuchichinchiGB();
                break;
        }
    }

    private static void beshpblackuchichinchiGB() {
//        System.out.println("Telefon narxi 1220$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1220$");
    }

    private static void beshpblackikkinchiGB() {
//        System.out.println("Telefon narxi 1200$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1200$");
    }

    private static void beshpblackbirinchiGB() {
//        System.out.println("Telefon narxi 1180$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1180$");

    }

    private static void iPhone_15() {
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_UZ);
        int iphone15color = (new Scanner(System.in)).nextInt();
        switch (iphone15color) {
            case 1:
                beshBlack();
                break;
            case 2:
                beshWhite();
                break;
            case 3:
                beshGreen();
                break;
        }

    }

    private static void beshGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );

        int iphone15memory = (new Scanner(System.in)).nextInt();
        switch (iphone15memory) {
            case 1:
                beshgreenbirinchiGB();
                break;
            case 2:
                beshgreenikkinchiGB();
                break;
            case 3:
                beshgreenuchichinchiGB();
                break;
        }
    }

    private static void beshgreenikkinchiGB() {
//        System.out.println("Telefon narxi 1050$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1050$");
    }

    private static void beshgreenuchichinchiGB() {
//        System.out.println("Telefon narxi 1030$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1030$");

    }

    private static void beshgreenbirinchiGB() {
//        System.out.println("Telefon narxi 1010$");

        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1010$");
    }

    private static void beshWhite() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );


        int iphone15memory = (new Scanner(System.in)).nextInt();
        switch (iphone15memory) {
            case 1:
                beshwhitebirinchiGB();
                break;
            case 2:
                beshwhiteikkinchiGB();
                break;
            case 3:
                beshwhiteuchichinchiGB();
                break;
        }
    }

    private static void beshwhiteuchichinchiGB() {
//        System.out.println("Telefon narxi 1040$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1040$");
    }

    private static void beshwhiteikkinchiGB() {
//        System.out.println("Telefon narxi 1020$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1020$");
    }

    private static void beshwhitebirinchiGB() {
//        System.out.println("Telefon narxi 1000$");

        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1000$");
    }


    private static void beshBlack() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );

        int iphone15memory = (new Scanner(System.in)).nextInt();
        switch (iphone15memory) {
            case 1:
                beshblackbirinchiGB();
                break;
            case 2:
                beshblackikkinchiGB();
                break;
            case 3:
                beshblackuchichinchiGB();
                break;
        }
    }

    private static void beshblackuchichinchiGB() {
//        System.out.println("Telefon narxi 1040$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1040$");
    }

    private static void beshblackikkinchiGB() {
//        System.out.println("Telefon narxi 1020$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1020$");
    }

    private static void beshblackbirinchiGB() {
//        System.out.println("Telefon narxi 1000$");

        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1000$");
    }


    private static void iPhone_14_Pro_Max() {
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_EN);
        int iphone14promaxcolor = (new Scanner(System.in)).nextInt();
        switch (iphone14promaxcolor) {
            case 1:
                tortpromaxBlack();
                break;
            case 2:
                tortpromaxWhite();
                break;
            case 3:
                tortpromaxGreen();
                break;
        }

    }

    private static void tortpromaxGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );

        int iphone14promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone14promaxmemory) {
            case 1:
                tortpromaxgreenbirinchiGB();
                break;
            case 2:
                tortpromaxgreenikkinchiGB();
                break;
            case 3:
                tortpromaxgreenuchichinchiGB();
                break;
        }
    }

    private static void tortpromaxgreenikkinchiGB() {
//        System.out.println("Telefon narxi 1030$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1030$");
    }

    private static void tortpromaxgreenuchichinchiGB() {
//        System.out.println("Telefon narxi 1010$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println( " 1010$");

    }

    private static void tortpromaxgreenbirinchiGB() {
//        System.out.println("Telefon narxi 990$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 990$");
    }

    private static void tortpromaxWhite() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        :TANLASH_XOTIRA_UZ
        );

        int iphone14promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone14promaxmemory) {
            case 1:
                tortpromaxwhitebirinchiGB();
                break;
            case 2:
                tortpromaxwhiteikkinchiGB();
                break;
            case 3:
                tortpromaxwhiteuchichinchiGB();
                break;
        }
    }

    private static void tortpromaxwhiteuchichinchiGB() {

        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1020$");
    }

    private static void tortpromaxwhiteikkinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1000$");

    }

    private static void tortpromaxwhitebirinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 980$");

    }


    private static void tortpromaxBlack() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        :TANLASH_XOTIRA_UZ
        );
        System.out.println(" 1000$");

        int iphone14promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone14promaxmemory) {
            case 1:
                tortpromaxblackbirinchiGB();
                break;
            case 2:
                tortpromaxblackikkinchiGB();
                break;
            case 3:
                tortpromaxblackuchichinchiGB();
                break;
        }
    }

    private static void tortpromaxblackuchichinchiGB() {

//        System.out.println("Telefon narxi 1020$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1020$");
    }

    private static void tortpromaxblackikkinchiGB() {
//        System.out.println("Telefon narxi 1000$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1000$");

    }

    private static void tortpromaxblackbirinchiGB() {
//        System.out.println("Telefon narxi 980$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 980$");

    }

    private static void iPhone_14_Pro() {
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_EN);


        int iphone14procolor = (new Scanner(System.in)).nextInt();
        switch (iphone14procolor) {
            case 1:
                tortproBlack();
                break;
            case 2:
                tortproWhite();
                break;
            case 3:
                tortproGreen();
                break;
        }

    }

    private static void tortproGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ

        );


        int iphone14promemory = (new Scanner(System.in)).nextInt();
        switch (iphone14promemory) {
            case 1:
                tortprogreenbirinchiGB();
                break;
            case 2:
                tortprogreenikkinchiGB();
                break;
            case 3:
                tortprogreenuchichinchiGB();
                break;
        }
    }

    private static void tortprogreenikkinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 1000$");

    }

    private static void tortprogreenuchichinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 850$");


    }

    private static void tortprogreenbirinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 810$");


    }

    private static void tortproWhite() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        :TANLASH_XOTIRA_UZ
        );


        int iphone14promemory = (new Scanner(System.in)).nextInt();
        switch (iphone14promemory) {
            case 1:
                tortprowhitebirinchiGB();
                break;
            case 2:
                tortprowhiteikkinchiGB();
                break;
            case 3:
                tortprowhiteuchichinchiGB();
                break;
        }
    }

    private static void tortprowhiteuchichinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 840$");
    }

    private static void tortprowhiteikkinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 820$");

    }

    private static void tortprowhitebirinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 800$");

    }


    private static void tortproBlack() {
        System.out.print(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        :TANLASH_XOTIRA_UZ
        );

        int iphone14promemory = (new Scanner(System.in)).nextInt();
        switch (iphone14promemory) {
            case 1:
                tortproblackbirinchiGB();
                break;
            case 2:
                tortproblackikkinchiGB();
                break;
            case 3:
                tortproblackuchichinchiGB();
                break;
        }
    }

    private static void tortproblackuchichinchiGB() {

        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 840$");
    }

    private static void tortproblackikkinchiGB() {
        System.out.println("Telefon narxi 820$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 820$");
    }

    private static void tortproblackbirinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 800$");

    }


    private static void iPhone_14() {
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_UZ);
        int iphone14color = (new Scanner(System.in)).nextInt();
        switch (iphone14color) {
            case 1:
                tortBlack();
                break;
            case 2:
                tortWhite();
                break;
            case 3:
                tortGreen();
                break;
        }

    }

    private static void tortGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone14memory = (new Scanner(System.in)).nextInt();
        switch (iphone14memory) {
            case 1:
                tortgreenbirinchiGB();
                break;
            case 2:
                tortgreenikkinchiGB();
                break;
            case 3:
                tortgreenuchichinchiGB();
                break;
        }
    }

    private static void tortgreenikkinchiGB() {
//        System.out.println("Telefon narxi 750$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 750$");
    }

    private static void tortgreenuchichinchiGB() {
//        System.out.println("Telefon narxi 730$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 730$");
    }

    private static void tortgreenbirinchiGB() {
//        System.out.println("Telefon narxi 710$");
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 710$");

    }

    private static void tortWhite() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
// to do
        );

        int iphone14memory = (new Scanner(System.in)).nextInt();
        switch (iphone14memory) {
            case 1:
                tortwhitebirinchiGB();
                break;
            case 2:
                tortwhiteikkinchiGB();
                break;
            case 3:
                tortwhiteuchichinchiGB();
                break;
        }
    }

    private static void tortwhiteuchichinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 740$");
    }

    private static void tortwhiteikkinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 730$");

    }

    private static void tortwhitebirinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 700$");

    }


    private static void tortBlack() {
        System.out.println(
                 til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ

        );

        int iphone14memory = (new Scanner(System.in)).nextInt();
        switch (iphone14memory) {
            case 1:
                tortblackbirinchiGB();
                break;
            case 2:
                tortblackikkinchiGB();
                break;
            case 3:
                tortblackuchichinchiGB();
                break;
        }
    }

    private static void tortblackuchichinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 740$");
    }

    private static void tortblackikkinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 720$");

    }

    private static void tortblackbirinchiGB() {
        System.out.print(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 700$");

    }

    private static void iPhone_13_Pro_Max() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_RU
                        : TANLASH_COLOR_UZ

        );
        int iphone13promaxcolor = (new Scanner(System.in)).nextInt();
        switch (iphone13promaxcolor) {
            case 1:
                uchpromaxBlack();
                break;
            case 2:
                uchpromaxWhite();
                break;
            case 3:
                uchpromaxGreen();
                break;
        }

    }

    private static void uchpromaxGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );


        int iphone13promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone13promaxmemory) {
            case 1:
                uchpromaxgreenbirinchiGB();
                break;
            case 2:
                uchpromaxgreenikkinchiGB();
                break;
            case 3:
                uchpromaxgreenuchichinchiGB();
                break;
        }
    }

    private static void uchpromaxgreenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 740$");
    }

    private static void uchpromaxgreenuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 720$");

    }

    private static void uchpromaxgreenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 700$");
    }



    private static void uchpromaxWhite() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone13promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone13promaxmemory) {
            case 1:
                uchpromaxwhitebirinchiGB();
                break;
            case 2:
                uchpromaxwhiteikkinchiGB();
                break;
            case 3:
                uchpromaxwhiteuchichinchiGB();
                break;
        }
    }

    private static void uchpromaxwhiteuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 730$");
    }


    private static void uchpromaxwhiteikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 710$");
    }



    private static void uchpromaxwhitebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 690$");

    }


    private static void uchpromaxBlack() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone13promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone13promaxmemory) {
            case 1:
                uchpromaxblackbirinchiGB();
                break;
            case 2:
                uchpromaxblackikkinchiGB();
                break;
            case 3:
                uchpromaxblackuchichinchiGB();
                break;
        }
    }

    private static void uchpromaxblackuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 730$");
    }


    private static void uchpromaxblackikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 710$");
    }



    private static void uchpromaxblackbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 690$");

    }

    private static void iPhone_13_Pro() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_RU
                        : TANLASH_COLOR_UZ
        );
        int iphone13procolor = (new Scanner(System.in)).nextInt();
        switch (iphone13procolor) {
            case 1:
                uchproBlack();
                break;
            case 2:
                uchproWhite();
                break;
            case 3:
                uchproGreen();
                break;
        }

    }

    private static void uchproGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone13promemory = (new Scanner(System.in)).nextInt();
        switch (iphone13promemory) {
            case 1:
                uchprogreenbirinchiGB();
                break;
            case 2:
                uchprogreenikkinchiGB();
                break;
            case 3:
                uchprogreenuchichinchiGB();
                break;
        }
    }

    private static void uchprogreenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 680$");
    }

    private static void uchprogreenuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 660$");

    }

    private static void uchprogreenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 640$");

    }

    private static void uchproWhite() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone13promemory = (new Scanner(System.in)).nextInt();
        switch (iphone13promemory) {
            case 1:
                uchprowhitebirinchiGB();
                break;
            case 2:
                uchprowhiteikkinchiGB();
                break;
            case 3:
                uchprowhiteuchichinchiGB();
                break;
        }
    }

    private static void uchprowhiteuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 670$");
    }

    private static void uchprowhiteikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 650$");

    }

    private static void uchprowhitebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 630$");

    }


    private static void uchproBlack() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone13promemory = (new Scanner(System.in)).nextInt();
        switch (iphone13promemory) {
            case 1:
                uchproblackbirinchiGB();
                break;
            case 2:
                uchproblackikkinchiGB();
                break;
            case 3:
                uchproblackuchichinchiGB();
                break;
        }
    }

    private static void uchproblackuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 670$");
    }

    private static void uchproblackikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 650$");

    }

    private static void uchproblackbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 630$");
    }



    private static void iPhone_13() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_EN
                        : TANLASH_COLOR_UZ
        );
        int iphone13color = (new Scanner(System.in)).nextInt();
        switch (iphone13color) {
            case 1:
                uchBlack();
                break;
            case 2:
                uchWhite();
                break;
            case 3:
                uchGreen();
                break;
        }

    }

    private static void uchGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone13memory = (new Scanner(System.in)).nextInt();
        switch (iphone13memory) {
            case 1:
                uchgreenbirinchiGB();
                break;
            case 2:
                uchgreenikkinchiGB();
                break;
            case 3:
                uchgreenuchichinchiGB();
                break;
        }
    }

    private static void uchgreenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 630$");
    }

    private static void uchgreenuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 610$");

    }

    private static void uchgreenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 590$");

    }

    private static void uchWhite() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone13memory = (new Scanner(System.in)).nextInt();
        switch (iphone13memory) {
            case 1:
                uchwhitebirinchiGB();
                break;
            case 2:
                uchwhiteikkinchiGB();
                break;
            case 3:
                uchwhiteuchichinchiGB();
                break;
        }
    }

    private static void uchwhiteuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 620$");
    }

    private static void uchwhiteikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 600$");

    }

    private static void uchwhitebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 580$");

    }


    private static void uchBlack() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone13memory = (new Scanner(System.in)).nextInt();
        switch (iphone13memory) {
            case 1:
                uchblackbirinchiGB();
                break;
            case 2:
                uchblackikkinchiGB();
                break;
            case 3:
                uchblackuchichinchiGB();
                break;
        }
    }

    private static void uchblackuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 620$");
    }

    private static void uchblackikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 600$");

    }

    private static void uchblackbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 580$");

    }

    private static void iPhone_12_Pro_Max() {
        System.out.println(til == 'e'
                ? TANLASH_COLOR_EN
                : til == 'r'
                ? TANLASH_COLOR_RU
                : TANLASH_COLOR_EN);
        int iphone12promaxcolor = (new Scanner(System.in)).nextInt();
        switch (iphone12promaxcolor) {
            case 1:
                ikkipromaxBlack();
                break;
            case 2:
                ikkipromaxWhite();
                break;
            case 3:
                ikkipromaxGreen();
                break;
        }

    }


    private static void ikkipromaxGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone12promaxmemory) {
            case 1:
                ikkipromaxgreenbirinchiGB();
                break;
            case 2:
                ikkipromaxgreenikkinchiGB();
                break;
            case 3:
                ikkipromaxgreenuchichinchiGB();
                break;
        }
    }

    private static void ikkipromaxgreenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 540$");
    }

    private static void ikkipromaxgreenuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 560$");

    }

    private static void ikkipromaxgreenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 520$");

    }

    private static void ikkipromaxWhite() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone12promaxmemory) {
            case 1:
                ikkipromaxwhitebirinchiGB();
                break;
            case 2:
                ikkipromaxwhiteikkinchiGB();
                break;
            case 3:
                ikkipromaxwhiteuchichinchiGB();
                break;
        }
    }

    private static void ikkipromaxwhiteuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 550$");
    }

    private static void ikkipromaxwhiteikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 530$");

    }

    private static void ikkipromaxwhitebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 510$");

    }


    private static void ikkipromaxBlack() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone12promaxmemory) {
            case 1:
                ikkipromaxblackbirinchiGB();
                break;
            case 2:
                ikkipromaxblackikkinchiGB();
                break;
            case 3:
                ikkipromaxblackuchichinchiGB();
                break;
        }
    }

    private static void ikkipromaxblackuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 550$");
    }

    private static void ikkipromaxblackikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 530$");

    }

    private static void ikkipromaxblackbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 510$");

    }

    private static void iPhone_12_Pro() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_EN
                        : TANLASH_COLOR_UZ
        );
        int iphone12procolor = (new Scanner(System.in)).nextInt();
        switch (iphone12procolor) {
            case 1:
                ikkiproBlack();
                break;
            case 2:
                ikkiproWhite();
                break;
            case 3:
                ikkiproGreen();
                break;
        }

    }

    private static void ikkiproGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12promemory = (new Scanner(System.in)).nextInt();
        switch (iphone12promemory) {
            case 1:
                ikkiprogreenbirinchiGB();
                break;
            case 2:
                ikkiprogreenikkinchiGB();
                break;
            case 3:
                ikkiprogreenuchichinchiGB();
                break;
        }
    }

    private static void ikkiprogreenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 480$");
    }

    private static void ikkiprogreenuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 500$");

    }

    private static void ikkiprogreenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 460$");

    }

    private static void ikkiproWhite() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12promemory = (new Scanner(System.in)).nextInt();
        switch (iphone12promemory) {
            case 1:
                ikkiprowhitebirinchiGB();
                break;
            case 2:
                ikkiprowhiteikkinchiGB();
                break;
            case 3:
                ikkiprowhiteuchichinchiGB();
                break;
        }
    }

    private static void ikkiprowhiteuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 490$");
    }

    private static void ikkiprowhiteikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 470$");

    }

    private static void ikkiprowhitebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 450$");

    }


    private static void ikkiproBlack() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12promemory = (new Scanner(System.in)).nextInt();
        switch (iphone12promemory) {
            case 1:
                ikkiproblackbirinchiGB();
                break;
            case 2:
                ikkiproblackikkinchiGB();
                break;
            case 3:
                ikkiproblackuchichinchiGB();
                break;
        }
    }

    private static void ikkiproblackuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 490$");
    }

    private static void ikkiproblackikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 470$");

    }

    private static void ikkiproblackbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 450$");

    }

    private static void iPhone_12() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_RU
                        : TANLASH_COLOR_UZ
        );
        int iphone12color = (new Scanner(System.in)).nextInt();
        switch (iphone12color) {
            case 1:
                ikkiBlack();
                break;
            case 2:
                ikkiWhite();
                break;
            case 3:
                ikkiGreen();
                break;
        }

    }

    private static void ikkiGreen() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12memory = (new Scanner(System.in)).nextInt();
        switch (iphone12memory) {
            case 1:
                ikkigreenbirinchiGB();
                break;
            case 2:
                ikkigreenikkinchiGB();
                break;
            case 3:
                ikkigreenuchichinchiGB();
                break;
        }
    }

    private static void ikkigreenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 450$");
    }

    private static void ikkigreenuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 430$");

    }

    private static void ikkigreenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 410$");

    }

    private static void ikkiWhite() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12memory = (new Scanner(System.in)).nextInt();
        switch (iphone12memory) {
            case 1:
                ikkiwhitebirinchiGB();
                break;
            case 2:
                ikkiwhiteikkinchiGB();
                break;
            case 3:
                ikkiwhiteuchichinchiGB();
                break;
        }
    }

    private static void ikkiwhiteuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 440$");
    }

    private static void ikkiwhiteikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 420$");

    }

    private static void ikkiwhitebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 400$");

    }


    private static void ikkiBlack() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone12memory = (new Scanner(System.in)).nextInt();
        switch (iphone12memory) {
            case 1:
                ikkiblackbirinchiGB();
                break;
            case 2:
                ikkiblackikkinchiGB();
                break;
            case 3:
                ikkiblackuchichinchiGB();
                break;
        }
    }

    private static void ikkiblackuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 440$");
    }

    private static void ikkiblackikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 420$");

    }

    private static void ikkiblackbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 400$");

    }


    private static void iPhone_11_Pro_Max() {

        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_EN
                        : TANLASH_COLOR_UZ
              );
        int iphone11promaxcolor = (new Scanner(System.in)).nextInt();
        switch (iphone11promaxcolor) {
            case 1:
                birpromaxSpace_blue();
                break;
            case 2:
                birpromaxGold();
                break;
            case 3:
                birpromaxGreenpro();
                break;
        }

    }

    private static void birpromaxGreenpro() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone11promemory = (new Scanner(System.in)).nextInt();
        switch (iphone11promemory) {
            case 1:
                birpromaxgreenbirinchiGB();
                break;
            case 2:
                birpromaxgreenikkinchiGB();
                break;
            case 3:
                birpromaxgreenuchinchiGB();
        }

    }

    private static void birpromaxgreenuchinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 500$");
    }

    private static void birpromaxgreenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 480$");

    }

    private static void birpromaxgreenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 460$");
    }

    private static void birpromaxGold() {

        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
            );
        int iphone11promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone11promaxmemory) {
            case 1:
                birpromaxgoldbirinchiGB();
                break;
            case 2:
                birpromaxgoldikkinchiGB();
                break;
            case 3:
                birpromaxgolduchinchiGB();
        }

    }

    private static void birpromaxgolduchinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 500$");
    }

    private static void birpromaxgoldikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 480$");

    }

    private static void birpromaxgoldbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 460$");
    }




    private static void birpromaxSpace_blue() {

        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
              );
        int iphone11promaxmemory = (new Scanner(System.in)).nextInt();
        switch (iphone11promaxmemory) {
            case 1:
                birpromaxspacebluebirinchiGB();
                break;
            case 2:
                birpromaxspaceblueikkinchiGB();
                break;
            case 3:
                birpromaxspaceblueuchinchiGB();
        }

    }

    private static void birpromaxspaceblueuchinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 510$");
    }

    private static void birpromaxspaceblueikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 490$");

    }

    private static void birpromaxspacebluebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 5700$");
    }




    private static void iPhone_11_Pro() {

        System.out.println(
                til == 'e'
                                       ? TANLASH_COLOR_EN
                                       : til == 'r'
                                       ? TANLASH_COLOR_EN
                                       : TANLASH_COLOR_UZ
                
                );
        int iphone11procolor = (new Scanner(System.in)).nextInt();
        switch (iphone11procolor) {
            case 1:
                Space_blue();
                break;
            case 2:
                Gold();
                break;
            case 3:
                Greenpro();
                break;
        }

    }

    private static void Greenpro() {

        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
               );
        int iphone11promemory = (new Scanner(System.in)).nextInt();
        switch (iphone11promemory) {
            case 1:
                birprogreenbirinchiGB();
            break;
            case 2:
                birprogreenikkinchiGB();
                break;
            case 3:
                birprogreenuchinchiGB();
        }

    }

    private static void birprogreenuchinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 440$");
    }

    private static void birprogreenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 420$");

    }

    private static void birprogreenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 400$");
    }

    private static void Gold() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone11promemory = (new Scanner(System.in)).nextInt();
        switch (iphone11promemory) {
            case 1:
                birprogoldbirinchiGB();
                break;
            case 2:
                birprogoldikkinchiGB();
                break;
            case 3:
                birprogolduchinchiGB();
        }

    }

    private static void birprogolduchinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 440$");
    }

    private static void birprogoldikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 420$");

    }

    private static void birprogoldbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 400$");
    }




    private static void Space_blue() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone11promemory = (new Scanner(System.in)).nextInt();
        switch (iphone11promemory) {
            case 1:
                birprospacebluebirinchiGB();
                break;
            case 2:
                birprospaceblueikkinchiGB();
                break;
            case 3:
                birprospaceblueuchinchiGB();
        }

    }

    private static void birprospaceblueuchinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 450$");
    }

    private static void birprospaceblueikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 430$");

    }

    private static void birprospacebluebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 410$");
    }




    private static void iPhone_11() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_EN
                        : TANLASH_COLOR_UZ

        );
        int iphone11color = (new Scanner(System.in)).nextInt();
                switch (iphone11color) {
                    case 1:
                        Black();
                        break;
                    case 2:
                        White();
                        break;
                    case 3:
                        Green();
                        break;
                }

    }

    private static void Green() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone11memory = (new Scanner(System.in)).nextInt();
                switch (iphone11memory) {
                    case 1:
                       greenbirinchiGB();
                        break;
                    case 2:
                       greenikkinchiGB();
                        break;
                    case 3:
                       greenuchichinchiGB();
                        break;
                }
    }

    private static void greenikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 400$");
    }

    private static void greenuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 380$");

    }

    private static void greenbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 360$");

    }

    private static void White() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone11memory = (new Scanner(System.in)).nextInt();
        switch (iphone11memory) {
            case 1:
                whitebirinchiGB();
                break;
            case 2:
               whiteikkinchiGB();
                break;
            case 3:
                whiteuchichinchiGB();
                break;
        }
    }

    private static void whiteuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 390$");
    }

    private static void whiteikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 370$");

    }

    private static void whitebirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 350$");

    }


    private static void Black() {
        System.out.println(
                til == 'e'
                        ? TANLASH_XOTIRA_EN
                        : til == 'r'
                        ? TANLASH_XOTIRA_RU
                        : TANLASH_XOTIRA_UZ
        );
        int iphone11memory = (new Scanner(System.in)).nextInt();
        switch (iphone11memory) {
            case 1:
                blackbirinchiGB();
                break;
            case 2:
                blackikkinchiGB();
                break;
            case 3:
                blackuchichinchiGB();
                break;
        }
    }

    private static void blackuchichinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 390$");
    }

    private static void blackikkinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 370$");

    }

    private static void blackbirinchiGB() {
        System.out.println(
                til == 'e'
                        ? NARX_CIQARISH_EN
                        : til == 'r'
                        ? NARX_CIQARISH_RU
                        : NARX_CIQARISH_UZ
        );
        System.out.println(" 350$");

    }
}






