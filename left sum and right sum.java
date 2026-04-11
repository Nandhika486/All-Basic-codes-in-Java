import java.util.*;
public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
       int[] arr={1,2,3,4,5  };
       int m=arr.length/2;
       int leftSum=0,rightSum=0;
       for(int i=0;i<m;i++){
        leftSum+=arr[i];
       }
       for(int i=m;i<arr.length;i++){
        rightSum+=arr[i];
       }
       int res=leftSum*rightSum;
       System.out.println(res);
        sc.close();
    }
}
