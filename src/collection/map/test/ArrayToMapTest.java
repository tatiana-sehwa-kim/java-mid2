package collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
            // 주어진 배열로부터 Map 생성 - 코드 작성
            // Map의 모든 데이터 출력  - 코드 작성

        HashMap<String, Integer> set = new HashMap<>();
        for (String[] product : productArr) {
            set.put(product[0], Integer.valueOf(product[1]));
        }

        for (String key : set.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + set.get(key));
        }
    } 
}

