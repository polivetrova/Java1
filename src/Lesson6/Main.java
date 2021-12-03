package Lesson6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Mar");
        Dog dog = new Dog("Barker","gold", 10, true);

//        System.out.println(cat);
//        System.out.println(dog);

        /* sayWord(cat);
        sayWord(dog); */

        Animal[] animals = {cat, dog};

        for (Animal animal : animals) {
            sayWord(animal);
            animal.printInfo();

        }
    }

    public static void sayWord(Animal animal){ //в метод принимаются все дочерние классы и вообще все классы которые наследуют у энимал
        animal.voice();

    }


}
