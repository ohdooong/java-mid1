package lang.immutable.change;

import lang.immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
    public ImmutableObj add(int addValue) {
        // 불변 객체에 다음과 같이 값 변경이 필요한 경우 새 객체를 만들어서 반환해준다.

        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }
}
