import java.util.Scanner;
public class day4_arrayproblem {
public static void main(String[] args) {
    
    int[] num={9,8,7,6,5,4,3,2,1};
    for(int i=0;i<num.length;i++){
        System.out.println(num[i]);
    }
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number you want to search");
    int search=sc.nextInt();
    boolean found=false;
    for(int i=0;i<num.length;i++){
        if(num[i]==search){
            System.out.println("Your number " +search +"is present at index" +i);
            found=true;
            break;
        }
    }
    if(!found){
        System.out.println("number not found in array");
    }





num[2]=29;

for(int i=0;i<num.length;i++){
    System.out.println("updated  array is " +num[i]);
}

// overwriting the last index because we cannot add the extra number because of fix sized; 
num[num.length-1]=99;

for(int i=0;i<num.length;i++){
    System.out.println("updated  array is " +num[i]);
}


//deleating number
System.out.println("enter index number you wanna delete");
int dltNum=sc.nextInt();
for(int i=dltNum;i<num.length-1;i++){
    num[i]=num[i+1];
}
num[num.length-1]=0;
for(int i=0;i<num.length;i++){
    System.out.println(num[i]);
}
sc.close();

}
    
}