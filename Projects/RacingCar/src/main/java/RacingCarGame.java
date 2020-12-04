import domain.Car;
import domain.PlayGame;
import utils.InputValidator;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;

public class RacingCarGame {
    private ArrayList<Car> cars = new ArrayList<>();
    private InputView input = new InputView();
    private InputValidator inputValidator = new InputValidator();
    private OutputView outputView = new OutputView();
    private PlayGame playGame = new PlayGame();
    private ArrayList<Integer> maxWinnerIndex = new ArrayList<Integer>();
    private final String OK = "ok";

    public void startGame() {
        // 자동차 이름 input
        String carNames = input.carNames();
        String inputValidateResult = inputValidator.getValidateResult(carNames);

        while (inputValidateResult != OK) {
            System.out.println(inputValidateResult);
            carNames = input.carNames();
            inputValidateResult = inputValidator.getValidateResult(carNames);
        }

        String[] carNameList = carNames.split(",");
        for (String item: carNameList) {
            cars.add(new Car(item));
        }

        // 시행 횟수 input
        int tryNumber = input.tryNumber();

        // 매 시행마다 return
        for (int i = 0; i < tryNumber; i++) {
            for (Car item: cars) {
                if (playGame.getMove()) {
                    item.move();
                }
                System.out.println(outputView.getOuputMessage(item.getName(), item.getPosition()));
            }
            System.out.println();
        }

        // 최종 우승자 output
        maxWinnerIndex.add(0);
        for (int i = 1; i < cars.size(); i ++) {
            if (cars.get(i).getPosition() > cars.get(maxWinnerIndex.get(0)).getPosition()) {
                maxWinnerIndex.clear();
                maxWinnerIndex.add(i);
            } else if (cars.get(i).getPosition() == cars.get(maxWinnerIndex.get(0)).getPosition()) {
                maxWinnerIndex.add(i);
            }
        }
        System.out.println(outputView.getWinner(cars, maxWinnerIndex));
    }
}
