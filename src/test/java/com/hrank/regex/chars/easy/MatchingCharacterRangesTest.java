package com.hrank.regex.chars.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingCharacterRangesTest {

    @Test
    void checker() {
        MatchingCharacterRanges tester = new MatchingCharacterRanges();
        tester.Test_String="h4CkR";
        tester.checker("^[a-z][1-9][^a-z][^A-Z][A-Z].*");
    }
}