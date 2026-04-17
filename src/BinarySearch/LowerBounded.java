package BinarySearch;

public class LowerBounded {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};

        int target=25;
        int lo=0, hi=arr.length-1;
        int lb=hi;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(lb);
    }
}
