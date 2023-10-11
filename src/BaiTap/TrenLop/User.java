package BaiTap.TrenLop;

import java.util.Scanner;

public class User {
    private String userName;
    private String id;
    private String password;

    public User(String userName, String password, String id) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    public User() {

    }

    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean login(String userName, String password) {
        if (userName.equals(this.userName) && password.equals(this.password)) {
            System.out.println("Đăng nhập thành công");
            return true;
        } else {
            System.out.println("Đăng nhập thất bại");
            return false;
        }
    }

    public void displayData() {
        System.out.printf("Username: %s\n" +
                "Id: %s\n", userName, id);
    }
}
