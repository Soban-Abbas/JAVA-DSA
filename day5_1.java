public class day5_1 {
public static void main(String[] args) {
    

    int [] array={43,5,65,43,5,7,65};
    int sum=0;
    int avg=0;



    for(int i=0;i<array.length;i++){
      sum+=array[i];
    }

avg=sum/array.length;


System.err.println("Sum of array numbers are :" +sum);
System.err.println("AVG of array number are :" +avg);











}

}