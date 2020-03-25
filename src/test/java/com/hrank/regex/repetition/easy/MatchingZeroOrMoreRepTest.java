package com.hrank.regex.repetition.easy;

import com.hrank.regex.repetition.easy.MatchingZeroOrMoreRep;
import org.junit.jupiter.api.Test;

class MatchingZeroOrMoreRepTest {

    @Test
    void checker() {
        MatchingZeroOrMoreRep tester = new MatchingZeroOrMoreRep();
        tester.Test_String="14";
        tester.checker("^[\\d]{2,}[a-z]*[A-Z]*$");
    }
}