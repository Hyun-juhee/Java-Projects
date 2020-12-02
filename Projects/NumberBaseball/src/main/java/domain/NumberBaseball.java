package domain;

public class NumberBaseball
{
    private TargetList targetList;
    private UserList userList;
    private Integer ballCnt = 0;
    private Integer strikeCnt = 0;
    private String result = "";

    public NumberBaseball(TargetList targetList, UserList userList) {
        this.targetList = targetList;
        this.userList = userList;

        for (int i = 0; i < 3; i++) {
            if (this.targetList.getTargetList().contains(this.userList.getUserList().get(i))) {
                this.ballCnt ++;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (this.targetList.getTargetList().get(i) == this.userList.getUserList().get(i)) {
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
