package mini_max_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMaxSumSolution {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    /*
    1 - sort the list
    2 - sum the first 4 digits of the list
    3 - sum the last 4 digits of the list
    4- print the values
    */

        Collections.sort(arr);
        List<Long> newArr = arr.stream().map(Long::valueOf)
                .collect(Collectors.toList());

        System.out.println(newArr.subList(0,4).stream().reduce(0L, Long::sum)
                + " " + newArr.subList(1,5).stream().reduce(0L, Long::sum));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }

}
