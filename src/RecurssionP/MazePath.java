package RecurssionP;

public class MazePath {
    public static  int maze(int i,int j,int m,int n){
        if(i==m ||j==n){
            return 1 ;
        }
        int left=maze(i+1,j,m,n);
        int right=maze(i,j+1,m,n);
        return left+right;
    }
    public static  int maze2(int m,int n){
        if(m==1 || n==1)return 1;
        int left=maze2(m-1,n);
        int rigth=maze2(m,n-1);
        return left+rigth;
    }
    public static void main(String[] args) {
        int m=4;
        int n=4;
        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
