package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        // 각각의 단어가 나타난 수를 출력해라

        String text = "orange banana apple apple banana apple";

        String[] fruits = text.split(" ");          // 스플릿 후 배열화
        Map<String, Integer> map = new HashMap<>();         // 맵 생성

        for (String fruit : fruits) {
            Integer count = map.get(fruit);         // 원래 있었나 확인 밸류가 몇인가
            if (count == null) {                    // 없으면
                count = 0;                          // 0으로 시작
            }
            count ++;                               // 한번 카운트
            map.put(fruit, count);                  // 과일이름(키)와 카운트
        }

        System.out.println(map);
    }
}


