package BinarySearch;

import java.util.Scanner;

public class NthPrimeNumber {
    public static   boolean isVowel(int i ){
        int count=0;
        for(int j=1;j<=i;j++){
            if (i%j==0){
                count++;
            }
        }
        if(count==2)return true;
        return false;

    }
    public static void main(String[] args) {
        int count=0;
        int i=0;
        System.out.println("Enter the you want to vowel");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while(count<num){
            if(isVowel(i)){
                System.out.println(i);
                count++;
            }
            i++;

        }
    }
}
