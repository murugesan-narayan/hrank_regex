package com.hrank.regex.application.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindWordTest {

    @Test
    void find() {
        FindWord tester = new FindWord();
        int count = tester.find("foo", "foo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.");
        assertEquals(6, count);
    }
}