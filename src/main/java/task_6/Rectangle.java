package task_6;

public class Rectangle {

    public static double lenght;
    public static double width;

    Rectangle (double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    public static boolean isQuadrate (){
        boolean isQuadrate = false;
        if (lenght == width) {
            isQuadrate = true;
        }
        return isQuadrate;
    }

}

/*
Task 6
Описать класс фигуру прямоугольник:
* класс  имеет поля длина и ширина
* у класса есть метод определения является ли прямоугольник квадратом
 */