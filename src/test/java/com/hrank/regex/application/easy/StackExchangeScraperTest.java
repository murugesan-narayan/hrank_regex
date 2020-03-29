package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StackExchangeScraperTest {

    @Test
    void list() throws Exception {
        File file = new File("src/test/java/com/hrank/regex/application/easy/stackex.xml");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        br.lines().forEach(line->sb.append(line.trim()));
        StackExchangeScraper tester = new StackExchangeScraper();
        List<String> result = tester.list(sb);
        List<String> expected = List.of(
                "80407;about power supply of opertional amplifier;11 hours ago",
                "80405;5V Regulator Power Dissipation;11 hours ago");
        assertIterableEquals(expected, result);
    }
}