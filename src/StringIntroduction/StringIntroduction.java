package StringIntroduction;

/*
Link to see the question:
* https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

* Question:
Given two strings of lowercase English letters, A and B, perform the following operations:
1- Sum the lengths of A and B;
2- Determine if A is lexicographically larger than B;
3-Capitalize the first letter in A and B and print them on a single line, separated by a space.

 */
/*STEPS:

 * FIRST STEP:
 * sum of length of 2 strings!
 * use the length method to calculate the sum of strings sizes a.length() + b.length();
 * create a variable to receive the sum
 * print the variable using the method System.out.println()
 *
 * SECOND STEP:
 * compare if the first string is greater than the second one.

 * Example of method compareTo()
 * se A > B = numero e positivo
 * se A < B = numero e negativo
 * se A == B = numero igual a zero
 *
 * A.compareTo(B);
 * create variable to receive the result of the comparation
 * create validation using the variable created
 * if validation is a positive number the return will be Yes
 * else return print No
 *
 * THIRD STEP:
 * use the substring(0, 1) to get the first character
 * create a variable to receive substring result
 * get variable and uppercase it using variable.toUppercase();
 * sum the first modified character plus the rest of the old string
 * create a variable to receive the new string
 * variableCharacter+A.substring(1);
 * do the same steps for string B;
 * print the sum of A + " " + B;

 *create a method that receives a string and uppercase first letter
* */

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int sumOfStringLengths = A.length() + B.length();
        System.out.println(sumOfStringLengths);

        int comparationResult = A.compareTo(B);
        if(comparationResult > 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        //String firstStringA = A.substring(0, 1).toUpperCase();
        //String newA = firstStringA + A.substring(1);

        //String firstStringB = B.substring(0, 1).toUpperCase();
        //String newB = firstStringB + B.substring(1);

        String newA = turnFirstLetterToUppercase(A);
        String newB = turnFirstLetterToUppercase(B);

        System.out.println(newA + " " + newB);
    }

    public static String turnFirstLetterToUppercase(String s){
        String firstStringS = s.substring(0, 1).toUpperCase();
        String newS = firstStringS + s.substring(1);
        return newS;
    }
}
