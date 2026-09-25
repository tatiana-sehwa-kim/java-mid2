package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);         // 추가
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 90);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);         // {studentB=80, studentA=90, studentD=100, studentC=90} 순서 보장 X

        //특정 학생의 값 조회
        Integer result = studentMap.get("studentD").hashCode();
        System.out.println("result = " + result);       // result = 100 (자바의 Integer 클래스는 자신의 숫자 값 자체를 해시코드로 반환하도록 만들어져 있기 때문)

        System.out.println("KeySet 활용");               // 키만 필요할때: .keyset(); + iter
        Set<String> keySet = studentMap.keySet();       // 키들을 반환. Set 자료구조로 반환 (중복 X 순서보장 X )
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);

//                key = studentB, value = 80
//                key = studentA, value = 90
//                key = studentD, value = 100
//                key = studentC, value = 90
        }

        System.out.println("entrySet 활용");                                 // 키와 값 둘다 동시에 필요할때: .entrySet(); + iter
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();    // entrySet: <키, 값> 쌍 객체들의 Set (중복 X 순서보장 X)
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);

//                key = studentB, value = 80
//                key = studentA, value = 90
//                key = studentD, value = 100
//                key = studentC, value = 90
        }

        System.out.println("values 활용");                       // 값만 필요할 때: .values(); + iter
        Collection<Integer> values = studentMap.values();       // 얘는 Set구조가 아니라 컬렉션으로 나옴. 중복이 될수도 있어서 (Set의 부모 인터페이스)
        for (Integer value : values) {
            System.out.println("value = " + value);

//                value = 80
//                value = 90
//                value = 100
//                value = 90
        }
    }
}
