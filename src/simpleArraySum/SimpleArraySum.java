package simpleArraySum;

/*
 * Link to see challenge: https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
 * problem: Given an array of integers, find the sum of its elements.
 * */

import java.util.List;

public class SimpleArraySum {
    /* STEPS:
- criar uma variavel para receber o valor da soma
- criar um for loop para a lista de inteiros
- somar os valores
- retornar o resultado da soma
*/

    class Result {

        /*
         * Complete the 'simpleArraySum' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY ar as parameter.
         */

        public static int simpleArraySum(List<Integer> ar) {
        /*int sumOfIntegers = 0;
        for(int i = 0; i < ar.size(); i++){
            sumOfIntegers += ar.get(i);
        }
        return sumOfIntegers;
        */

        /*int sumOfIntegers = 0;
        sumOfIntegers = ar
        .stream()
        .reduce(0, (firstValue, secondValue) -> firstValue + secondValue);
        return sumOfIntegers;
        */

            int sumOfIntegers = 0;
            for(int i: ar){
                sumOfIntegers += i;
            }
            return sumOfIntegers;
        }
    }
}
