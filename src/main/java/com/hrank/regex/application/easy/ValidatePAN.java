package com.hrank.regex.application.easy;

import java.util.Scanner;

public class ValidatePAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String id = sc.nextLine();
            boolean valid = id.matches("^[A-Z]{5}[0-9]{4}[A-Z]$");
            System.out.println(valid?"YES":"NO");
        }
    }

    public boolean validate(String id) {
        return id.matches("^[A-Z]{5}[0-9]{4}[A-Z]$");
    }
}
