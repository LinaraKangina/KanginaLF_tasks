package task_3;

import java.util.Scanner;

public class WorkWithStrings {

    public static void main (String [] args) {

        String wordStartsA;


        System.out.print("Введите слово, начинающееся на русское A: ");
            do {
                Scanner scanner = new Scanner(System.in);
                wordStartsA = scanner.nextLine();
                if (wordStartsA.startsWith("А")) {
                    System.out.println("Спасибо");
                } else {
                    System.out.println("Слово не начинается на A, введите заново: ");
                }
            }
                while (!wordStartsA.startsWith("А"));

    }
}


    /*
    Task 3
Написать программу, которая:
* просить ввести слово, начинающееся на букву "А" в консоль
* проверяет слово на наличие букву "А" в начале
* если слово начинается не на "А" - просит ввести повторно, пока не будет введено требуемое слово
* если слово начинается на "А" - благодарит и завершает исполение
     */