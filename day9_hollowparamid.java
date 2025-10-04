public class day9_hollowparamid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println("*");
            } else if (i == rows) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.err.print("*");
                for (int j = 1; j <= 2 * i - 1-2; j++) //we use 2i-1 to print all starts but here we need to reduce 2 stars as we printed above and below of this loop so we can do by using this formula 2i-1-2 subtacring 2 stars from formula which use to print all stars
                 {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
        System.out.println();
    }
}
