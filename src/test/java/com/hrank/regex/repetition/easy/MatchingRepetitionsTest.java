package com.hrank.regex.repetition.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingRepetitionsTest {

    @Test
    void checker() {
        MatchingRepetitions tester = new MatchingRepetitions();
        tester.Test_String="    2222222222aaaaaaaaaa2222222222aaaaaaaaaa13 57";
        tester.checker("^[A-Za-z02468]{40}[\\s13579]{5}$");
    }
}