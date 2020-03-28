package com.hrank.regex.application.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            String s = sc.next();
            boolean valid = Pattern.matches("^[_.][\\d]+[a-zA-Z]*_?$", s);
            System.out.println(valid?"VALID":"INVALID");
        }
    }

    public void validate(String s) {
        boolean valid = Pattern.matches("^[_.][\\d]+[a-zA-Z]*_?$", s);
        System.out.println(valid?"VALID":"INVALID");
    }
}
