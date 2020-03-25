package com.hrank.regex.group.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingWordBoundaryTest {

    @Test
    void checker() {
        MatchingWordBoundary tester = new MatchingWordBoundary();
        tester.Test_String="Found a match?";
        tester.checker("\\b[aeiouAEIOU][a-zA-Z]*\\b");
    }
}