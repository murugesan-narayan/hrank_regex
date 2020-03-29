package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HackerRankChatTest {

    @Test
    void check() {
        HackerRankChat tester = new HackerRankChat();
        int result = tester.check("i love hackerrank");
        assertEquals(2, result);
        result = tester.check("hackerrank is an awesome place for programmers");
        assertEquals(1, result);
        result = tester.check("hackerrank");
        assertEquals(0, result);
        result = tester.check("i think hackerrank is a great place to hangout");
        assertEquals(-1, result);
    }
}