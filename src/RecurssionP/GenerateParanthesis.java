package RecurssionP;

public class GenerateParanthesis {
    public static  void par(int open,int close ,int n,String ans){
        if(ans.length()==2*n){
            System.out.println(ans);
            return ;
        }
      if(open<n)  par(open+1,close,n,ans+'(');
      if(close<open)  par(open,close+1,n,ans+')');
     
    }

    public static void main(String[] args) {
        par(0,0,3,"");
    }
}
