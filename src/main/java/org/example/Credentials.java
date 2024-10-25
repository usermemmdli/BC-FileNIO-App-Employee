package org.example;

import org.example.util.OptionsEnumUtil;

import java.util.Scanner;

public class Credentials {
    public static void login(){
        String username = "Mustafa";
        String password = "mustafa123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("İstifadəçi adı və parol daxil edin -->");
        System.out.print("username: ");
        String usernameSc = scanner.next();
        System.out.print("password: ");
        String passwordSc = scanner.next();

        if (username.equals(usernameSc) && password.equals(passwordSc)){
            System.out.println("Giris olundu!");
        }else {
            System.err.println("Yanlış istifadəçi adı və ya parol!");
            OptionsEnumUtil.stop();
        }
    }
}
