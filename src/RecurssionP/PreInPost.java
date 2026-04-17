package RecurssionP;

public class PreInPost {
    public static  void pre(int n){
        if(n==0)return ;
        System.out.print(n+" ");
        pre(n-1);
        System.out.print(n+" ");
        pre(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        pre(3);
    }
}
