package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

//        Object object = objectBox.get();          // 다운캐스팅. Object 를 Integer 로 다운캐스팅 이 두줄을 아래 한줄로 줄여서
//        Integer integer = (Integer) object;       // Ctrl Alt N 누르면 합쳐짐.

        Integer integer = (Integer) integerBox.get();   // -> Object가 Integer로 캐스팅
        System.out.println("Integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();   // -> Object가 String으로 캐스팅
        System.out.println("str = " + str);

        // Object로 다형성으로 중복을 해결해봤다. 하지만 문제가 있음.

        // 잘못된 타입의 인수 전달시
        integerBox.set("문자100");
//        Integer result = integerBox.get();  // String -> Integer 캐스팅 예외. 타입다르자나 하고 예외 터짐
//        System.out.println("result = " + result);

    }
}

//BoxMain1 : 각각의 타입별로 IntegerBox , StringBox 와 같은 클래스를 모두 정의
//코드 재사용X
//타입 안전성O

//BoxMain2 : ObjectBox 를 사용해서 다형성으로 하나의 클래스만 정의
//코드 재사용O
//타입 안전성X

// -> 제네릭이 필요한 이유