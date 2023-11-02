package ONLINE;

import java.util.Scanner;

import static ONLINE.ConstantTil.*;

public class Main {
    static String[] users = {"998901111111", "998902222222", "998903333333", "998904444444"};
    static String[] Admins = {"+998901111111", "+998902222221", "+998903333332", "+998904444443"};
    static String[] Passwords = {"Azim1", "User2", "User3", "User8"};
    static String[] adminPasswords = {"Azim1", "AdminUser2", "AdminUser3", "AdminUser3"};
    static char til = EN;


    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Tilni tanlash, Choose language
                    1.English1
                    2.Uzbek
                    3.Russkiy
                    """);
            int tanlanadiganTil = (new Scanner(System.in)).nextInt();

            if (tanlanadiganTil == 1) {
                til = EN;
            } else if (tanlanadiganTil == 2) {
                til = UZ;
            } else if (tanlanadiganTil == 3) {
                til = RU;
            } else {
                System.out.println("Xato kiritding,default uzbek tanlandi");
            }
//            System.out.println(tanlanadiganTil == EN ? FIRST_MESSAGE_EN
//                    : tanlanadiganTil == UZ ? FIRST_MESSAGE_UZ
//                    : tanlanadiganTil == RU ? FIRST_MESSAGE_RU
//                    : FIRST_MESSAGE_UZ);
            System.out.println(
                    til == 'e'
                            ? FIRST_MESSAGE_EN
                            : til == 'r'
                            ? FIRST_MESSAGE_RU
                            : FIRST_MESSAGE_UZ);

            int kiritilganSon = (new Scanner(System.in).nextInt());
            switch (kiritilganSon) {
                case 1:
                    Methods.login();

                    break;
                case 2:
                    Methods.register();
                    break;
                default:
                    System.out.println("");
            }
        }
    }
}

