package Lesson5;

public class Cat {

    protected String name;
    protected String color;
    private int age;

    private static int catCount;

    public Cat(String name, String color, int age) {
        this.name = name != null ? name.toUpperCase() : null;
        this.color = color != null ? color.toUpperCase() : null;
        this.age = age;
        catCount++;

        System.out.println("Hi, I'm " + this.name + "Total cat count: " + catCount);
    }

    public static int getCatCount(){
        return catCount;
    }

    public Cat(String name) {
        this(name, null, 0);  //дефолтные значения
    }

    void printInfo(){
        System.out.println(this);
    }

    public String toString(){
        return String.format("Котик %s имеет цвет %s и возраст %d%n", name, color, age);
    }

    //setName setAge getName getAge - геттеры и сеттеры, обращение к полям, у которых закрытые модификаторы доступа (типа в другом классе стоит прайват и в этом классе мы к нему можем обратиться только через геттеры и сеттеры)

    public int getAge(){
        return age;
    }

    public void setAge(int age){ // если будет ошибка, то ошибка будет выведена, но новое значение задано не будет
        if(age >= 0 && age < 30) {
            this.age = age;
        } else {
            System.err.println("Incorrect age.");
        }
    }





}
