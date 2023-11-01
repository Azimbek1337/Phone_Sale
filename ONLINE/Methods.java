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

            //

            String[] newUsersPS = new String[Passwords.length + 1];
            for (int i = 0; i < Passwords.length; i++) {
                newUsers[i] = Passwords[i];
            }
            newUsers[newUsers.length - 1] = enteredPN;
            Passwords = newUsersPS;
            System.out.println();
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


    private static void Redmi() {

        System.out.println(til == 'e'
                ? MENU_REDMI_EN
                : til == 'r'
                ? MENU_REDMI_RU
                : MENU_REDMI_UZ);

        int Redmimodel = (new Scanner(System.in)).nextInt();
        switch (Redmimodel) {
            case 1:
                Redmi_12();
                break;
            case 2:
                Redmi_12_Pro();
                break;
            case 3:
//                xiamoi("13",16,"Qora");
                break;
            case 4:
//                xiamoi("13_Pro");
                break;

            case 5:
//                xiamoi("13T");
                break;

            case 6:
//                xiamoi("13T_Pro");
                break;

            default:

        }

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
            tanlanganModel = "12 Pro";
            break;
        case 3:
            tanlanganModel = "13";
                break;
        case 4:
            tanlanganModel = "13 Pro";
                break;
        case 5:
            tanlanganModel = "13T";
                break;
        case 6:
            tanlanganModel = "13T Pro";
                break;
        }
        System.out.println(TANLASH_XOTIRA_EN);
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

        System.out.println(TANLASH_COLOR_EN);
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
            System.out.println("150");
        } else if (tanlanganModel.equals("12 Pro") && tanlanganXotira == 128 ) {
            System.out.println("170");
        } else if (tanlanganModel.equals("12 Pro") && tanlanganXotira == 256) {
            System.out.println("180");
        }

        if (tanlanganModel.equals("12 ") && tanlanganXotira == 64) {
            System.out.println("150");
        } else if (tanlanganModel.equals("12 ") && tanlanganXotira == 128 ) {
            System.out.println("170");
        } else if (tanlanganModel.equals("12") && tanlanganXotira == 256) {
            System.out.println("180");
        }


        if (tanlanganModel.equals("13") && tanlanganXotira == 64) {
            System.out.println("200");
        } else if (tanlanganModel.equals("13") && tanlanganXotira == 128 ) {
            System.out.println("220");
        } else if (tanlanganModel.equals("13") && tanlanganXotira == 256) {
            System.out.println("240");
        }

        if (tanlanganModel.equals("13T_Pro") && tanlanganXotira == 64) {
            System.out.println("200");
        } else if (tanlanganModel.equals("13T_Pro") && tanlanganXotira == 128 ) {
            System.out.println("220");
        } else if (tanlanganModel.equals("13T_Pro") && tanlanganXotira == 256) {
            System.out.println("500");
        }
//        if (tanlanganModel.equals("13") && tanlanganXotira == 64 && tanlanganRang.equals("Black")) {
//            System.out.println("200");
//        } else if (tanlanganModel.equals("13") && tanlanganXotira == 128 && tanlanganRang.equals("Black")) {
//            System.out.println("220");
//        } else if (tanlanganModel.equals("13") && tanlanganXotira == 256 && tanlanganRang.equals("Black")) {
//            System.out.println("240");
//        }


        else if (tanlanganModel.equals("13Pro") && tanlanganXotira == 64) {
            System.out.println("230");
        } else if (tanlanganModel.equals("13Pro") && tanlanganXotira == 128) {
            System.out.println("300");
        } else if (tanlanganModel.equals("13Pro")&& tanlanganXotira == 256) {
            System.out.println("400");
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

    private static void Redmi_12_Pro() {
    }

    private static void Redmi_12() {
    }

    private static void Samsung() {

        System.out.println(
                til == 'e'
                        ? MENU_SAMSUNG_EN
                        : til == 'r'
                        ? MENU_SAMSUNG_RU
                        : MENU_SAMSUNG_UZ
        );

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
                Samsung_S23();
                break;
            case 5:
                Samsung_S23_Plus();
                break;
            case 6:
                Samsung_S23_Ultra();
                break;
            case 7:
                Samsung_Z_Flip_5();
                break;
            case 8:
                Samsung_Z_Fold_5();
            default:
        }

    }

    private static void Samsung_Z_Fold_5() {
    }

    private static void Samsung_Z_Flip_5() {
    }

    private static void Samsung_S23_Ultra() {
    }

    private static void Samsung_S23_Plus() {
    }

    private static void Samsung_S23() {
    }


    private static void Samsung_A34() {
    }

    private static void Samsung_A14() {
    }

    private static void Samsung_A04() {
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

    private static void iPhone_15_Pro_Max() {
    }

    private static void iPhone_15_Pro() {
    }

    private static void iPhone_15() {
    }


    private static void iPhone_14_Pro_Max() {
    }

    private static void iPhone_14_Pro() {

    }

    private static void iPhone_14() {
        System.out.println("Rangni tanlang");
        System.out.println("""
                1.Black
                2.White
                3.Green
                
                """);
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
        System.out.println("Telefon xotirasini kiriting");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GB
                
                """);
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
        System.out.println("Telefon narxi $");
    }

    private static void tortgreenuchichinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void tortgreenbirinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void tortWhite() {
        System.out.println("Telefon xotirasini kiriting");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GbB
                
                """);
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
        System.out.println("Telefon narxi $");
    }

    private static void tortwhiteikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void tortwhitebirinchiGB() {
        System.out.println("Telefon narxi $");

    }


    private static void tortBlack() {
        System.out.println("Telefon xotirasini kiriting");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GbB
                
                """);
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
        System.out.println("Telefon narxi $");
    }

    private static void tortblackikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void tortblackbirinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void iPhone_13_Pro_Max() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_EN
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
        System.out.println("Telefon narxi $");
    }

    private static void uchpromaxgreenuchichinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchpromaxgreenbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void uchpromaxwhiteikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchpromaxwhitebirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void uchpromaxblackikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchpromaxblackbirinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void iPhone_13_Pro() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_EN
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
        System.out.println("Telefon narxi $");
    }

    private static void uchprogreenuchichinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchprogreenbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void uchprowhiteikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchprowhitebirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void uchproblackikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchproblackbirinchiGB() {
        System.out.println("Telefon narxi $");
        System.out.println("1000");
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
        System.out.println("Telefon narxi $");
    }

    private static void uchgreenuchichinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchgreenbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void uchwhiteikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchwhitebirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void uchblackikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void uchblackbirinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void iPhone_12_Pro_Max() {
        System.out.println("Rangni tanlang");
        System.out.println("""
                1.Black
                2.White
                3.Green
                
                """);
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
        System.out.println("Telefon narxi $");
    }

    private static void ikkipromaxgreenuchichinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkipromaxgreenbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void ikkipromaxwhiteikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkipromaxwhitebirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void ikkipromaxblackikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkipromaxblackbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void ikkiprogreenuchichinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkiprogreenbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void ikkiprowhiteikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkiprowhitebirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void ikkiproblackikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkiproblackbirinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void iPhone_12() {
        System.out.println(
                til == 'e'
                        ? TANLASH_COLOR_EN
                        : til == 'r'
                        ? TANLASH_COLOR_EN
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
        System.out.println("Telefon narxi $");
    }

    private static void ikkigreenuchichinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkigreenbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void ikkiwhiteikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkiwhitebirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void ikkiblackikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void ikkiblackbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void birpromaxgreenikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void birpromaxgreenbirinchiGB() {
        System.out.println("Telefon narxi $");
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
        System.out.println("Telefon narxi $");
    }

    private static void birpromaxgoldikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void birpromaxgoldbirinchiGB() {
        System.out.println("Telefon narxi $");
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
        System.out.println("Telefon narxi $");
    }

    private static void birpromaxspaceblueikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void birpromaxspacebluebirinchiGB() {
        System.out.println("Telefon narxi $");
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
        System.out.println("Telefon narxi $");
    }

    private static void birprogreenikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void birprogreenbirinchiGB() {
        System.out.println("Telefon narxi $");
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
        System.out.println("Telefon narxi $");
    }

    private static void birprogoldikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void birprogoldbirinchiGB() {
        System.out.println("Telefon narxi $");
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
        System.out.println("Telefon narxi $");
    }

    private static void birprospaceblueikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void birprospacebluebirinchiGB() {
        System.out.println("Telefon narxi $");
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
        System.out.println("Telefon narxi $");
    }

    private static void greenuchichinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void greenbirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void whiteikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void whitebirinchiGB() {
        System.out.println("Telefon narxi $");

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
        System.out.println("Telefon narxi $");
    }

    private static void blackikkinchiGB() {
        System.out.println("Telefon narxi $");

    }

    private static void blackbirinchiGB() {
        System.out.println("Telefon narxi $");

    }
}






