package BaiTap.XayDungCacPhuongThucTinh;

import java.util.Scanner;

import static BaiTap.XayDungCacPhuongThucTinh.StaticMethod.*;

public class XayDungCacPhuongThucTinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("=======MENU================\n" +
                    "1. Tính diện tích hình tròn\n" +
                    "2. Tính diện tích hình chữ nhật\n" +
                    "3. Tính diện tích hình tam giác\n" +
                    "4. Thoát\n" +
                    "Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập bán kính hình tròn :");
                    double r = scanner.nextDouble();
                    System.out.println("Diện tích hình tròn có bán kính r = " + r + " là = " + calCircleArea(r));
                    break;
                case 2:
                    System.out.println("Nhập chiều rộng của hình chữ nhật :");
                    double width = scanner.nextDouble();
                    System.out.println("Nhập chiều cao của hình chữ nhật :");
                    double height = scanner.nextDouble();
                    System.out.println("Diện tích hình chữ nhật có chiều rộng width = " + width + ", chiều cao height = " + height + " là = " + calRectangleArea(width, height));
                    break;
                case 3:
                    System.out.println("Nhập cạnh a của hình tam giác :");
                    double a = scanner.nextDouble();
                    System.out.println("Nhập cạnh b của hình tam giác :");
                    double b = scanner.nextDouble();
                    System.out.println("Nhập cạnh c của hình tam giác :");
                    double c = scanner.nextDouble();
                    System.out.println("Diện tích hình chữ nhật có các cạnh lần lượt là ( " + a + ", " + b + ", " + c + " )" + " là = " + calTriangleArea(a, b, c));
                    break;
                case 4:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    break;
            }
        }
    }
}
