package Lesson5;

public class Main {


    public static void main(String[] args) {
        Cat cat1 = new Cat("June", "black", 3);
        Cat cat2 = new Cat("Canny", "triple", 2);
        Cat cat3 = new Cat("Shava");
        Cat cat4 = new Cat ("Hj", "dkls", 6);

        cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();
        cat4.printInfo();

        System.out.println("total cat count: " + Cat.getCatCount());

    }

}
