package BaiTap.LopTriangle;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "color='" + color;
    }
}
