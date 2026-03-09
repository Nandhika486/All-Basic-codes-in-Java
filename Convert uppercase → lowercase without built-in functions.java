import java.util.*;
//Convert uppercase → lowercase without built-in functions
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char[] ch=s.toCharArray();
for(int i=0;i<s.length();i++){
    if(ch[i]>='A' && ch[i]<='Z'){
        ch[i]+=32;
    }
}
for(char c:ch){
    System.out.print(c+" ");
}
sc.close();
}
}
