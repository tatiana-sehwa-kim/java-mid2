package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {    // 성능 젤 구린 HashSet

    private int[] elementData = new int[10];                // 예제에서는 단순함을 위해 배열에 데이터를 저장한다. 배열의 크기도 10으로 고정했다.
    private int size = 0;

    // O(n)
    public boolean add(int value) {
        if (contains(value)) {          // 중복이 있으면 false
            return false;
        }

        elementData[size] = value;      // 값이 들어가면 true
        size ++;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        for (int data : elementData) {          // 값이 있는지 없는지 다 뒤져봐야한다. Array니깐
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +     // 그냥 elementData만 쓰면 빈칸까지 다나옴.
                ", size=" + size +
                '}';
    }
}
