package com.hrank.regex.chars.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcludingSpecificCharTest {

    @Test
    void checker() {
        ExcludingSpecificChar tester = new ExcludingSpecificChar();
        tester.Test_String="1203x.";
        tester.checker("^[^\\d][^aeiou][^bcDF][^\\s][^AEIOU][^.,]$");
    }
}