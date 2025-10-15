import java.util.Arrays;
public class recersearray {
    static void reverseArray(int arr[]){
        int start=0;
        int end =arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
             arr[end]=temp;

             start++;
             end--;
        }

    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        // shows the array into realable array formate like [a,b,x,,d,f]
         System.out.println("Reverse array =" + Arrays.toString(array));
         //passing array by refecne so it direclty get changed 
        reverseArray(array);
        System.out.println("Reverse array =" + Arrays.toString(array));
    }
}
