public class day9_diamond {
public static void main(String[] args) {
    int rows =5;
    for(int i=1;i<=rows;i++){
        //spaces
        for (int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }
        //pirnting stars
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }


    //inverted paramid
    for(int i=rows-1;i>=1;i--){
        //spaces
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }System.out.println();
    }
}
}
