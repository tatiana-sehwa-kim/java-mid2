package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {

        //입력: 1,2,5,8

        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;      // 데이터의 값을 인덱스로 사용해서 저장했다.
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int serchValue = 8;
        Integer result = inputArray[serchValue];    //O(1)  연산 한번만에 찾는다
        System.out.println("result = " + result);
    }
}

//  inputArray = [null, 1, 2, null, null, 5, null, null, 8, null]
//  result = 8

//  배열에 낭비되는 공간이 많이 발생한다.