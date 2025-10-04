public class day9_inverted_hollowparamid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }if(i==rows){
                for(int j=1;j<=2*i-1;j++){
                    System.err.print("*");
                }
                System.out.println();
            }
            else if(i==1){
                System.out.println("*");
            }
            else{
                System.out.print("*");
                for(int j=1;j<=2*i-1-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

        }
        
        }
    }

