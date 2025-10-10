import java.util.Scanner;
public class fun_reverse_num {
    static long reverse(long num){
        long reverse=0;
        while (num>0) {
            long remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num/10;


        }

        return reverse;
    }
    public static void main(String[] args) {
          Scanner obj= new Scanner(System.in);
        System.out.println("Find reverse of number");
        long num=obj.nextInt();
long result=reverse(num);
System.out.println("Reverse of number " + " " + result );
obj.close();
    }
}
