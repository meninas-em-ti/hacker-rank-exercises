package newYearChaos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewYearsChaosError {

    //1 2 3 4 5 6 7 8
//1 2 3 5 4 6 7 8
//1 2 5 3 4 6 7 8
//1 2 5 3 6 4 7 8
//1 2 5 3 6 7 4 8
//1 2 5 3 7 6 4 8
//1 2 5 3 7 6 8 4
//1 2 5 3 7 8 6 4
//1 2 5 3 7 8 6 4
    public static void minimumBribes(List<Integer> queue) {
        int numberOFChanges= 0;
        boolean tooChaotic = false;
        int j=0;
        //System.out.println("test");
        for (int i= 0 ; i < queue.size(); i++) {
            if((queue.get(i) > i+3)) {
                tooChaotic = true;
                System.out.println("Too chaotic");
                break;
            }

            if((i + 1) <  queue.get(i)) {
                numberOFChanges = numberOFChanges + (queue.get(i) - (i+1) );
            }

        }
        if(!tooChaotic){
            System.out.println(numberOFChanges);
        }

    }
    //1 2 5 3 7 8 6 4


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
        minimumBribes(list);
    }
}


