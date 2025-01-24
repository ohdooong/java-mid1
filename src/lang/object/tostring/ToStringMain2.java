package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car hyundai = new Car("HYUNDAI");
        Dog dog = new Dog("멍멍이1", 13);
        Dog dog2 = new Dog("멍멍이2", 14);

        System.out.println("1. 단순 toString()호출");
        System.out.println("hyundai = " + hyundai.toString());
        System.out.println("dog = " + dog.toString());
        System.out.println("dog2 = " + dog2.toString());
        System.out.println();


        System.out.println("2. println내부에서 toString()호출");
        System.out.println("hyundai = " + hyundai);
        System.out.println("dog = " + dog);
        System.out.println("dog2 = " + dog2);
        System.out.println();

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(hyundai);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(dog2);

        // 해시코드 값 직접 보고 싶을때
        String hexString = Integer.toHexString(System.identityHashCode(dog));
        String hexString2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("dog = " + hexString);
        System.out.println("dog2 = " + hexString2);
    }
}
