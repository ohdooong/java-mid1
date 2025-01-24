package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();
        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        // 모든 자바 프로젝트에서 호환이 가능하다.
        System.out.println("전달된 객체의 수는 = " + objects.length);
    }
}
