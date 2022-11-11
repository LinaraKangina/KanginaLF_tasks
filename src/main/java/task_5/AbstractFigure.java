package task_5;

public abstract class AbstractFigure {

    String color;

    public AbstractFigure (String color){
        this.color = color;
    }

    abstract double calculateArea ();
    abstract void calculatePerimetr ();

}

    /*
    Task 5
Описать абстрактный класс фигура:
* класс имеет свойство цвет
* класс имеет нереализованное поведение рассчитать площадь
* класс имеет нереализованное поведение рассчитать периметр
     */

