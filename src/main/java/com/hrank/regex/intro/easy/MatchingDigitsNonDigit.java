package com.hrank.regex.intro.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingDigitsNonDigit {
    String Test_String = null;
    public void checker(String Regex_Pattern){

        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
}
