package BaiTap.LopCircleVaCylinder;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayData() {
        System.out.println("Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}');
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double calArea() {
        return radius * radius * 3.14;
    }
}
