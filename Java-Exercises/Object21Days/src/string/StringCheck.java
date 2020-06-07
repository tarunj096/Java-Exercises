package string;

public class StringCheck {
    public static void main(String[] args) {
        String Str =" Yo know nothing, Jon Snow";
        System.out.println("The String is :"+ Str);

        System.out.println("The Length of string is :"+ Str.length());

        System.out.println("The Character at position 7 of the string is: "+ Str.charAt( 7 ));

        System.out.println("The Substring from 9 to 16 is :"+ Str.substring( 9,16 ));

        System.out.println("The Index of first 'w' is:"+Str.indexOf( 'w'));

        System.out.println("The Index of substring \"Jon\" is: "+Str.indexOf( "Jon" ));

        System.out.println("The Whole string in UPPERCASE letters is:"+Str.toUpperCase());
    }
}
