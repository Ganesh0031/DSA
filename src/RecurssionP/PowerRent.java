package RecurssionP;

public class PowerRent {
    public static  int pow(int a,int b){
        if(b<=0){
            return 1;
        }

        int left=pow(a,b/2);
        int right=pow(a,b/2);
        if(b%2==0) return left*right;
        return left*right *a;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
}
