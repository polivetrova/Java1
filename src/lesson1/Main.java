package lesson1;

public class Main {

/*public static void main(String[] args) { //- шорткат для написания метода - main + TAB
        System.out.println(); //- шорткат для написания строки sout + TAB
    }*/

public static void main(String[] args){
        printHelloWorld();
        testVars();
        testInc();
        int a = 1;
        int b = 2;
        int result = sumAVarAAndIncVarB(a, b);
        //calcSalaryAfterTax();
        calcSalary();
        testString();
        checkAppraisal(5);
        checkAppraisal(4);
        checkAppraisal(6);
    }


    static void printHelloWorld(){
        System.out.println("Hello, world!");
    }


    private static void testVars() {
        int varA;
        varA = 3;
        int varB = 7;
        long varB1 = 3_000_000_000L;
        double result = varB / (double) varA;
        System.out.println(result);

        double doubleVarA = 3.0;
        double doubleVarB = 7;
        float doubleVarB1 = 7f;
        System.out.println(doubleVarB / doubleVarA);

        byte a = 127;
        a += 129;

        varA += varB;

        System.out.println(a);

        char c1 = 'h';
        char c2 = 1704;

        System.out.println(c2);
    }

        private static void testInc () {
            int c = 0;
            c++;
            System.out.println(c++); //прибавление единицы после вывода с = 0 > вывод > прибалвение > с = 1
            System.out.println(++c); //прибалвение единицы ДО вывода ........ с = 2
            System.out.println(c--); //2      ...... с = 2, вывод, а потом вычитание, после действия с = 1
            System.out.println(--c); //1 ..... после действия с = 0
            System.out.println(c + 1); // с осталась = 0, но выведена будет 1, ибо мы тупо ее прибавили
            System.out.println(c); // и здесь с = 0
        }

        private static int sumAVarAAndIncVarB (int c, int d){
            d++;
            System.out.println(c + d);
            return c + d;

        }

       private static int calcSalaryAfterTax (int salary, int tax){
           return (int)(salary - salary * tax / 100.0);
       }

       private static void calcSalary () {
           final int TAX_RUSSIA = 13;

           System.out.println(calcSalaryAfterTax(100000, TAX_RUSSIA));
           System.out.println(calcSalaryAfterTax(25000, TAX_RUSSIA));
           System.out.println(calcSalaryAfterTax(250000, TAX_RUSSIA));
           System.out.println(calcSalaryAfterTax(600000, 15));

    }


        public static void testString () {
            String helloStr = "Hello ";
            String worldSrt = "World";
            System.out.println(helloStr + worldSrt);
        }


         public static void checkAppraisal ( int appraisal){
            if (appraisal == 5) {
                System.out.println("Good boy!");
            } else if (appraisal == 4) {
                System.out.println("Nice!");
            } else if (appraisal >= 1 & appraisal <= 3) {
                System.out.println("You should do better :(");
            } else {
                System.out.println("what");
            }
            System.out.println("check done");
        }


        //System.out.println(a);


}
