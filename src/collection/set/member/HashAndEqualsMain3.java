package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {

        //중복 등록 안됨
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());     // m1.hashCode() = 65
        System.out.println("m2.hashCode() = " + m2.hashCode());     // m2.hashCode() = 65
        System.out.println("m1.equals(m2) = " + m1.equals(m2));     // m1.equals(m2) = true


        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));         // System.identityHashCode(m1) = 2061475679 인스턴스 주소가 다름
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));         // System.identityHashCode(m2) = 140435067

        set.add(m1);        // m1 저장
        set.add(m2);        // m2 중복으로 탈락
        System.out.println(set);        // MyHashSetV2{buckets=[[], [], [], [], [], [Member{id='A'}], [], [], [], []], size=1, capacity=10}

        // 검색 성공
        Member searchValue = new Member("A");                       // 회원 id가 "A"인 객체를 검색하기 위해 회원 id가 "A"인 객체를 만들었다.
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());       // searchValue.hashCode() = 65
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);                 // contains = true   (인스턴스 주소는 다르지만 문자열이 같기 때문에)
    }
}
