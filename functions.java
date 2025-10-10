import java.util.Scanner;
public class functions{
    static int sum(int num){
        int result=0;
        while (num>0) {
            result=result+num;
            num--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number");
       int num=obj.nextInt();
       int result=sum(num);
       System.out.println("Sum of number till " +num +"is" +result);
       obj.close();
    }

}