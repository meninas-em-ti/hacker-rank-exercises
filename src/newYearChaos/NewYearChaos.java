package newYearChaos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewYearChaos {

//1 2 3 4 5 6 7 8
//1 2 3 5 4 6 7 8
//1 2 5 3 4 6 7 8
//1 2 5 3 6 4 7 8
//1 2 5 3 6 7 4 8
//1 2 5 3 7 6 4 8
//1 2 5 3 7 6 8 4
//1 2 5 3 7 8 6 4
//1 2 5 3 7 8 6 4
    public static void minimumBribes(List<Integer> q) {
        int[] persons = {1, 2, 3};
        int brides = 0;
        for(int i = 0; i < q.size(); i++){
            if(q.get(i) == persons[0]){
                persons[0] = persons[1];
                persons[1] = persons[2];
                persons[2]++;
            }else if(q.get(i) == persons[1]){
                persons[1] = persons[2];
                persons[2]++;
                brides++;
            }else if(q.get(i) == persons[2]){
                persons[2]++;
                brides += 2;
            }else{
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(brides);
    }
    //1 2 5 3 7 8 6 4


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
        minimumBribes(list);
    }
}
