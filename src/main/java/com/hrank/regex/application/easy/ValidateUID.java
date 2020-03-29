package com.hrank.regex.application.easy;

import java.util.Scanner;

public class ValidateUID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String id = sc.nextLine();
            boolean valid = id.matches("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$");
            System.out.println(valid?"VALID":"INVALID");
        }
    }

    public boolean validate(String id) {
        return id.matches("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$");
    }
}
