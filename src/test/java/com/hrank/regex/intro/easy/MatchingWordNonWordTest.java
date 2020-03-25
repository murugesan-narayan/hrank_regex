package com.hrank.regex.intro.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingWordNonWordTest {

    @Test
    void checker() {
        MatchingWordNonWord mw = new MatchingWordNonWord();
        mw.Test_String = "ab_|ac72ad25aa?_AF";
        mw.checker("\\w{3}\\W\\w{10}\\W\\w{3}");
    }
}