package task_10;

public class Quadrate {

    private double sideLenght; // сторона квадрата

    public double getLenght() {
        return sideLenght;
    }

    public void setLenght(double lenght) throws ZeroOrNegativeLenghtException {
        if (lenght <= 0){
            throw new ZeroOrNegativeLenghtException("Некорректное значение стороны (отрицательное или нулевое)");
        }
        this.sideLenght = lenght;
    }
}
