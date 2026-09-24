package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';   // 문자 하나만 char
        char charB = 'B';
        System.out.println("charA = " + (int) charA);    // 캐스팅     // charA = 65
        System.out.println("charB = " + (int) charB);                 // charB = 66

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));          // hashCode('A') = 65
        System.out.println("hashCode('B') = " + hashCode("B"));          // hashCode('B') = 66
        System.out.println("hashCode('AB') = " + hashCode("AB"));          // hashCode('AB') = 131

        //hashIndex
        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCodeA);
        System.out.println("hashIndex = " + hashIndex);                   // hashIndex = 5

        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));            // hashIndex(A) = 5
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));            // hashIndex(B) = 6
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));            // hashIndex(AB) = 1
    }

    static int hashCode(String string) {            // hashCode를 통과하면 문자가 숫자로 바뀐다.
        char[] charArray = string.toCharArray();        // 문자열(String)을 한 글자씩 쪼개서 char 배열(char[])로 바꿔주는 기본 메서드
        int sum = 0;
        for (char c : charArray) {
            sum += (int)c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
