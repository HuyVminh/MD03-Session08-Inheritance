package ThucHanh.LopKeThuaLop;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("pig");
        Dog dog1 = new Dog("Becgie", "Black");
        Dog dog2 = new Dog("Pug", "Yellow");
        Cat cat1 = new Cat("Dora");

        System.out.println("Animal1's name is : " + animal1.getName());
        animal1.setName("Bird");
        System.out.println("Animal1's name is : " + animal1.getName());
        dog1.setName("Corgi");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Color: " + dog1.getColor());
        System.out.println("Sound: " + dog1.makeSound());
        System.out.println("Name: " + dog2.getName());
        System.out.println("Color: " + dog2.getColor());
        System.out.println("Sound: " + dog2.makeSound());
        System.out.println("Name: " + cat1.getName());
        System.out.println("Sound: " + cat1.makeSound());
    }
}
