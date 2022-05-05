import java.util.Scanner;

public class UserInterface {

  public void getPrice(){
    System.out.println("Price Calculator\n");
    System.out.println("How many items do you whant to calculate the price on?");
    Scanner userInput = new Scanner(System.in);
    int numbersOfItems = userInput.nextInt();
    System.out.println("whats the prix pr. unit?");
    double pricePrUnit = userInput.nextDouble();
    System.out.println("Please type the state code. (Remember the statecode is a tow letter code).U can use:\nUT\nNV\nTX\nAL\nCA");
  }



}


