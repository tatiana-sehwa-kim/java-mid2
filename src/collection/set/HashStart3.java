package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {

        // 입력: {1, 2, 5, 8, 14, 99}
        // [null, 1, 2, null, null, 5, null, null, 8, null, ..., 14, ..., 99]   "메모리 낭비"

        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;      // 데이터의 값을 인덱스로 사용해서 저장했다.
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}

//  배열에 낭비되는 공간이 많이 발생한다. 