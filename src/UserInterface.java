import java.util.Scanner;

public class UserInterface {

  private Calculation calc;

  public UserInterface() {
    calc = new Calculation();
  }

  public void getPrice(){
    System.out.println("\n");
    System.out.println("Welcome to the price calculator");
    System.out.println("==========================");
    System.out.println("\n");
    System.out.println("How many items do you whant to calculate the price on?");
    Scanner userInput = new Scanner(System.in);
    int numbersOfItems = userInput.nextInt();
    System.out.println("Whats the price pr. unit?");
    double pricePrUnit = userInput.nextDouble();
    System.out.println("Please type the state code. (Remember the statecode is a tow letter code).U can use following state-codes:\nUT\nNV\nTX\nAL\nCA");
    double result = calc.discountCalculator(numbersOfItems, pricePrUnit);
  }
  public void calculator(){

  }


}