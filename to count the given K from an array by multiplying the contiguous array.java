import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            int product = 1;

            for(int j = i; j < n; j++) {
                product *= arr[j];

                if(product == k) {
                    count++;
                }

                if(product > k) {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
