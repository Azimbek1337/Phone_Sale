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
                : CODE_UZ + sentcode);
        System.out.println(til == 'e'
                ? ENTER_CODE_EN
                : til == 'r'
                ? ENTER_CODE_RU
                : ENTER_CODE_UZ);
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
        }


    }

    public static void menuphone() {
        System.out.println("Telefon brendini tanlang");
        System.out.println("""
                1. Apple
                2. Samsung
                3. Redmi
                """);

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
        System.out.println("Redmi modelini tanlang");
        System.out.println("""
                1. Redmi 12       3. Xiamoi 13       5. Xiamoi 13T
                2. Redmi 12 Pro   4. Xiamoi 13 Pro   6. Xiamoi 13T Pro
                              """);

        int Redmimodel = (new Scanner(System.in)).nextInt();
        switch (Redmimodel) {
            case 1:
                Redmi_12();
                break;
            case 2:
                Redmi_12_Pro();
                break;
            case 3:
                Xiamoi_13();
                break;
            case 4:
                Xiamoi_13_Pro();
                break;

            case 5:
                Xiamoi_13T();
                break;

            case 6:
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

    private static void Redmi_12_Pro() {
    }

    private static void Redmi_12() {
    }

    private static void Samsung() {
        System.out.println("Samsung brendini tanlang");
        System.out.println("""
                1. Samsung A04       4. Samsung S23          7. Samsung Z Flip 5
                2. Samsung A14       5. Samsung S23 Plus     8. Samsung_Z_Fold_5
                3. Samsung A34       6. Samsung_S23_Ultra
                    
                           """);

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
        System.out.println("Apple modelini tanlang");
        System.out.println("""
                1. iPhone 11           2. iPhone 12           7. iPhone 13           10. iPhone 14            13. iPhone 15 
                2. iPhone 11 Pro       5. iPhone 12 Pro       8. iPhone 12 Pro Max   11. iPhone 14 Pro        14. iPhone 15 Pro 
                3. iPhone 11 Pro Max   6. iPhone 12 Pro Max   9. iPhone 12 Pro Max   12. iPhone 14 Pro Max    15. iPhone 15 Pro Max  
                    
                     
                    
                    """);
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
        System.out.println("Rangni tanlang");
        System.out.println("""
                1.Black
                2.White
                3.Green
                
                """);
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
        System.out.println("Telefon xotirasini tanlang");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GbB
                
                """);
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
        System.out.println("Telefon narxi 500$");
    }

    private static void birprogreenikkinchiGB() {
        System.out.println("Telefon narxi 470$");

    }

    private static void birprogreenbirinchiGB() {
        System.out.println("Telefon narxi 450$");
    }

    private static void Gold() {
        System.out.println("Telefon xotirasini tanlang");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GbB
                
                """);
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
        System.out.println("Telefon narxi 500$");
    }

    private static void birprogoldikkinchiGB() {
        System.out.println("Telefon narxi 470$");

    }

    private static void birprogoldbirinchiGB() {
        System.out.println("Telefon narxi 450$");
    }




    private static void Space_blue() {
        System.out.println("Telefon xotirasini tanlang");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GbB
                
                """);
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
        System.out.println("Telefon narxi 510$");
    }

    private static void birprospaceblueikkinchiGB() {
        System.out.println("Telefon narxi 480$");

    }

    private static void birprospacebluebirinchiGB() {
        System.out.println("Telefon narxi 460$");
    }




    private static void iPhone_11() {
        System.out.println("Rangni tanlang");
        System.out.println("""
                1.Black
                2.White
                3.Green
                
                """);
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
        System.out.println("Telefon xotirasini kiriting");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GB
                
                """);
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
        System.out.println("Telefon narxi 380$");
    }

    private static void greenuchichinchiGB() {
        System.out.println("Telefon narxi 410$");

    }

    private static void greenbirinchiGB() {
        System.out.println("Telefon narxi 360$");

    }

    private static void White() {
        System.out.println("Telefon xotirasini kiriting");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GbB
                
                """);
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
        System.out.println("Telefon narxi 400$");
    }

    private static void whiteikkinchiGB() {
        System.out.println("Telefon narxi 370$");

    }

    private static void whitebirinchiGB() {
        System.out.println("Telefon narxi 350$");

    }


    private static void Black() {
        System.out.println("Telefon xotirasini kiriting");
        System.out.println("""
                1. 64 GB
                2. 128 GB
                3. 256 GbB
                
                """);
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
        System.out.println("Telefon narxi 400$");
    }

    private static void blackikkinchiGB() {
        System.out.println("Telefon narxi 370$");

    }

    private static void blackbirinchiGB() {
        System.out.println("Telefon narxi 350$");

    }
}






