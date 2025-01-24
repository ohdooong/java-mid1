package lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(10, 20);

        System.out.println("rectangle1 = " + rectangle1);
        System.out.println("rectangle2 = " + rectangle2);
        System.out.println("rectangle2 == rectangle1 = " + (rectangle2 == rectangle1));
        System.out.println(rectangle1.equals(rectangle2));
    }
}
