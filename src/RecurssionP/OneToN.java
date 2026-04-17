package RecurssionP;

public class OneToN {
    public static void OneToN(int n,int val){
        if(val==n){
            return ;
        }
        System.out.println(val);
        OneToN(n,val+1);

    }
    public static void main(String[] args) {
        OneToN(5,0);
        

    }
}
