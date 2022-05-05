import java.util.ArrayList;

public class Program {

  ArrayList<Item> orderList = new ArrayList<>();

  public void run() {
  UserInterface ui = new UserInterface();
  ui.getPrice();
  }

  public void createNewItem(int price) {
    Item item = new Item(price);
    orderList.add(item);
  }
}
