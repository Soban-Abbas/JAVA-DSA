import java.util.Scanner;
public class fun_prime_num {
static void prime (int num){
    if(num<1){
        System.out.println("Number must be greater then 1");
        return ;
    }

    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            System.out.println("Number is Not prime");
            return;
        }
    }

    System.out.println("Number is Prime");
    return;
}
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter  Number to check number is  Prime or Not ");
        int num=obj.nextInt();
        prime(num);
        obj.close();
    }
}