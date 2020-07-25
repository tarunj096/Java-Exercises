import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
	int n = sc.nextInt();
        if(n>=1900 && n<=3000){
            if(n%4==0 && n%100!=0 || n%400==0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Regular year");
            }
        }
    }
}

