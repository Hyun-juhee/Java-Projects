import domain.NumberBaseball;
import domain.TargetList;
import domain.UserList;

public class main {
    public static void main(String[] args) {
        TargetList targetList = new TargetList();
        while (true) {
            System.out.println("0~9 사이의 3가지 정수를 입력하시오 : ");
            UserList userList = new UserList();
            for (int i = 0; i < 3; i ++) {
                System.out.println(targetList.getTargetList().get(i));
            }
            NumberBaseball numberBaseball = new NumberBaseball(targetList, userList);
            System.out.println(numberBaseball.getResult());
            if (numberBaseball.getResult() == "Win!") {
                return;
            }
        }
    }
}
