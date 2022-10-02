import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double numOfGallons;
        double costOfGas;
        double costPerMile;
        double fuelEff;
        double range;
        double ppo;
        double hundredMile;
        double length;
        String trash = " ";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the gallons of gas you have in your fuel tank, fuel efficiency, and the price of gas");
        if (in.hasNextDouble()) {
            numOfGallons = in.nextDouble();
            costOfGas = in.nextDouble();
            fuelEff = in.nextDouble();
            range = numOfGallons * fuelEff;

            length = numOfGallons * fuelEff;
            ppo = costOfGas * numOfGallons;
            hundredMile = range/ppo * 100;
            System.out.println("Your price per one hundred miles is: " + hundredMile);
            System.out.println("With the amount of gas you have in the tank, you can go: " + length);

        }else {
            trash = in.nextLine();
            System.out.println("You entered an invalid input");
        }

    }
}
