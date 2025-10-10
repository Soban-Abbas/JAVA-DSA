import java.util.Scanner;
public class fun_factorial {
    static int factorial(int num){
        int result=1;
        for(int i=num;i>=1;i--){
            result=i*result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int num=obj.nextInt();
        int result=factorial(num);
        System.out.println("Factorail of given number is" + " " + result);
        obj.close();

    }
}
