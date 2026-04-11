import java.util.*;
public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
       int[] arr={6,6,6,6,6,6,6,6};
       int m=2,n=3;
       int res1=0,res2=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]%m==0){
            res1++;
        }
        else if(arr[i]%n==0){
            res2++;
        }
       }
       if(res1>res2){
        System.out.println("Ram  "+res1);
       }
       else{
        System.out.println("Rohan "+res2);
       }
       if(res1==res2){
        System.out.println("Both are winners");
       }
        sc.close();
    }
