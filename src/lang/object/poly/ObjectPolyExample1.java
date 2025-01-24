package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) {
        // object.sound(); // 컴파일 에러 => Object에는 sound메서드가 없다.
        // object.move(); // 컴파일 에러 => Object에는 move메서드가 없다.

        // 객체에 맞는 다운캐스팅이 필요함.
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }
    }
}
