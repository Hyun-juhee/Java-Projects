/**
 * 사용자가 3 자리 수 입력
 * 서로 다른 0~9사이의 정수
*/
package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class UserList {
    private ArrayList<Integer> userList = new ArrayList<Integer>();

    public UserList() {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            this.userList.add(input.nextInt());
        }
    }

    public ArrayList<Integer> getUserList() {
        return userList;
    }
}
