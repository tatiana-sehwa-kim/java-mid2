package collection.set.member;

import java.util.Objects;

public class MemberNoHashNoEq {     // eqals()와 hashCode() 둘다 재정의 하지 않음

    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
            "id='" + id + '\'' + '}';
    }
}
