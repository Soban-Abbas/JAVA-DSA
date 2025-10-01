public class day7_invrt_paramid_ {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*rows-1;j++){
                System.out.print("*");
            }
            rows--;
            System.out.println();
        }
    }
}
