import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    static final int SIZE = 3;
    static final char PLAYER = 'O';
    static final char COMP = 'X';
    static final char NULL = '.';
    static Scanner vvod = new Scanner(System.in);
    static Random random = new Random();
    static final char[][] POLE = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initfield();
        printField();
        while (true) {
            movePerson();
            printField();
            if (checkWin(PLAYER)) {
                System.out.println("Вы победили");
                break;
            }
            if (isFreeSpace()) {
                System.out.println("Ничья");
                break;
            }
            moveAi();
            System.out.println();
            printField();
            if (checkWin(COMP)) {
                System.out.println("Вы проиграли");
                break;
            }
            if (isFreeSpace()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initfield() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                POLE[i][j] = NULL;
            }
        }
    }

    public static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(POLE[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void setSym(int x, int y, char sym) {
        POLE[y][x] = sym;
    }

    public static void movePerson() {
        int x, y;
        do {
            x = vvod.nextInt() - 1;
            y = vvod.nextInt() - 1;
        } while (!isCellValid(x, y));
        POLE[y][x] = PLAYER;
    }

    public static void moveAi() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        POLE[y][x] = COMP;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (POLE[y][x] == NULL) return true;
        return false;
    }

    public static boolean isFreeSpace() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (POLE[i][j] == NULL) return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char sym) {
        for (int i = 0; i < SIZE; i++) {
            int result = 0;
            for (int j = 0; j < SIZE; j++) {
                if (POLE[i][j] == sym) result++;
            }
            if (result == SIZE) return true;
        }
        int first = 0;
        for (int i = 0; i < SIZE; i++) {
            int result = 0;
            for (int j = 0; j < SIZE; j++) {
                if (j == i && POLE[i][j] == sym) first++;
            }
        }
        if (first == SIZE) return true;
        int second = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE && j >= 0; i++, j--) {
        }
        if (second == SIZE) return true;
        return false;
    }
}