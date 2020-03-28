package com.hrank.regex.application.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectHTMLTagsTest {

    @Test
    void detectTags() {
        DetectHTMLTags tester = new DetectHTMLTags();
        tester.detectTags("<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>\n" +
                "<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>");
    }
}