package Lesson6;

public abstract class Animal { //шаблон, который не может иметь своих экзаемлпяров типа new AnimaL(); не прокатит - реализуется такой класс только в Cat и Dog и тд

    protected String name;
    private String color; //нужен сеттер (прописать его надо именно в энимал)
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public Animal(String name){
        this(name, "black", 0);
    }

    @Override
    public String toString(){
        return "Animal{" + "name = " + name + '\'' + ", color='" + color + '\''+ ", age= '" + age + '}';
    }

    public abstract void voice(); // пустой здесь - его обязательно надо реализовать в дочерних классах

    public void printInfo(){
        System.out.println(this);
    }

}

