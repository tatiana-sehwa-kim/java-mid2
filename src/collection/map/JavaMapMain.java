package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());           // O(1)
        run(new LinkedHashMap<>());     // O(1)
        run(new TreeMap<>());           // O(log N)
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());      // "너 진짜 출신(실제 클래스 타입)이 누구냐?" 하고 물어보는 자바 기본 메서드
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + "=" + map.get(key) + " ");
        }
        System.out.println();
    }
}

//    map = class java.util.HashMap         입력 순서 보장 X
//    A=30 1=40 B=20 2=50 C=10

//    map = class java.util.LinkedHashMap   입력 순서 보장 O
//    C=10 B=20 A=30 1=40 2=50

//    map = class java.util.TreeMap         key 순서로 정렬
//    1=40 2=50 A=30 B=20 C=10