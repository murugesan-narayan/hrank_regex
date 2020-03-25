package com.hrank.regex.chars.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingSpecificCharTest {

    @Test
    void checker() {
        MatchingSpecificChar tester = new MatchingSpecificChar();
        tester.Test_String="1203x.";
        tester.checker("^[123][120][xs0][30Aa][xsu][.,]$");
    }
}