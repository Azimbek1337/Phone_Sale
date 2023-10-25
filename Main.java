import java.util.Scanner;


public class Main {
    static String[] users = {"+998901111111", "+998902222222" ,"+998903333333", "+998904444444"};
    static String[] Admins = {"+998901111111", "+998902222221" ,"+998903333332", "+998904444443"};
    static String[] Passwords = {"Azim1", "User2" ,"User3", "User3"};
    static String[] adminPasswords = {"Azim1", "AdminUser2" ,"AdminUser3", "AdminUser3"};

    static char til = 'u';

    public static void main(String[] args) {

        while (true) {
            System.out.println("""
                    Tilni tanlash, Choose language
                    1.English
                    2.Uzbek
                    """);
            int tanlash = (new Scanner(System.in)).nextInt();
            if (tanlash == 1) {
                til = 'e';
            } else if (tanlash == 2) {
                til = 'u';
            }
        }
    }
}
