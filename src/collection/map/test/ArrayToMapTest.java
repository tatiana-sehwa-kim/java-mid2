package collection.map.test;

import java.util.HashMap;

public class ArrayToMapTest {
    public static void main(String[] args) {
        
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
            // 주어진 배열로부터 Map 생성 - 코드 작성
            // Map의 모든 데이터 출력  - 코드 작성

        HashMap<String, Integer> productMap = new HashMap<>();


        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));    // 문자 -> 숫자 후 변수합치기 Ctrl Al N
        }

        for (String key : productMap.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
        }
    } 
}

//    제품: Java, 가격: 10000
//    제품: JPA, 가격: 30000
//    제품: Spring, 가격: 20000