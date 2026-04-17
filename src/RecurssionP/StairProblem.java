package RecurssionP;

public class StairProblem {
    public static  int stair(int n){
        if(n<=2){
            return n;
        }
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {

    }
}
