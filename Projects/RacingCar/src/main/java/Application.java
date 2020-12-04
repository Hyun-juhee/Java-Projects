import domain.Car;
import domain.PlayGame;
import utils.InputValidator;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        RacingCarGame racingCarGame = new RacingCarGame();
        racingCarGame.play();
    }
}
