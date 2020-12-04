package view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);
    private final String INPUT_CAR_NAMES = "자동차의 이름을 ,로 구분해서 입력하시오.";
    private final String INPUT_TRY_NUMBER = "시도 횟수를 입력하시오.";

    public String carNames() {
        System.out.println(INPUT_CAR_NAMES);
        return scanner.nextLine();
    }
    public int tryNumber() {
        System.out.println(INPUT_TRY_NUMBER);
        return scanner.nextInt();
    }
}
