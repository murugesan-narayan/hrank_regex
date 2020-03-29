package com.hrank.regex.application.easy;

import java.util.Scanner;

public class ValidateHRLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String s = sc.nextLine();
            boolean valid = s.matches("^[1-9]\\d{4}\\s" +
                    "(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|" +
                    "ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$");
            System.out.println(valid?"VALID":"INVALID");
        }
    }

    public boolean validate(String s) {//10^4 [10000] <= api_id < 10^5  [99999]
        return s.matches("^[1-9]\\d{4}\\s" +
                "(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|" +
                "ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$");
    }
}
