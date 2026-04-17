package RecurssionP;

public class SkipA {
    public static  String SkipA(String a,int i,String ans){
        if(i==a.length()){
            return ans;
        }
        if(a.charAt(i)!='a'){
            ans+=a.charAt(i);
          //  System.out.println(ans);
            SkipA(a,i+1,ans);
        }

           return SkipA(a,i+1,ans);



    }
    public static void main(String[] args) {
        String ans="";
        System.out.println(SkipA("GanaSaa",0,ans));


    }
}
