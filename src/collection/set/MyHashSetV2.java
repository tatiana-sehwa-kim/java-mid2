package collection.set;

import java.util.Arrays;                                          // HashSet:  추가(add), 검색(contains), 삭제(remove)를 모두
import java.util.LinkedList;                                      // O(1)(즉시)의 속도로 끝내기 위해 고안된 자료구조
                                                                  // 대신 치르는 대가 1. 순서를 포기 2. 메모리를 더 소비
public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;          // Integer -> Object    모든 데이터를 담

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {                            // 1. 첫 번째 생성자: 기본 옵션 (아무것도 안 정했을 때)
        initBuckets();                                  //   사용 예시: MyHashSetV2 set = new MyHashSetV2();
    }                                                   //   "기본으로 세팅된 값(DEFAULT_INITIAL_CAPACITY = 16칸)으로 사물함 만들어줘."

    public MyHashSetV2(int capacity) {                // 2. 두 번째 생성자: 사용자 지정 옵션 (크기를 직접 정하고 싶을 때)
        this.capacity = capacity;                       //   사용 예시: MyHashSetV2 set = new MyHashSetV2(10);
        initBuckets();                                  //   "처음부터 10칸짜리 사물함으로 만들어줘."
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {                      // int -> Object
        int hashIndex = hashIndex(value);                                            // 1. 방 번호 계산 (예: 3번 방)
        LinkedList<Object> bucket = buckets[hashIndex];     // Integer -> Object     // 2. 3번 칸에 꽂혀있는 비닐봉지를 손으로 집어 듦
        if (bucket.contains(value)) {                                                // 3. 그 봉지 안에 이미 있나 검사
            return false;
        }
        bucket.add(value);                                                           // ④ 그 봉지 안에 쏙 집어넣음
        size ++;
        return true;
    }

    public boolean contains(Object searchValue) {       // int -> Object
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];     // Integer -> Object
        return bucket.contains(searchValue);
    }

    public boolean remove(Object value) {               // int -> Object
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];     // Integer -> Object
        boolean result = bucket.remove(value);          // 이젠 그냥 Object니깐 그냥 value를 지우면 된다함.
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;             // 음수가 나올수 있어서 절대값(양수)로 바꿔준 뒤 나누기
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
