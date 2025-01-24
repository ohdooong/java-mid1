package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        ImmutableObj added = immutableObj.add(20);

        System.out.println("added = " + added);
    }
}
