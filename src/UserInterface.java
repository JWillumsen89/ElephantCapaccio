import java.util.Locale;
import java.util.Scanner;

public class UserInterface {

  private double result;
  private String state;
  private double finalResult;
  Scanner in = new Scanner(System.in);

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
    result = calc.discountCalculator(numbersOfItems, pricePrUnit);
    System.out.println("Please type the state code. (Remember the statecode is a tow letter code).U can use following state-codes:\nUT\nNV\nTX\nAL\nCA");
    state = in.nextLine().toUpperCase(Locale.ROOT);
    finalResult = calc.stateCodeCalc(result, state);
    System.out.println(finalResult);

  }
  public void calculator(){

  }


}