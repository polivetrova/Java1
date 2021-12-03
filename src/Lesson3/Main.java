package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int[] a = {0,0,0,0,0,0};
        System.out.println(Arrays.toString(a));

        testArrayChange(a); //a.clone();*/

        /*testString();

        testOverload(3,4);
        testOverload(3.0,4.32345);
        testOverload(24);
        testOverload();
        testOverload(1,2,3,4,5,6,7,8,9,10);*/

        //testConsoleInput();

        testRandom();



    }



    private static void testString() {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(("str1 == str2" + (str1 == str2)));
        System.out.println("str1 == str2" + (str1.equals(str3)));

    }

    private static void testArrayChange(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
    }

    private static void testOverload(int a, int b) {
        int multiple = a * b;
        System.out.printf("Multipling 2 nums: %d * %d = %d(int)%n", a, b, multiple);
        //MessageFormat
    }

    private static void testOverload(double a, double b) {
        double multiple = a * b;
        System.out.printf("Multipling 2 nums: %.1f * %.2f = %f(double)%n", a, b, multiple);
    }

    private static void testOverload(int a) {
        int multiple = a * a;
        System.out.printf("Square num: %d * %d = %d(int)%n", a, a, multiple);
    }

    private static void testOverload() {
        testOverload(10, 10);
    }

    private static void testOverload(int... arr) {
        int multiple = 1;

        for (int item : arr) {
            multiple *= item;
        }

        System.out.printf("Multiple all num: %d * %d = %d(int)%n", multiple);
    }

    private static void testConsoleInput(){
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = null;
        try {
            name = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hello, " + name);*/

        Scanner scanner = new Scanner(System.in);
        /*String name = scanner.next();
        System.out.println("Hello, " + name);*/

        System.out.println("enter a: ");
        int a = scanner.hasNextInt() ? scanner.nextInt() : 0;
        if (a == 0) scanner.next();

        System.out.println("enter b: ");
        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        } else {
            scanner.next();
        }
        testOverload(a,b);
        scanner.close();

    }

    static void testRandom (){

        Random random = new Random();

        int[] data = new int[30];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10); // 0 - 9
            data[i] = random.nextInt(8) + 3; // 3 - 10
            data[i] = random.nextInt(12) -5; // -5 до +6

            data[i] = (int)Math.random() * 10;
            data[i] = (int)(Math.random() * 8) + 3;



        }
        System.out.println(Arrays.toString(data));
    }

}
