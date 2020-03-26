package com.hrank.regex.backref.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingSameTextAgainTest {

    @Test
    void checker() {
        MatchingSameTextAgain tester = new MatchingSameTextAgain();
        tester.Test_String = "ab #1?AZa$ab #1?AZa$";
        tester.checker("^(?<g1>[a-z])(?<g2>[\\w])(?<g3>[\\s])(?<g4>[^\\w])" +
                "(?<g5>[\\d])(?<g6>[^\\d])(?<g7>[A-Z])(?<g8>[a-zA-Z])(?<g9>[aeiouAEIOU])" +
                "(?<g10>[^\\s])\\k<g1>\\k<g2>\\k<g3>\\k<g4>\\k<g5>\\k<g6>\\k<g7>\\k<g8>\\k<g9>\\k<g10>$");
    }
}