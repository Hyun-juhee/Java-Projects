/**
 * 3자리 난수 생성
 * 서로 다른 0~9사이의 정수
 */
package domain;

import java.util.ArrayList;
import java.util.Random;

public class TargetList {
    private ArrayList<Integer> targetList = new ArrayList<Integer>();

    public TargetList() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            Integer temp = random.nextInt(9);
            while (targetList.contains(temp)) {
                temp = random.nextInt(9);
            }
            this.targetList.add(temp);
        }
    }

    public ArrayList<Integer> getTargetList() {
        return targetList;
    }
}
