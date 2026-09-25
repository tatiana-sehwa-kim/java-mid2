package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        run(new HashSet<>());             // 자바 기본 제공 hashSet 사용, Ctrl Alt N 변수로 코드 합치기
        run(new LinkedHashSet<>());
        run(new TreeSet<>());             // run 메서드에서 <String>을 유추하여 빈 다이아몬드<> 로 작성됨
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();                                 // iterator() 를 호출하면 컬렉션을 반복해서 출력할 수 있다.
        while (iterator.hasNext()) {                       //  구슬 남아있니? true      // iterator.hasNext() : 다음 데이터가 있는지 확인한다.
            System.out.print(iterator.next() + " ");       //  하나 꺼내봐             // iterator.next() : 다음 데이터를 반환한다.
        }
        System.out.println();
    }
}

//    set = class java.util.HashSet         // 순서 없음
//    A 1 B 2 C
//    set = class java.util.LinkedHashSet   // 순서 보장
//    C B A 1 2
//    set = class java.util.TreeSet         // 데이터의 순서
//    1 2 A B C

//    Iterator  =  향상된 for문 (iter)
//    배열이나 List는 방 번호(인덱스)가 있어서 순서대로 꺼낼 수 있지만 Set은 주머니 구조라서 같은 인덱스 조회 기능이 아예 없습니다.
//    이 문제를 해결하기 위한 자바 전용 도구가 바로 Iterator
//
//    Iterator는 주머니(Set) 안에 손을 집어넣어 구슬을 하나씩 꺼내주는 '전용 집게손' 역할을 합니다. 2개의 메서드
//    hasNext(): "주머니에 아직 구슬 남아있어?" (남아있으면 true, 다 꺼냈으면 false)
//    next(): "그럼 하나 꺼내서 손에 쥐여줘!"
