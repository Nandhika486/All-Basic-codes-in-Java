
import java.util.*;
//HELLO WORLD -> OLLEH DLROW
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            String w=words[i];
           for(int j=w.length()-1;j>=0;j--){
            System.out.print(w.charAt(j));
           }
           if(i<words.length-1){
           System.out.print("$");
           }
        }
        sc.close();
    }
}
