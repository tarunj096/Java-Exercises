package weather;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        //Input the fahrenheit
        System.out.println("Enter a FAHRENHEIT degree of your city: ");
        Scanner sc =new Scanner( System.in );
        float fah = sc.nextFloat();

        System.out.println(fah +" degrees Fahrenheit is...");
        //To convert fahrenheit to celcius

        fah= fah- 32;
        fah =fah/9;
        fah=fah*5;

        System.out.println(fah+" degree celcius");

        //Input the Celcius
        System.out.println("Enter a CELCIUS degree of your city: ");
        float cel = sc.nextFloat();

        System.out.println(cel+"degree celcius is......");
        cel = cel*9;
        cel = cel/5;
        cel = cel+32;

        System.out.println(cel+"degree Fahrenheit");


    }
}
