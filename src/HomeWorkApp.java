import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        initialValueArrow(6, 7);
        minMaxArrow();
        System.out.println(checkBalance(new int[5]));
    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        System.out.println("\nЗадание 1");
        int[] arr = {1, 0, 1, 0, 0, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray() {
        System.out.println("\nЗадание 2");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        System.out.println("\nЗадание 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillDiagonal() {
        System.out.println("\nЗадание 4");
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.printf("%3d", arr[i][j]);
            System.out.println();
        }
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void initialValueArrow(int len, int initialValue) {
        System.out.println("\nЗадание 5");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        }

        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        public static void minMaxArrow() {
            System.out.println("\nЗадание 6");
            int[] arr = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 5};
            int max = arr[0];
            int min = arr[0];
            for (int i = 0; i != arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println("Мининальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
        }
    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean checkBalance(int[] arr) {
        System.out.println("\nЗадание 7");
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0, j = 0; i < arr.length - j; i++)
        {
            leftSum += arr[i];
            if (leftSum > rightSum)
                rightSum += arr[arr.length - 1 - j++];
        }
        return rightSum==leftSum;
    }
}
