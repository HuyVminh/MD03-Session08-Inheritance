package BaiTap.LopCircleVaCylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, "red", 15);
        cylinder.displayData();
        System.out.println("Diện tích của hình tròn là :"+cylinder.calArea());
        System.out.println("Thể tích là :"+cylinder.calTheTich());
    }
}
