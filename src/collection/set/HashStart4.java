package collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10 ;

    public static void main(String[] args) {

            //{1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];

        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        //검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex];   // O(1)
        System.out.println(result);

    }

    private static void add(Integer[] inputArray, int value) {      // 해시 인덱스를 먼저 구하고 그 위치에 데이터 저장
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    static int hashIndex(int value) {       // 값에 배열크키글 나누어 해시 인덱스를 반환한다.
        return value % CAPACITY;
    }
}

//  1, 11 처럼 같은 해시 인덱스가 나와버리면 저장할 위치가 충돌할 수 있다는 한계가 있다.
