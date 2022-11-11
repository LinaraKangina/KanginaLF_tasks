package task_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScanAndWriteToArray {

    public static void main (String [] args) {

        int n=1000, m=1000;
        int array[][]  = new int [n][m];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        n = scanner.nextInt();
        System.out.print("Введите m: ");
        m = scanner.nextInt();


        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                array [i][j]=((int)(Math.random()*10))*2 + 1; // *2 + 1, чтобы сделать нечетным

                System.out.print(array[i][j]+" "); //TODO Сделать вывод масиива красивее (разбить на строки), если останется время
            }
        }
    }
}
