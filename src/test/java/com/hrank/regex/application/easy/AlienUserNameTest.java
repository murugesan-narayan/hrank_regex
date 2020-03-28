package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienUserNameTest {

    @Test
    void validate() {
        AlienUserName tester = new AlienUserName();
        String s = "_0898989811abced_";
        tester.validate(s);
    }

    @Test
    void validate1() {
        AlienUserName tester = new AlienUserName();
        String s = "_abce";
        tester.validate(s);
    }
    @Test
    void validate2() {
        AlienUserName tester = new AlienUserName();
        String s = "_09090909abcD0";
        tester.validate(s);
    }
}