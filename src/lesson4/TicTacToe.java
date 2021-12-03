package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int SIZE = 3;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final char HEADER_FIRST_SYMBOL = '';
    static final String EMPTY = " ";
    static int turnsCount;

    static  final char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        initMap();
        printMap();
        playGame(); //сюда можно вставить бесконечный цикл хотите еще сыграть
    }

    private static void initMap() {
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.println();
        printHeaderMap();
        printBodyMap();
    }


    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + EMPTY);
        for(int i = 0; i < SIZE; i++){
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printBodyMap() {
        for(int i = 0; i < SIZE; i++){
            printMapNumber(i);
            for(int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame(){

        turnsCount = 0;
        while(true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
        }
    }


    private static void humanTurn(){

        int rowNumber;
        int columnNumber;
       // boolean isInputValid = true;

        System.out.println("\nenter row and column num");
        do {
            rowNumber = -1;
            columnNumber = -1;

            System.out.println("Row =");
            if(in.hasNextInt()){
                rowNumber = in.nextInt() - 1;
            } else {
                in.next();
                System.out.println("Enter digit");
                continue;
            }

            System.out.println("Column =");
            if(in.hasNextInt()){
                columnNumber = in.nextInt() - 1;
            } else {
                in.next();

            }
        } while(!isHumanTurnValid(rowNumber, columnNumber));

        map[rowNumber][columnNumber] = DOT_HUMAN;
    }

    private static boolean isHumanTurnValid(int rowNumber, int columnNumber) {

        return isNumbersValid(rowNumber, columnNumber) && isCellAvailable(rowNumber, columnNumber);
    }



    private static boolean isNumbersValid(int rowNumber, int columnNumber) {
        if(rowNumber > SIZE || rowNumber < 0 || columnNumber > SIZE || columnNumber < 0) {
            System.out.println("\nCheck your row and column num!");
            return false;
        }
        return true;
    }

    private static boolean isCellAvailable(int rowNumber, int columnNumber) {
        if(map[rowNumber][columnNumber] != DOT_EMPTY){
            System.out.println("\nThis place is unavailable");
            return false;
        }
        return true;
    }

    private static void aiTurn() {
        int rowNumber;
        int columnNumber;

        System.out.println("\n AI's turn!");

        do{
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);

        } while (!isCellAvailable(rowNumber, columnNumber));

        map[rowNumber][columnNumber] = DOT_AI;
    }


    private static void checkEnd(char symbol) {

        boolean isEnd = false;

        if(checkWin(symbol)){
            isEnd = true;
            String winMessage;
            if(symbol == DOT_HUMAN){
                winMessage = "You win";
            } else {
                winMessage = "AI wins";
            }

            System.out.println(winMessage);
        }

        if(!isEnd && isMapFull()){
            System.out.println("Draw!");
            isEnd = true;
        }

        if(isEnd = true){
            System.exit(0);
        }

    }

    private static boolean checkWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

        return false;
    }

 private static boolean isMapFull() {
        for(char[] chars : map){
            for(char symbol : chars){
                if(symbol == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
}
