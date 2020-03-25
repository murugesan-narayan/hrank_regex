package com.hrank.regex.intro.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIntro {
    public String Test_String = "";
    public void checker(String Regex_Pattern){

        //Scanner Input = new Scanner(System.in);
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while(m.find()){
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }
}
