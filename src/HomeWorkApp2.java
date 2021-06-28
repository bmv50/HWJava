public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSumSign(5, 8));
        whatNumber(-2);
        System.out.println(checkNumber(20));
        stringNumber("Это строка отпечатана: ", 6);
        checkYears(2021);
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean checkSumSign(int a, int b) {
        System.out.println("\nЗадание 1");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void whatNumber(int a) {
        System.out.println("\nЗадание 2");
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else
            System.out.println("Число " + a + " отрицательное");
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean checkNumber(int a) {
        System.out.println("\nЗадание 3");
        if (a >= 0) return true;
        else return false;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void stringNumber(String name, int b) {
        System.out.println("\nЗадание 4");
        for (int i = 0; i < b; i++) {
            System.out.println(name + b + " раз");
        }
    }

    //5. * Написать метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkYears(int year) {
        System.out.println("\nЗадание 5");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        } else
            System.out.println(year + " г. високосный");
    }
}

