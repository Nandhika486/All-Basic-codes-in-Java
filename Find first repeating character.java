import java.util.*;
//Find first repeating character
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char[] ch=s.toCharArray();
int[] freq = new int[256];
for(int i=0;i<s.length();i++){
  freq[ch[i]]++;
}
for(int i=0;i<s.length();i++){
  if(freq[ch[i]]>1){
    System.out.println(ch[i]);
    break;
  }
}
sc.close();
}
}
