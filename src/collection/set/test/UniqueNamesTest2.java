package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};      // 중복을 제거하고 입력 순서대로 출력하기

//        List<Integer> list = List.of(inputArr);       // Set에 배열은 전달할 수 없지만 배열을 List 로 변환 후 전달할 수 있다.
        Set<Integer> mySet = new LinkedHashSet<>(List.of(inputArr));    // 한줄로 바로 생성

        for (Integer i : mySet) {
            System.out.println(i);
        }
    }
}

//        30
//        20
//        10

//        리스트 생성하기
//        List<Integer> list1 = Arrays.asList(1, 2, 3); (구버전)
//        List<Integer> list2 = List.of(1, 2, 3);       (권장)