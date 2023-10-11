package ThucHanh.LopKeThuaLop2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "black");
        Car car2 = new Car("Ford", "blue");
        // truy cập phương thức của lớp cha
        System.out.println("Car 1's brand is: " + car1.getBrand());
        car1.setColor("yellow");
        // hiển thị thông tin của xe ô tô
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        Motorcycle moto1=new Motorcycle("Honda","grey");
        Motorcycle moto2=new Motorcycle("Yamaha","red");
        // hiển thị thông tin của xe máy
        System.out.println(moto1.toString());
        System.out.println(moto2.toString());


    }
}
