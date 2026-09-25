package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));      // 두 집합의 합집합, 교집합, 차집합을 구해라. 출력 순서는 관계없다. (중복 제거)
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));      // Union, Intersection, Difference

        // 합집합
        Set<Integer> union = new HashSet<>(set1);       // Set 생성시 컬렉션 바로 추가 가능
        union.addAll(set2);

        // 교집합
        Set<Integer> intersection = new HashSet<>(set1);        // 교집합: retainAll
        intersection.retainAll(set2);

        // 차집합
        Set<Integer> difference = new HashSet<>(set1);          // 차집합: removeAll
        difference.removeAll(set2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);
    }
}

//        합집합: [1, 2, 3, 4, 5, 6, 7]
//        교집합: [3, 4, 5]
//        차집합: [1, 2]
