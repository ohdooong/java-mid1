package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object클래스의 메서드
        String childString = child.toString();
        System.out.println(childString); // 객체 정보 반환 여기서는 클래스정보 + @ + 해시코드
    }
}
