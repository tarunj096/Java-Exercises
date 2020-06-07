package tokenizer;

//Use String Tokens To Examine Stock Price Data

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        StringTokenizer st1,st2;
        //System.out.println("Enter Quote 1 for analysing the tokens in it:");
        Scanner sc = new Scanner( System.in );
        //String quote1= sc.next();
        String quote1 ="TWTR 37.14 7.28";
        st1 = new StringTokenizer( quote1 ," ");
        System.out.println("Token 1:" + st1.nextToken());
        System.out.println("Token 2:" + st1.nextToken());
        System.out.println("Token 3:" + st1.nextToken());

        System.out.println("Enter Quote 2 for analysing the tokens in it:");
        String quote2 = sc.next();

        st2 = new StringTokenizer( quote2 ,"@");
        System.out.println("\nToken 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());


    }
}
