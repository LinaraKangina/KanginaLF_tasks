package task_8;

import com.sun.corba.se.impl.io.IIOPInputStream;

import java.io.*;
import java.util.Scanner;

public class ByteCopyingFileFromOneDirectoryToAnother {

    public static <os> void main (String[] args) throws IOException, FileNotFoundException  {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь до файла, с которого копируем: "); // пример ввода: C:\\temp\\IO1\\1.txt
        String file1Name = scanner.nextLine();

        System.out.print("Введите путь до файла, в который копируем: "); // пример ввода: C:\\temp\\IO2\\2.txt. TODO Добавить исключение, если путь не существует
        String file2Name = scanner.nextLine();

        try (InputStream is = new FileInputStream(file1Name); OutputStream os = new FileOutputStream(file2Name)){
            while (is.available() != 0) {
                os.write(is.read());
            }
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        } catch (IOException e) {
            System.out.println("Ошибка при считывании данных!");
        }
    }
}

/*
Task 8
Выполнить побайтное копирование файла из одной директории в другую. Директории в виде строк задаются с консоли
 */
