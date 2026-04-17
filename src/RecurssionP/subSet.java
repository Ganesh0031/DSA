package RecurssionP;

public class subSet {
    public  static  void sub(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return ;}
          char ch=s.charAt(i);
          sub(s,i+1,ans+ch);
          sub(s,i+1,ans);
    }
    public static void main(String[] args) {
     sub("abc",0,"");
    }
}
