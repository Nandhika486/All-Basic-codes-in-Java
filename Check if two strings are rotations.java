import java.util.*;
//Check if two strings are rotations
public class  Main{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    if(s1.length()!=s2.length()){
      System.out.println(0);
    }
    else{
      String temp=s1+s1;
      if(temp.contains(s2)){
        System.out.println(1);
      }
      else{
        System.out.println(0);
      }
    }
    sc.close();
  }
}
