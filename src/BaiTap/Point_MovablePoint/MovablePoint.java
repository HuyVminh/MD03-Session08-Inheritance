package BaiTap.Point_MovablePoint;

public class MovablePoint extends Point {
    private float xSpeed;

    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void getSpeed() {
        float[] arr = {xSpeed, ySpeed};
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return (super.toString() + ", speed={" + this.xSpeed + ", " + this.ySpeed + "}");
    }

    public void move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
//        return super.getXY();
    }
}
