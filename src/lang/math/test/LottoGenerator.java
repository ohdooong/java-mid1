package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        count = 0;
        lottoNumbers = new int[6];
        while (count < 6) {
            // 새로운 번호 생성
            int newNumber = random.nextInt(45) + 1;
            // 중복검사
            if (isUnique(newNumber)) {
                lottoNumbers[count] = newNumber;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
