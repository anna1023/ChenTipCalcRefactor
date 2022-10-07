import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main (String[] args){
        System.out.print("Welcome to Tip Calculator!");
        Scanner scan = new Scanner (System.in);
        System.out.println("How many people are in your group?");
        int numPeople = scan.nextInt();
        System.out.println("How much would you like to tip? (0-100)");
        int tipPercentage = scan.nextInt();
        TipCalculator tip = new TipCalculator(numPeople,tipPercentage);
        double addMeal = 0;
        while (addMeal!=-1) {
            System.out.println("Enter your food in dollars and cents.");
            addMeal = scan.nextDouble();
        }

        System.out.println("Total Bill Before Tip: "+tip.getTotalBillBeforeTip());
        System.out.println("Total Percentage: "+tip.getTipPercentage());
        System.out.println("Total Tip: "+tip.tipAmount());


    }
}
