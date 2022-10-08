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
        double addMeal = 1;
        while (addMeal!=-1) {
            System.out.println("Enter your food in dollars and cents.");
            tip.addMeal(addMeal = scan.nextDouble());
        }

        System.out.println("------------------------------------");
        System.out.println("Total Bill Before Tip: "+String.format("%.2f",tip.getTotalBillBeforeTip()));
        System.out.println("Total Percentage: "+tip.getTipPercentage());
        System.out.println("Total Tip: "+String.format("%.2f",tip.tipAmount()));
        System.out.println("Total Bill With Tip: "+String.format("%.2f",tip.totalBill()));
        System.out.println("Per Person Cost Before Tip: "+String.format("%.2f",tip.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: "+String.format("%.2f",tip.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: "+String.format("%.2f",tip.perPersonTotalCost()));

        }

}

