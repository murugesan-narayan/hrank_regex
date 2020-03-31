package com.hrank.regex.application.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyProgLang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append("\n").append(sc.nextLine().trim());
        }
        String str = sb.toString();
        Pattern py_pat = Pattern.compile("(^print\\s|__name__)", Pattern.MULTILINE);
        Matcher py_mat = py_pat.matcher(str);
        Pattern java_pat = Pattern.compile("^import\\sjava", Pattern.MULTILINE);
        Matcher java_mat = java_pat.matcher(str);
        Pattern c_pat = Pattern.compile("^#include", Pattern.MULTILINE);
        Matcher c_mat = c_pat.matcher(str);
        if (py_mat.find()) {
            System.out.println("Python");
        } else if (java_mat.find()){
            System.out.println("Java");
        } else if (c_mat.find()) {
            System.out.println("C");
        }
    }

    public void detect(String str) {
        Pattern py_pat = Pattern.compile("^print\\s", Pattern.MULTILINE);
        Matcher py_mat = py_pat.matcher(str);
        Pattern java_pat = Pattern.compile("^import\\sjava", Pattern.MULTILINE);
        Matcher java_mat = java_pat.matcher(str);
        Pattern c_pat = Pattern.compile("^#include", Pattern.MULTILINE);
        Matcher c_mat = c_pat.matcher(str);
        if (py_mat.find()) {
            System.out.println("Python");
        } else if (java_mat.find()){
            System.out.println("Java");
        } else if (c_mat.find()) {
            System.out.println("C");
        }
    }
}
