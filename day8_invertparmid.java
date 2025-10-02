public class day8_invertparmid {
    public static void main(String[] args) {
        int rows=5;
        for(int i=rows;i>=1;i--){
            // printing spaces
            for(int j=1;j<=-(i-rows);j++){
                System.out.print(" ");

            }for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
