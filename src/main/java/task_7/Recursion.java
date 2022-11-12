package task_7;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n: "); //TODO Нужна проверка, что ввели именно целое число
        int n = scanner.nextInt();

        String resultString = reverseString(recursion(n)); // вызов рекурсивного метода

        System.out.println(resultString);
    }

    // рекурсивный метод

    public static String recursion(int n) {
        // выход
        if (n == 1) {
            return "1";
        }
        // рекурсия
        return recursion(n - 1) + " " + n;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

/*
Task 7
С клавиатуры в консоль задается число n. Вывести в консоль все числа от n до 1 в строку через пробел при помощи рекурсии.
 */
