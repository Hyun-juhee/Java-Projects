package domain;

import java.util.Random;

public class PlayGame {
    private Boolean isMove;
    private int randomNumber;
    private int MAX_NUMBER = 9;

    private void setRandomNumber() {
        Random random = new Random();
        this.randomNumber =  random.nextInt(MAX_NUMBER);
    }
    private void setIsMove() {
        setRandomNumber();
        if (this.randomNumber < 4) {
            this.isMove = false;
        } else {
            this.isMove = true;
        }
    }
    public Boolean getMove() {
        setIsMove();
        return isMove;
    }
}
