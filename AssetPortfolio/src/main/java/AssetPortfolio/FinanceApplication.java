package AssetPortfolio;

import java.util.Scanner;

public class FinanceApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Portfolio portfolio = null;
        FixedAsset fixedAsset;
        double portfolioValue = 0.0;

        System.out.println("Would you like to create a portfolio?(Y or N): ");
        String newPortfolioChoice = myScanner.nextLine().trim();
        if (newPortfolioChoice.equalsIgnoreCase("y")) {
            portfolio = createPortfolio();
        } else if (newPortfolioChoice.equalsIgnoreCase("n")) {
            portfolio = new Portfolio("Default Portfolio", "User");
        } else {
            System.out.println("ERROR! Please enter y - yes or n - no");
        }

        System.out.println("Would you like to add a new asset to your portfolio?(Y or N): ");
        String newAssetChoice = myScanner.nextLine().trim();
        if (newAssetChoice.equalsIgnoreCase("y")) {
            fixedAsset = addNewAsset();
            portfolio.add(fixedAsset);
            portfolioValue = portfolio.getValue();
        } else if (newAssetChoice.equalsIgnoreCase("n")) {
            System.out.println("Maybe next time...");
        } else {
            System.out.println("ERROR! Please enter y - yes or n - no!");
        }

        System.out.println("The Value of your Portfolio is: $" + portfolioValue);
        System.out.println("\n\nThank you! Bye now!");

    }

    public static Portfolio createPortfolio() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please Enter the Portfolio Name: ");
        String portfolioName = myScanner.nextLine().trim();

        System.out.println("Please Enter the Name of the Portfolio Owner: ");
        String ownerName = myScanner.nextLine().trim();

        return new Portfolio(portfolioName, ownerName);
    }

    public static FixedAsset addNewAsset() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\t----------OPTIONS----------\n1 - Gold\n2 - House\n3 - Jewelry\n4 - Go Back");
        System.out.println("Enter an option: ");
        String userOption = myScanner.nextLine().trim();

        switch (userOption) {
            case "1":
                System.out.println("Please Enter the Weight: ");
                double goldWeight = Double.parseDouble(myScanner.nextLine().trim());
                return new Gold(goldWeight, 12000);
            case "2":
                System.out.println("Please Enter the Year Built: ");
                int yearBuilt = Integer.parseInt(myScanner.nextLine().trim());
                System.out.println("Please Enter the Square Footage: ");
                int squareFeet = Integer.parseInt(myScanner.nextLine().trim());
                System.out.println("Please Enter the Number of Bedrooms: ");
                int numberOfBedrooms = Integer.parseInt(myScanner.nextLine().trim());

                return new House(25000, yearBuilt, squareFeet,numberOfBedrooms);
            case "3":
                System.out.println("Please Enter the Karat: ");
                double karat = Double.parseDouble(myScanner.nextLine().trim());

                return new Jewelry(5000, karat);
            default:
                System.err.println("ERROR! Please Enter a number 1 - 4!");
                return null;
        }
    }
}
