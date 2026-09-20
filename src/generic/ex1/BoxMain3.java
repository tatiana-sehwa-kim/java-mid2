package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정 : Integer
        integerBox.set(10);
//        integerBox.set("문자100"); 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();      // 문자형 제네릭 박스
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>(); // 뒤쪽 다이아몬드에 굳이 적지않아도 된다. 자바 컴파일러가 추론한다.


        //제네릭: 코드 재사용성, 타입 안전성 보장
    }
}
