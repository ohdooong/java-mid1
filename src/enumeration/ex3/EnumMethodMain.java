package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

	public static void main(String[] args) {
		// 모든 Enum 반환
		Grade[] values = Grade.values();
		System.out.println("values = " + Arrays.toString(values));
		for (Grade val : values) {
			// 이름, 순서
			System.out.println("name = " + val.name() + ", ordinal = " + val.ordinal());
		}

		// String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
		String input = "GOLD";
		Grade gold = Grade.valueOf(input);
	}

}
