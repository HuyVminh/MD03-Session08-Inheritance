package BaiTap.TrenLop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User student = new Student("minhhuy", "123456", "cowboii", "Môn Toán");
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = false;
        while (!isLogin) {
            System.out.println("=====LOGIN===============");
            System.out.println("Nhập username: ");
            String username = scanner.nextLine();
            System.out.println("Nhập mật khẩu :");
            String password = scanner.nextLine();
            if (student.login(username, password)) {
                student.displayData();
                isLogin = true;
            }
        }
    }
}
