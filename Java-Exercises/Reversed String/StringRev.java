import java.util.*;

public class StringRev {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string to be reversed:");
       String s = sc.nextLine();
       char[] str = s.toCharArray();

       for(int i = str.length-1;i>=0;i--) {
           System.out.print(str[i]);
       }
    }
}