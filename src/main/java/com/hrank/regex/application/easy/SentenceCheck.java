package com.hrank.regex.application.easy;

import java.util.Scanner;

public class SentenceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String s = sc.nextLine();
            boolean valid = s.matches("^[hH][iI]\\s[^dD].*$");
            if (valid)
                System.out.println(s);
        }
    }

    public boolean validate(String s) {
        return s.matches("^[hH][iI]\\s[^dD].*$");
    }
}
