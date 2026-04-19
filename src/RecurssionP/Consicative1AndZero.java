package RecurssionP;

public class Consicative1AndZero {
    public  static  void  conv( int n,String ans){
         int m= ans.length();
         if(m==n){
             System.out.println(ans);
             return;
         }
         if(m==0 || ans.charAt(m-1)=='0'){
             conv(n,ans+1);
             conv(n,ans+0);
         }
         else{
             conv(n,ans+0);
         }
    }
    public static void main(String[] args) {
        conv(4,"");
    }
}
