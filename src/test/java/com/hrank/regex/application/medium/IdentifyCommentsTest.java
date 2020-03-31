package com.hrank.regex.application.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentifyCommentsTest {

    @Test
    void detect() {
        IdentifyComments tester = new IdentifyComments();
        tester.detect("// my  program in C++\n" +
                "\n" +
                "#include <iostream>\n" +
                "/** playing around in\n" +
                "a new programming language **/\n" +
                "using namespace std;\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "  cout << \"Hello World\";\n" +
                "  cout << \"I'm a C++ program\"; //use cout\n" +
                "  return 0;\n" +
                "}");
    }
}