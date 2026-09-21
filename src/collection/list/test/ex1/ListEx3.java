package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {

        // 사용자에게 n 개의 정수를 입력받아서 List 에 보관하고, 보관한 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
        //ListEx3 에 작성하자.

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int number=1;

        while (number !=0) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            } else {
                numbers.add(number);
            }
        }

        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }
        double average = (double) sum / numbers.size();

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
