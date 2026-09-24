package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {

        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));      // 그냥 inputArray 출력하면 주소값나옴

        int searchValue = 8;            // 검색 값 8
        // 4번 반복 O(n)
        for (Integer inputValue : inputArray) {     //  배열에서 특정 데이터를 찾는 성능은 O(n)으로 느리다
            if (inputValue == searchValue) {
                System.out.println("inputValue = " + inputValue);
            }
        }
    }
}

// inputArray = [1, 2, 5, 8]
// inputValue = 8