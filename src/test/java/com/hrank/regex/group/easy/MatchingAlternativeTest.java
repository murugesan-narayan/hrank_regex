package com.hrank.regex.group.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingAlternativeTest {

    @Test
    void checker() {
        MatchingAlternative tester = new MatchingAlternative();
        tester.Test_String = "Mr.DOSHI";
        tester.checker("^(Mr|Mrs|Ms|Dr|Er)\\.[a-zA-Z]+$");
    }
}