package collection.set;

public interface Myset<E> {     // My를 빼면 자바 기본 제공 set이 있음
                                // 타입 안전성이 높은 제네릭 HashSet
    boolean add(E element);
    boolean remove(E value);
    boolean contains(E value);

}
