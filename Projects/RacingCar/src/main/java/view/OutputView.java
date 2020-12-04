package view;

import domain.Car;

import java.util.ArrayList;

public class OutputView {
    public String getOuputMessage(String carName, int position) {
        return setOuputMessage(carName, position);
    }

    public String getWinner(ArrayList<Car> cars, ArrayList<Integer> maxWinnerIndex) {
        return setWinner(cars, maxWinnerIndex);
    }

    private String setOuputMessage(String carName, int position) {
        String outputMessage = carName + " : ";
        for (int i = 0; i < position; i++) {
            outputMessage += "-";
        }
        return outputMessage;
    }

    private String setWinner(ArrayList<Car> cars, ArrayList<Integer> maxWinnerIndex) {
        String outputMessage = "최종 우승자 : ";
        for (int i = 0; i < maxWinnerIndex.size(); i++) {
            if (i > 0) {
                outputMessage += ", " + cars.get(i).getName();
            } else {
                outputMessage += cars.get(i).getName();
            }
        }
        return outputMessage;
    }
}
