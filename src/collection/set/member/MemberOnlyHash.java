package collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {                        // hashCode() 만 재정의 했을 때

    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }

    // equals() 삭제. hashCode() 만 존재

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
