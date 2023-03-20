import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your principle (starting amount)");
        Scanner scan = new Scanner(System.in);
        double principle = scan.nextDouble();

        System.out.println("What is your interest rate");
        double interest = scan.nextDouble();

        interest = interest / 100;


        //System.out.println(interest);

        System.out.println("How many times is your interest compounded yearly (Annually, Semiannually, quarterly, monthly)? ");
        Double n = scan.nextDouble();

        double U = interest / n;

        System.out.println("Over how many years is this interest running?");
        double t = scan.nextDouble();

        double pre = 1 + (U);
        System.out.println(pre);
        double post = Math.pow(pre,(n*t));



        double finalAmount = principle * post;





        System.out.println("The final amount after the interest has been applied is" + " " + finalAmount);
    }
}