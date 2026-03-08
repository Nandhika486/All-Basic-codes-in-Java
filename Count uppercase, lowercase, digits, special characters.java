import java.util.*;
//Count uppercase, lowercase, digits, special characters
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int u=0,l=0,d=0,special=0;
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                u++;
            }
            else if(c>='a' && c<='z')
            {
                l++;
            }
            else if(Character.isDigit(c)){
                d++;
            }
            else{
                special++;
            }
         }
         System.out.println("Upper case: "+u+" Lower case: "+l+" Digits: "+d+" Special characters: "+special);
        sc.close();
    }
}
