package AdvanceSorting;

public class Quick_sort {
    public static  void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

   public  static void print(int []arr){
       for(int ele:arr){
           System.out.print(ele);
       }
       System.out.println();
   }
   public static  int partition(int []arr,int lo,int hi){
       int pivote=arr[lo];
       int pIdx=lo;
       int smallCount=0;
       for(int i=lo+1;i<=hi;i++){
           if(arr[i]<=pivote)smallCount++;
       }
       int correctIdx=pIdx+smallCount;
       swap(arr,pIdx,correctIdx);
       int i=lo;int j=hi;
       while(i<correctIdx && j>correctIdx){
           if(arr[i]<=pivote)i++;
           else if(arr[j]>pivote)j--;
           else if(arr[i]>pivote &&arr[j]<pivote){
               swap(arr,i,j);
           }
       }
       return correctIdx;
   }
   public static  void quickSort(int []arr,int lo,int hi){
        if(lo>=hi)return;
      int idx= partition(arr,lo,hi);
        quickSort(arr,lo,idx-1);
        quickSort(arr,idx+1,hi);
   }
    public static void main(String[] args) {
        int []arr={4,9,7,1,3,2,6,6,8};
        int n=arr.length;
        print(arr);
        quickSort(arr,0,n-1);
        print(arr);


    }
}
