package lesson2;

public class forTest {

    public static void main(String[] args) {

        final int STEPS = 20;
        final int STOP_DIGIT = 9;
        final int DIVIDER = 2;

        /* int i = STEPS;
        for (int i = 0; i < 15; i++){
            System.out.println(i);
        }*/

        for(int i = 0; i < STEPS; i++){
            if(i == STOP_DIGIT){
                break;
            }
            if(i%DIVIDER == 0){
                continue;
            }
            System.out.println(i);
        }







    }
}
