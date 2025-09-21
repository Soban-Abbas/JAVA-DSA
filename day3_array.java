import java.util.Scanner;;
public class day3_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numberArray=new int[6];
        System.out.println("Enter 1st number");
        int number1=sc.nextInt();
        numberArray[0]=number1;
         System.out.println("Enter 2nd number");
        int number2=sc.nextInt();
          numberArray[1]=number2;
         System.out.println("Enter 3rd number");
        int number3=sc.nextInt();
          numberArray[2]=number3;
         System.out.println("Enter 4th number");
        int number4=sc.nextInt();
          numberArray[3]=number4;
         System.out.println("Enter 5th number");
        int number5=sc.nextInt();
          numberArray[4]=number5;
         System.out.println("Enter 6th number");
        int number6=sc.nextInt();
          numberArray[5]=number6;
int sum=0;
for(int i=0;i<numberArray.length;i++){
    System.out.println( "number at index " +i + "is " +numberArray[i]);
sum+=numberArray[i];

}

System.out.println("The sum of array element :" +sum);
System.out.println("The avg of array number :" +(sum/(numberArray.length)));

sc.close();


    }
}
