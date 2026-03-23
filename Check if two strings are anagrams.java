
import java.util.*;
//Check if two strings are anagrams
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2=sc.nextLine();
char[] ch1=s1.toCharArray();
char[] ch2=s2.toCharArray();
// we can directly sort by Arrays.sort(ch1)
// instead of bubble sort just use arrays.sort(ch1) both are same time complexity..
for(int i=0;i<s1.length()-1;i++){
  for(int j=0;j<s1.length()-i-1;j++){
    if(ch1[j]>ch1[j+1]){
      char t=ch1[j];
      ch1[j]=ch1[j+1];
      ch1[j+1]=t;
    }
 if(ch2[j]>ch2[j+1]){
      char t=ch2[j];
      ch2[j]=ch2[j+1];
      ch2[j+1]=t;
    }
   
  }
}
for(char c:ch1){
  System.out.print(c);
}
boolean b=false;
for(int i=0;i<s1.length();i++){
  if(ch1[i]==ch2[i]){
    b=true;
  }
  else{
    b=false;
    break;
  }
}
if(b){
  System.out.println(s1+" "+s2+" are Anagarams");
}
else{
  System.out.println(s1+" "+s2+" are not anagrams");
}


sc.close();
}
}
