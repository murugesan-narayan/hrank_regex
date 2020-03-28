package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPAddressValidationTest {

    @Test
    void validate() {
        IPAddressValidation tester = new IPAddressValidation();
        tester.validate("This line has junk text.");
        tester.validate("121.18.19.20");
        tester.validate("2001:0db8:0000:0000:0000:ff00:0042:8329");
    }
}