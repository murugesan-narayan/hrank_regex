package com.hrank.regex.intro.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingDigitsNonDigitTest {

    @Test
    void checker() {
        MatchingDigitsNonDigit md = new MatchingDigitsNonDigit();
        md.Test_String = "65t72H1232";
        md.checker("\\d{2}\\D\\d{2}\\D\\d{4}");
    }
}