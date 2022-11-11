package task_1;

public class WorkWithArray {
    public static void main (String [] args) {
        int myArray[] = new int[]{800, 11, 65, 4500, 1, 39};
        int maxValue = getMaxValue (myArray);
        int minValue = getMinValue(myArray);
        double mean = getMean (myArray);

        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(mean);

    }

    // находит среди массива максимальное число
    public static int getMaxValue(int[] array){
        int maxValue = array[0];
        for(int i=1; i < array.length; i++){
            if(array[i] > maxValue){
            maxValue = array[i];
            }
        }
        return maxValue;
    }

    // находит среди массива минимальное число
    public static int getMinValue(int[] array){
        int minValue = array[0];
        for(int i=1; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    // находит среднее значение всех чисел
    // TODO почему-то дробная часть неправильно отобразилась. Исправить, если останется время
    public static double getMean(int[] array){
        int sum = array[0];
        double mean = 0.00d;
        for(int i=1; i < array.length; i++){
                sum += array[i];
            }
        mean = sum/array.length;
        return mean;
    }
}

