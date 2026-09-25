package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 30, 10, 10};      // 중복 제거하고 무작위 출력하기

        Set<Integer> mySet = new HashSet<>();

        for (Integer i : inputArr) {                // 배열 하나씩 add
            mySet.add(i);
        }

        for (Integer i : mySet) {
            System.out.println(i);
        }
    }
}

//        30
//        20
//        10