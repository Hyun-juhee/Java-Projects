package domain;

import java.util.ArrayList;

public class NumberBaseball
{
    private ArrayList<Integer> targetList;
    private ArrayList<Integer> userList;
    private Integer ballCnt = 0;
    private Integer strikeCnt = 0;
    private String result = "";

    public NumberBaseball(ArrayList<Integer> targetList, ArrayList<Integer> userList) {
        this.targetList = targetList;
        this.userList = userList;

        for (int i = 0; i < 3; i++) {
            if (this.targetList.contains(this.userList.get(i))) {
                this.ballCnt ++;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (this.targetList.get(i) == this.userList.get(i)) {
                this.strikeCnt ++;
            }
        }

        if (this.ballCnt == 0 && this.strikeCnt == 0) {
            this.result = "Out";
        } else if (this.strikeCnt == 3) {
            this.result = "Win!";
        } else {
            this.result = Integer.toString(ballCnt) + " Ball / " + Integer.toString(strikeCnt) + " Strike";
        }
    }

    public String getResult() {
        return result;
    }
}
