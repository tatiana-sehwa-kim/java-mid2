package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {

        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());     // m1.hashCode() = 65
        System.out.println("m2.hashCode() = " + m2.hashCode());     // m2.hashCode() = 65
        System.out.println("m1.equals(m2) = " + m1.equals(m2));     // m1.equals(m2) = false

        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));         // System.identityHashCode(m1) = 2061475679 인스턴스 주소가 다름
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));         // System.identityHashCode(m2) = 140435067

        set.add(m1);        // 저장됨
        set.add(m2);        // 저장됨
        System.out.println(set);        // MyHashSetV2{buckets=[[], [], [], [], [], [MemberOnlyHash{id='A'}, MemberOnlyHash{id='A'}], [], [], [], []], size=2, capacity=10}

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");                       // 회원 id가 "A"인 객체를 검색하기 위해 회원 id가 "A"인 객체를 만들었다.
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());       // searchValue.hashCode() = 65
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);                 // contains = false   (해시코드는 같지만 인스턴스 주소가 다르기 때문에)
    }
}
