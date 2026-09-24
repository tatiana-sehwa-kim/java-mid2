package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {

        MyHashSetV1 set = new MyHashSetV1(10);      // 배열의 크기를 10으로 지정
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);     // hasnIndex 중복
        System.out.println(set);

        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}

// MyHashSetV1{buckets=[[], [1], [2], [], [14], [5], [], [], [8], [99, 9]], size=7}
// bucket.contains(9) = true
// removeResult = true
// MyHashSetV1{buckets=[[], [1], [2], [], [14], [5], [], [], [8], [99]], size=6}

//  남은 문제
//  해시 인덱스를 사용하려면 데이터의 값을 배열의 인덱스로 사용해야 한다. 그런데 배열의 인덱스는 0, 1, 2 같은 숫자만 사용할 수 있다. "A", "B"와 같은 문자열은 배열의 인덱스로 사용할 수 없다.
//  숫자가 아닌 문자열 데이터를 저장할 때, 해시 인덱스를 사용하려면 어떻게 해야할까?
