package collection.map.test;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // 코드 작성 : Map 에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력해라.

        // HashSet 사용

        HashSet<String> fruits = new HashSet<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1000) {
                fruits.add(key);
            }
        }
        System.out.println(fruits);

    }
}
