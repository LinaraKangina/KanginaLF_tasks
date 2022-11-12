package task_6;

public class Application {

    public static void main (String [] args){


        Rectangle rectangle = new Rectangle (13, 13);
        boolean isQuadrate = Rectangle.isQuadrate();

        if (isQuadrate == true){
            System.out.println("Да, это квадрат");
        }else{
            System.out.println("Нет, это не квадрат");
        }

    }
}
