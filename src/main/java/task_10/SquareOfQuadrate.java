package task_10;

public class SquareOfQuadrate {
    public void getSquare () {

        Quadrate quadrate = new Quadrate();

        try {
            quadrate.setLenght(-8);
        } catch (ZeroOrNegativeLenghtException e) {
            e.printStackTrace();
            //System.err.println(e.getMessage());
        }


    }
}
