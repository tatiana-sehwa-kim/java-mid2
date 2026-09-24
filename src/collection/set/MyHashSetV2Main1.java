package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);    // MyHashSetV2{buckets=[[], [AB], [], [], [], [A], [B, SET], [C], [D], []], size=6, capacity=10}

        System.out.println("A.hashCode() = " + "A".hashCode());     // A.hashCode() = 65
        System.out.println("B.hashCode() = " + "B".hashCode());     // B.hashCode() = 66
        System.out.println("AB.hashCode() = " + "AB".hashCode());   // AB.hashCode() = 2081
        System.out.println("SET.hashCode() = " + "SET".hashCode());     // SET.hashCode() = 81986

        //검색
        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);       // set.contains(SET) = true
    }
}
