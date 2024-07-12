package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // 1st way
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b1 = m.matches();

        // 2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        // 3rd way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b1 + " " + b2 + " " + b3);

        // REGEX CHARACTER CLASSES
        System.out.println("===== Character Class =====");
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna")); // false (m and a comes more than once)

        // REGEX QUANTIFIERS
        System.out.println("===== ? quantifiers =====");
        System.out.println(Pattern.matches("[amn]?", "a")); //true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("===== + quantifiers =====");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("===== * quantifiers =====");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)

        // REGEX METACHARACTERS
        System.out.println("===== metacharacters d =====");
        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)

        System.out.println("===== metacharacters D =====");
        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)

        System.out.println("===== metacharacters D with quantifier =====");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)

        /*Create a regular expression that accepts alphanumeric characters only.
        Its length must be six characters long only.*/
        System.out.println("===== alphanumeric characters. 6 length =====");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "brader22")); // false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "bra$22")); // false ($ is not matched)

        /*Create a regular expression that accepts 10 digit numeric characters
        starting with 7, 8 or 9 only.*/
        System.out.println("===== 10 digit numeric. start with 7, 8 or 9 =====");
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949")); // false (starts from 6)

    }
}
