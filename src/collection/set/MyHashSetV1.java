package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();      // Ctrl Alt M 으로 중복 메서드 추출 -> initBuckets
    }

    public MyHashSetV1(int capacity) {                  // 초기 배열의 크기를 생성자를 통해서 전달
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {                        // buckets : 연결 리스트를 배열로 사용한다.
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {            //                배열안에 연결 리스트가 들어있고, 연결 리스트 안에 데이터가 저장된다.
            buckets[i] = new LinkedList<>();            //                해시 인덱스가 충돌이 발생하면 같은 연결 리스트 안에 여러 데이터가 저장된다.
        }
    }

    public boolean add(int value) {             // 해시 인덱스를 사용해서 데이터를 보관한다.
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];    //O(1)
        if (bucket.contains(value)) {                       //O(1)에 가까운 O(n) -> 데이터가 1개만 있을 경우가 많음
            return false;
        }
        bucket.add(value);
        size ++;
        return true;
    }

    public boolean contains(int searchValue) {          // 해시 인덱스를 사용해서 데이터를 확인한다.
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];    //O(1)
        return bucket.contains(searchValue);         // O(1)에 가까운 O(n), 하나하나 검사하는 for문이 contains에서 돌아간 셈
    }

    public boolean remove(int value) {              // 해시 인덱스를 사용해서 데이터를 제거한다.
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];        //O(1)
        boolean result = bucket.remove(Integer.valueOf(value));     //O(1)에 가까운 O(n), 그냥 value를 넣으면 인덱스로 지워져버린다. (메서드 두개임) Integer.valueOf(value) 를 하면 버킷안의 값을 찾아 지우게된다.
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
