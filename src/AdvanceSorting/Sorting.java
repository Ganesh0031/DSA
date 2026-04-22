package AdvanceSorting;

import java.util.Arrays;

public class Sorting{
    public static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int []a,int []b){

        int m=a.length;
        int n=b.length;
        int []ans=new int[m+n];
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
        print(ans);


    }
    public static void main (String []args){

        int[]a={13,3,112,1,3,5,6};
        int []b={2,4,6,3,22,42,456};
        Arrays.sort(a);
        Arrays.sort(b);
        sort(a,b);
    }
}