package javaLoops;

import java.util.*;
/*LINK TO SEE CHALLENGE
 * https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 * */

//for com n
//dentro do for colocar 2 elevado a n
/*aplicar formula int firstPartOfTheFormula = (a + 2 elevado a n * b) e
armazenar esse valor em uma variavel para ser
usado nas proximas interacoes do for*/
//int secondPartOfTheFormula = (2 elevado n * b)
//firstPartOfTheFormula = firstPartOfTheFormula + secondPartOfTheFormula

class JavaLoops {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        int firstPartOfTheFormula = 0;
        int secondPartOfTheFormula = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            List<Integer> result = new ArrayList<>();
            result.forEach(singleResult -> System.out.print(singleResult + " "));
            for(int j = 0; j < n; j++){
                if(j == 0){
                    firstPartOfTheFormula = a + (int)Math.pow(2,j) * b;
                } else {
                    secondPartOfTheFormula = (int)Math.pow(2,j) * b;
                    firstPartOfTheFormula = firstPartOfTheFormula + secondPartOfTheFormula;
                }
                System.out.print(firstPartOfTheFormula + " ");
            }
            System.out.println();
        }

        in.close();
    }
}