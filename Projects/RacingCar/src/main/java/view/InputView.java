package view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);
    private final String INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final String INPUT_TRY_NUMBER = "시도할 회수는 몇회인가요?";

    public String carNames() {
        System.out.println(INPUT_CAR_NAMES);
        return scanner.nextLine();
    }
    public int tryNumber() {
        System.out.println(INPUT_TRY_NUMBER);
        return scanner.nextInt();
    }
}
