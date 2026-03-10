import java.util.*;
//Count frequency of each character
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int[] freq = new int[256];
for(int i=0;i<s.length();i++){
    freq[s.charAt(i)]++;
}
for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(freq[c]!=0){
        System.out.println(c+" -> "+freq[c]);
        freq[c]=0;
    }
}
sc.close();
}
}
