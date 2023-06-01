package homework3;

public class ArraySumClass {

    public static boolean arraySum(int value, int[] array) {

        if(array == null) {
            throw new IllegalArgumentException();
        }

        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        if(value >= sum) {
            return true;
        }
        else {
            return false;
        }

    }

}
