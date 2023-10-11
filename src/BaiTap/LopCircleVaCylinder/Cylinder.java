package BaiTap.LopCircleVaCylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("chiều cao: " + height);
    }

    public double calTheTich() {
        return super.calArea() * height;
    }
}
