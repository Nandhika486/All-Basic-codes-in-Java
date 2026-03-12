import java.util.*;
//Count occurrence of a specific character
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char[] ch=s.toCharArray();
char c=sc.next().charAt(0);
int[] freq=new int[256];
for(int i=0;i<s.length();i++){
  freq[ch[i]]++;
}
for(int i=0;i<s.length();i++){
  if(ch[i]==c && freq[ch[i]]>=1){
  System.out.println(ch[i]+" -> "+freq[ch[i]]);
  }
  freq[ch[i]]=0;
}
sc.close();
}
}
