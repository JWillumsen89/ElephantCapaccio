
public class Calculation {

  UserInterface userInput = new UserInterface();


  public double discountCalculator(int units, double price) {

    double result = units * price;
    if (result) {

    }


    return result;

  }

  public double stateCodeCalc(double result, String state) {

    switch (state) {
      case "UT" -> result = result * 1.0685;
      case "NV" -> result = result * 1.08;
      case "TX" -> result = result * 1.0625;
      case "AL" -> result = result * 1.04;
      case "CA" -> result = result * 1.0825;
    }

    return result;
  }


}
