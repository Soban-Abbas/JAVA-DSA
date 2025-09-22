import java.util.Arrays;
public class day5_2 {
    public static void main(String[] args) {

        int[] array = { 5, 4, 3, 2, 1 };

        int[] reverseArray = new int[array.length];

        int num = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[num] = array[i];
            num++;
        }

System.err.println("reversed array =" + Arrays.toString(reverseArray));






    }
}
