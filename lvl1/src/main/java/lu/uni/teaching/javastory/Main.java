package lu.uni.teaching.javastory;
import lu.uni.teaching.javastory.listchecker.ListUtils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int number = 42;
        List<Integer> list= Arrays.asList(49, 85, 42);

        boolean isInList = ListUtils.isNumberAnswerInList(number, list);
        if (isInList) {
            System.out.printf("Number %d is in the list.", number);
        } else {
            System.out.printf("Number %d is not in the list.", number);
        }
    }
}