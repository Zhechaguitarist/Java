package Users;

import java.util.Scanner;

public class UserMain {
    private int numOfUsers;

    public void setNumOfUsers(int numOfUsers) {
        this.numOfUsers = numOfUsers;
    }

    public int getNumOfUsers() {
        return numOfUsers;
    }

    public static void main(String[] args) {
        UserMain userMain = new UserMain();
        Scanner scanNumOfUsers = new Scanner(System.in);
        System.out.println("Введите количество пользователей");
        userMain.setNumOfUsers(scanNumOfUsers.nextInt());
        User user = new User();
        for(int i = 0;i<userMain.getNumOfUsers();i++){
            user.arrayOfUsers.add(new User());
        }
        for (User users : user.arrayOfUsers){
            System.out.println(users.getId() + " " + users.getName() + " " + users.getGender());
        }
    }
}
