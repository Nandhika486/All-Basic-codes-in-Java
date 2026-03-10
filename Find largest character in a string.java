import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char[] ch=s.toCharArray();
char c=s.charAt(0);
for(int i=0;i<s.length();i++){
    if(ch[i]>c){
        c=ch[i];
    }
}
System.out.println(c);
sc.close();
}
