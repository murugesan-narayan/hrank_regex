package com.hrank.regex.backref.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSameTextAgain {
    String Test_String = "";
    public void checker(String Regex_Pattern) {
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
}
