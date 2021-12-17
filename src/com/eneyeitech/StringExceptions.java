package com.eneyeitech;

public class StringExceptions {
    public static String concatStrings(String str1, String str2) {
        /* write your code here */

        return str1.concat(str2);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        String[] strings = {"abc", "hello", "army of robots", null};

        String s1 = strings[0];
        String s2 = strings[3];
        String s3 = s2.concat("abc");
        String s4 = strings[strings.length];
    }
}
