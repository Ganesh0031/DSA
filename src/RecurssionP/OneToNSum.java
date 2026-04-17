package RecurssionP;

public class OneToNSum {
    public static int s=0;
     public static  int  sum(int n,int sum){
         if(n==0){

             return  sum;
         }
         return sum(n-1,sum+n);
     }
     public static  int sum(int n){
         if(n==0)return 0;
        return n+sum(n-1);
     }
    public static void main(String[] args) {
        System.out.println( sum(10));

    }
}
