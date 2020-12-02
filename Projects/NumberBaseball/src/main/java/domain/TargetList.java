/**
 * 3자리 난수 생성
 * 서로 다른 0~9사이의 정수
 */
package domain;

import java.util.ArrayList;
import java.util.Random;

public class TargetList {
    private final int MAX_NUM = 9;
    private final int LENGTH = 3;
    private ArrayList<Integer> targetList = new ArrayList<Integer>();

    public TargetList() {
        this.targetList = setTargetList();
    }
    private ArrayList<Integer> setTargetList() {
        Random random = new Random();
        ArrayList<Integer> randomNumberList = new ArrayList<Integer>();

        for (int i = 0; i < LENGTH; i++) {
            Integer temp = random.nextInt(MAX_NUM);
            while (randomNumberList.contains(temp)) {
                temp = random.nextInt(MAX_NUM);
            }
            randomNumberList.add(temp);
        }
        return randomNumberList;
    }

    public ArrayList<Integer> getTargetList() {
        return targetList;
    }
}
