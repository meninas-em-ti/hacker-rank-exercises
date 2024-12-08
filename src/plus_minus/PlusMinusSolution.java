package plus_minus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class PlusMinusSolution {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        /*
         * 1 - create a for to check the amount of negative, positives and zero
         * 2 - create a count variable for each type  to count the amout of numbers
         * 3 - divide the numbers by the size of the list
         * 4 - formatter the number using 6 digits after decimals
        */

        double countPositive = arr.stream()
                .filter(integer -> integer > 0)
                .count();

        double countNegative = arr.stream()
                .filter(integer -> integer < 0)
                .count();

        double countZero = arr.stream()
                .filter(integer -> integer == 0)
                .count();

        System.out.printf("%.6f%n", countPositive/arr.size());
        System.out.printf("%.6f%n", countNegative/arr.size());
        System.out.printf("%.6f%n", countZero/arr.size());

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinusSolution.plusMinus(arr);

        bufferedReader.close();
    }

}

