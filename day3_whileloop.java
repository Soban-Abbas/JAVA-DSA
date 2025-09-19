import java.util.Scanner;;
public class day3_whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();
        int i=1;
        while (i<=10) {
            System.out.println(number +"*" +(i) +"=" +(number*i));
            i++;
        }
        sc.close();
    }
}
