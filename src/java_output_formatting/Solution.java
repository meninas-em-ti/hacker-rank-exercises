package java_output_formatting;

/*
*Link to see the question:
* https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
*
*
*
*
STEPS:
 * check the length of the String s1 -> s1.length();
 * to add empty spaces we need to 15 - s1.length();
 * store the result of 15 - s1.length() in a variable;
 * create for conditional to add the spaces in String s1 using System.out.print();
 * concatenate s1 with the added spaces
 *
 * check the number of digits of the number
 * if number < 10 we need to add  two zeros
 * else if number < 100 we need to add um zero
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            int spacesToAdd = 15 - s1.length();

            for(int j=0; j< spacesToAdd; j++){
                s1 = s1.concat(" ");
            }

            String zeros = "";
            if (x < 10) {
                zeros = "00";
            } else if(x < 100) {
                zeros = "0";
            }
            System.out.println(s1 + zeros + x);
        }
        System.out.println("================================");

    }
}