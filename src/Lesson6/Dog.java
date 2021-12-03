package Lesson6;

public class Dog extends Animal{

    protected boolean isBark = false;

    public Dog(String name, String color, int age, boolean isBark) {
        super(name, color, age); //в конструкторе обязательно на первой строчке
        this.isBark = isBark;
    }

    public Dog(String name){
        super(name);
    }

    @Override
    public String toString(){
        return "Dog {" + super.toString() + " isBark=" + isBark + '}';
    //super.toString() - обращение к тустрингу из класса энимал - они будут выведены в консоль вместе
    }

    @Override
    public void voice() {
        System.out.println("baw baw");

    }
}
