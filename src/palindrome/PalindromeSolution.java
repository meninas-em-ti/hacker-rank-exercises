package palindrome;

/*
 * Link to see the question:
* https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true *
 * Question:
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string A, print Yes if it is a palindrome, print No otherwise.
 *
 *
/*STEPS:
* Reverse string using StringBuilder funcion
* Store the result of the reversed string in a new variable
* Compare the two string to check if the are equal
* Create conditional, if the string is a palindrome print Yes, otherwise No
*/

import java.util.Scanner;

public class PalindromeSolution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String revertedStringA = new StringBuilder(A).reverse().toString();

        if (revertedStringA.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
