package AdvanceSorting;

public class Merge_sort {
    public  static  void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public  static  void merge(int []a,int[] b,int []ans){


            int m=a.length;
            int n=b.length;

            int i=0,j=0,k=0;
            while(i<m && j<n){

                if(a[i]<=b[j]){
                    ans[k++]=a[i++];
                }
                else{
                    ans[k++]=b[j++];
                }

            }
            while(j<n){
                ans[k++]=b[j++];
            }

            while(i<m){
                ans[k++]=a[i++];

            }




    }
    public static void mergerSort(int []arr){
        int n=arr.length;
        if(n==1)return;
        int []a=new int[n/2];
        int []b=new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]= arr[i+n/2];
        }
//        System.out.println();;
//        print(a);
//        System.out.println();
//        print(b);
        mergerSort(a);
        mergerSort(b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int []arr={80,90,30,20,2,454,45,43,3};
        print(arr);
        mergerSort(arr);
        System.out.println();
        print(arr);
    }
}
