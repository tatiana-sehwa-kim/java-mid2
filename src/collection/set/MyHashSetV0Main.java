package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {

        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);     //O(1)
        set.add(2);     //O(n) 데이터의 add는 사실상 O(n) 이라 보면 된다.
        set.add(3);     //O(n)
        set.add(4);     //O(n)
        set.add(5);     //O(n)
        System.out.println(set);

        boolean result = set.add(4);    // 중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);
        System.out.println("set.contains(3) = " + set.contains(3));     //O(n)
        System.out.println("set.contains(99) = " + set.contains(99));     //O(n) 성능이 다 이거임. 데이터가 많을수록 효율이 떨어진다.

    }
}

