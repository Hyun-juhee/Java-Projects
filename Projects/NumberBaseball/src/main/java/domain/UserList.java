/**
 * 사용자가 3 자리 수 입력
 * 서로 다른 0~9사이의 정수
*/
package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class UserList {
    private final int LENGTH = 3;
    private ArrayList<Integer> userList = new ArrayList<Integer>();

    public UserList() {
        userList = setUserList();
    }

    private ArrayList<Integer> setUserList() {
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < LENGTH; i++) {
            inputList.add(input.nextInt());
        }
        return inputList;
    }

    public ArrayList<Integer> getUserList() {
        return userList;
    }
}
