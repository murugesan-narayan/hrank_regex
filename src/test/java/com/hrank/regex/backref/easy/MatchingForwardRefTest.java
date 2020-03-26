package com.hrank.regex.backref.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingForwardRefTest {

    @Test
    void checker() {
        MatchingForwardRef tester = new MatchingForwardRef();
        tester.Test_String = "tactactic";
        tester.checker("^(\\2tic|(tac))+$");
    }
}