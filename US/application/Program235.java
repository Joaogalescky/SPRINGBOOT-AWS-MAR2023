package application;

import java.util.Scanner;
import model.services.BrazilInterestService;
import model.services.InterestService;
import model.services.UsaInterestService;

public class Program235 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
