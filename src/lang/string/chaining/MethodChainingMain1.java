package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        valueAdder.add(2);
        valueAdder.add(3);
        valueAdder.add(4);

        System.out.println("valueAdder = " + valueAdder.getValue());
    }
}
