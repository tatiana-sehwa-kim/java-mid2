package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {

        // ArrayEx1 는 배열을 사용한다. 이 코드를 배열 대신에 리스트를 사용하도록 변경하자.
        // 다음 코드와 실행 결과를 참고해서 리스트를 사용하는 ListEx1 클래스를 만들어라.

        List<Integer> students = new ArrayList<> (List.of (90,80,70,60,50) );

//        students.add(90);     // 어쩌구를 저걸 맨위에 한줄로 쓸수있다. 추가삭제도 가능함.
//        students.add(80);     // 근데 List<Integer> students = List.of(90, 80, 70, 60, 50); 라고 쓰면 고정값으로 끝남. 추가삭제 불가능.

        int total = 0;
        for (Integer student : students) {
            total += student;
        }
        double average = (double) total / students.size();

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
