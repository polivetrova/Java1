package lesson2;

public class WhileTest {

    public static void main(String[] args) {

        int i = 0;
        while(i > 15){

            System.out.println(i);
            i++;
        }

        do{
            System.out.println(i);
            i++;
        } while (i > 15);
    }
}
