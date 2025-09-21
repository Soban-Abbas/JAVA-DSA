
// some times we only need to give size of array and after that we dynamically gives values
// in that case we do
// int[] array_name=new int[size/length of array]
// we we just waana give values to array at same time we do
// int[] array_name={1,2,3,4,5}


import java.util.Scanner;
public class day4_arraydeepdive {
    public static void main(String[] args) {
        String[] names= new String[4];
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st name");
        String name1=sc.nextLine(); 
        names[0]=name1;

        
        System.out.println("Enter 2nd name");
        String name2=sc.nextLine(); 
        names[1]=name2;

        
        System.out.println("Enter 3rd name");
        String name3=sc.nextLine(); 
        names[2]=name3;

        
        System.out.println("Enter 4th name");
        String name4=sc.nextLine(); 
        names[3]=name4;


for(int i=0;i<names.length;i++){
    System.out.println("value at names[" +i +"] is " + names[i]);
}

sc.close();

    }
}
