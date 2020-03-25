package com.hrank.regex.intro.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexIntroTest {

    @Test
    void checker() {
        RegexIntro tester = new RegexIntro();
        tester.Test_String = "en.wikipedia.com, fr.wikipedia.com";
        tester.checker("wikipedia");
    }
}