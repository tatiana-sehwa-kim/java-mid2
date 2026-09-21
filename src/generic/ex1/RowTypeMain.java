package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();   // <> 사용하지 않고 생성: 로타입(옛날버전 호환)
//        GenericBox<Object> integerBox = new GenericBox<>(); // 권장. 오브젝트가필요하면
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
