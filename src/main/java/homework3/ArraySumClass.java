package homework3;

public class ArraySumClass {

    public static int arraySum(int value, int[] array) {

        if(array == null) {
            throw new IllegalArgumentException();
        }

        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        if(value >= sum) {
            return 1;
        }
        else {
            return -1;
        }

    }

}
