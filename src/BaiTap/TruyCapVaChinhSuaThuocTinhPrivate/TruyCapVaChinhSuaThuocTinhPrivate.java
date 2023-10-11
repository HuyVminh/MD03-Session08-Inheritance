package BaiTap.TruyCapVaChinhSuaThuocTinhPrivate;

import java.util.Scanner;

public class TruyCapVaChinhSuaThuocTinhPrivate {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần hiển thị");
        String str = scanner.nextLine();
        myClass.setMyString(str);
        System.out.println("myClass có chuỗi là"+myClass.getMyString());
    }
}
