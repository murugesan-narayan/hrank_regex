package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateHRLanguageTest {

    @Test
    void validate() {
        ValidateHRLanguage tester = new ValidateHRLanguage();
        boolean valid = tester.validate("11011 LUA");
        assertTrue(valid);
        valid = tester.validate("11022 BRAINFUCK");
        assertTrue(valid);
        valid = tester.validate("11044 X");
        assertFalse(valid);
    }
}