import java.util.Scanner;
class Main{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int nums:arr){
      System.out.print(nums);
    }
  }
}
