package generic.ex1;

public class GenericBox<T> {    // 클래스명 오른쪽에 <T> 와 같이 선언하면 제네릭 클래스가 된다. 여기서 T 를 타입 매개변수라 한다. 이 타입 매개변수는 이후에 Integer , String 으로 변할 수 있다.

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
