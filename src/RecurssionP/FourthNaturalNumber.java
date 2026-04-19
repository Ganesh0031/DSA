package RecurssionP;

public class FourthNaturalNumber {
    public  static  void print(String s,int i,String ans){
        if(ans.length()==4   ){
            System.out.println(ans);
            return;
        }

        if (i == s.length()) {   // ✅ Important fix
            return;
        }

        char ch=s.charAt(i);
        print(s,i+1,ans+ch);
        print(s,i+1,ans);
    }
    public static void main(String[] args) {
        print("123456",0,"");

    }
}
