package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA"); // 대문자 주의!
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());             // hi.hashCode() = 3329
        System.out.println("JPA.hashCode() = " + jpa.hashCode());           // JPA.hashCode() = 73659
        System.out.println("java.hashCode() = " + java.hashCode());         // java.hashCode() = 3254818
        System.out.println("spring.hashCode() = " + spring.hashCode());     // spring.hashCode() = -895679987

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);    // MyHashSetV2{buckets=[[], [], [], [], [], [], [], [Member{id='spring'}], [Member{id='java'}], [Member{id='hi'}, Member{id='JPA'}]], size=4, capacity=10}

        // 검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);    // set.contains(Member{id='JPA'}) = true
    }
}
