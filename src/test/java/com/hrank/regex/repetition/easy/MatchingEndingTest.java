package com.hrank.regex.repetition.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingEndingTest {

    @Test
    void checker() {
        MatchingEnding tester = new MatchingEnding();
        tester.Test_String="Kites";
        tester.checker("^[A-Za-z]*s$");
    }
}