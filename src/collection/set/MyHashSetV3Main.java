package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {

        Myset<String> set = new MyHashSetV3<>(10);      // 제네릭: String 형 10칸짜리 HashSet 생성
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);        // MyHashSetV3{buckets=[[], [], [], [], [], [A], [B], [C], [], []], size=3, capacity=10}

        // 검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);        // set.contains(A) = true


        Myset<Integer> set2 = new MyHashSetV3<>(10);        // 제네릭: int 형 10칸짜리 HashSet 생성
    }
}
