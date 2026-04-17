package RecurssionP;

public class PrintAllElement {
    public static  void printf(int []arr,int i,int n){
        if(i==n)return;
        System.out.println(arr[i]);
        printf(arr,i+1,n);
    }
    public static void main(String[] args) {
        int  []arr={1,33,4,4,5,5};
        printf(arr,0,arr.length);
    }
}
