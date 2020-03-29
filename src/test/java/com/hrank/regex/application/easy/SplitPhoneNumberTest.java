package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitPhoneNumberTest {

    @Test
    void validate() {
        SplitPhoneNumber tester = new SplitPhoneNumber();
        String result = tester.validate("1 877 2638277");
        assertEquals("CountryCode=1,LocalAreaCode=877,Number=2638277", result);
        result = tester.validate("91-011-23413627");
        assertEquals("CountryCode=91,LocalAreaCode=011,Number=23413627", result);
    }
}