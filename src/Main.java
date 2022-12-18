/*
 *@Author Emircan Aktaş - 18.Dec.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Basic UserLogin Control;


        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter username :");
        userName = inp.nextLine();

        System.out.println("Enter password :");
        password = inp.nextLine();

        if (userName.equals("admin") && password.equals("123456")) {
            System.out.println("You logged in.");
        } else {
            System.out.println("Your information is wrong.");
        }

    }
}