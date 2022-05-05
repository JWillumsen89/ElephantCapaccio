
public class Calculation {

  UserInterface userInput = new UserInterface();


  public double discountCalculator(int units, double price) {

    double result = units * price;
    if (result >= 1000 && result < 5000) {
      result = result * 0.97;
    } else if (result >= 5000 && result < 7000) {
      result = result * 0.95;
    } else if (result >= 7000 && result < 10000) {
      result = result * 0.9;
    } else if (result >= 10000 && result < 50000) {
      result = result * 0.85;
    }
    return result;
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
