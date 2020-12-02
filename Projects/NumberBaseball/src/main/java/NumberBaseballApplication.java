import com.sun.org.apache.xpath.internal.operations.Bool;
import domain.NumberBaseball;
import domain.TargetList;
import domain.UserList;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberBaseballApplication {
    private static final String INPUT_MESSAGE = "0~9 사이의 3가지 정수를 입력하시오 : ";
    private static final String WIN = "Win!";
    private static final String END_MESSAGE = "게임이 종료됐습니다. 다시 하려면 1, 종료하려면 0을 입력하세요.";
    private static final Integer QUIT = 0;
    private static final Integer NEW_GAME = 1;
    private static final String INPUT_AGAIN = "잘 못 입력하셨습니다. 다시 하려면 1, 종료하려면 0을 입력하세요.";

    public static void main(String[] args) {
        do {
            ArrayList<Integer> targetList = setTargetList();
            startGame(targetList);
        } while (isRestart());
    }

    private static ArrayList<Integer> setTargetList() {
        TargetList targetList = new TargetList();
        return targetList.getTargetList();
    }
    private static ArrayList<Integer> setUserList() {
        UserList userList = new UserList();
        return userList.getUserList();
    }
    private static void startGame(ArrayList<Integer> targetList) {
        while (true) {
            System.out.println(INPUT_MESSAGE);
            ArrayList<Integer> userList = setUserList();
            NumberBaseball numberBaseball = new NumberBaseball(targetList, userList);

            System.out.println(numberBaseball.getResult());
            if (numberBaseball.getResult() == WIN) {
                return;
            }
        }
    }
    private static Boolean isRestart() {
        System.out.println(END_MESSAGE);
        Scanner input = new Scanner(System.in);
        Integer userInput = input.nextInt();
        while (userInput != NEW_GAME && userInput != QUIT){
            System.out.println(INPUT_AGAIN);
            userInput = input.nextInt();
        }
        return userInput == NEW_GAME;
    }
}
