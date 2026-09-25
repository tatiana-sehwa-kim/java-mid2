package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {

        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());     // m1.hashCode() = 980546781
        System.out.println("m2.hashCode() = " + m2.hashCode());     // m2.hashCode() = 140435067
        System.out.println("m1.equals(m2) = " + m1.equals(m2));     // m1.equals(m2) = false
                                                                    // m1 과 m2 의 해시 코드가 서로 다르기 때문에 다른 위치에 각각 저장된다.
        set.add(m1);        // 저장
        set.add(m2);        // 저장
        System.out.println(set);        // MyHashSetV2{buckets=[[], [MemberNoHashNoEq{id='A'}], [], [], [], [], [], [MemberNoHashNoEq{id='A'}], [], []], size=2, capacity=10}

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");                       // 회원 id가 "A"인 객체를 검색하기 위해 회원 id가 "A"인 객체를 만들었다.
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());       // searchValue.hashCode() = 2001049719          <- 그것의 참조값
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);                 // contains = false
    }
}
