package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        // 각각의 단어가 나타난 수를 출력해라

        String text = "orange banana apple apple banana apple";

        String[] fruits = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String fruit : fruits) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);   // 장부에서 fruit을 찾고 이미 적혀 있으면 원래 적혀있던 숫자 꺼내주고
        }                                                     // 처음 보는 단어라서 아무것도 없으면(null이면) 당황하지 말고 그냥 0으로 줘!"
                                                              // 이미 있는거면 원래 값 + 1 으로 덮어쓰기
        System.out.println(map);
    }
}


