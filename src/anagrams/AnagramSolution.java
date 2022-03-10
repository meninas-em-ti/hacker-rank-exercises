package anagrams;

/*
 * Link to see the question:
* https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true&h_r=next-challenge&h_v=zen *
 *
 * Question:
* Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive.
* For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 *
 *
/*STEPS:
* Replace Strings variables to lowercase
* Sort letters of the string in alphabetic order:
* pass the string to an array -> a.toCharArray()
* sort the array -> Arrays.sort()
* convert array of char to string -> a.valueOf();
* check of the two string are equal
*/

import java.util.Scanner;

public class AnagramSolution {
    static boolean isAnagram(String a, String b) {
        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(arrayA);
        java.util.Arrays.sort(arrayB);

        a = String.valueOf(arrayA);
        b = String.valueOf(arrayB);

        return (a.equals(b)) ? true : false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
