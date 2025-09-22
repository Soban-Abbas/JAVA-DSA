public class day5_array {
    public static void main(String[] args) {
        

int [] num={1,2,3,4,5};
int max=num[0];
int min=num[0];


for(int i=0;i<num.length;i++){
    if(num[i]>max){
        max=num[i];
    }else if(num[i]<min){
        min=num[i];
    }else{
        //noting to do
    }
}


System.err.println("max number in array is :" +max);
System.err.println("min number in array is :" + min);


    }
}
