package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};      // 중복을 제거하고 데이터 값 순서대로 출력하기
        Set<Integer> mySet = new TreeSet<>(List.of(inputArr));    // TreeSet 데이터 값 순서대로 정렬

//        Set<Integer> mySet = new TreeSet<>(List.of(30, 20, 20, 10, 10));  두줄을 합쳐버릴수 있다.

        for (Integer i : mySet) {
            System.out.println(i);
        }
    }
}

//        10
//        20
//        30