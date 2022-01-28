package arrayLeftRotation;

/*
* Link to see the question:
* https://www.hackerrank.com/challenges/ctci-array-left-rotation/copy-from/122162420?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
*
*
* Question:
* Given an array "a" of "n" integers and a number, "d",
* perform "d left rotations on the array.
* Return the updated array to be printed as a single line of space-separated integers.
*
*
* STEPS:
 * move the last number according to the rotations
 * lastIndex = a.size() -1;
 * newIndex = lastIndex - 1;
 * valueOfLastIndex = a.get(lastIndex);
 * 2 lists, we are gonna break from the index d
 * right side of the list will receives the first part of the list
 * create a new variable to receive the right side
 * concatenating left side of the list with the new variable
 */

import java.util.List;

public class ArrayLeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> endOfTheList = a.subList(d, a.size());
        endOfTheList.addAll(a.subList(0, d));

        return endOfTheList;
    }
    /**********   There are more code here, check link of challenge to see the rest of the code    ***************/
}
