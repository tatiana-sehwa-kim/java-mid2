package collection.set.member;

import java.util.Objects;

public class Member {                                   // equals()와 hashCode() 둘다 재정의 했을 때
    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override     // alt insert : equals and hashCode 선택 (자동생성)
    public boolean equals(Object o) {                       // "어떤 녀석(o)이든 일단 다 받아와서 비교하겠다."
        if (o == null || getClass() != o.getClass())        // "비교할 가치도 없는 녀석은 바로 입구 컷(false)!"
            return false;                                   // o == null: 비교하라고 건네준 게 빈 껍데기(null)면 당연히 같은 사람일 리 없으니 탈락. || 나는 Member인데, 상대방이 뜬금없이 String이나 Dog 객체를 들고 왔으면 탈락
        Member member = (Member) o;                         // "포장지 벗기기 (다운캐스팅)" Member로 형변환
        return Objects.equals(id, member.id);               // 진짜 문자열이 같은지 비교
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);        // id 값 기반으로 해시코드 쉽게 만드는 유틸리티
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
