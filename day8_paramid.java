
public class day8_paramid {

    public static void main(String[] args) {
        // printing paramid

        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            // printing spacing
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }//printing starts
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }

            System.out.println();
        }

    }
}