//I storage så finns det items (den andra klassen)
import java.util.ArrayList;

public class Storage {
    private ArrayList<Item> items; 

    public Storage() {
        items = new ArrayList<>(); 
    }

    //lägger till nya items i listan (items)
    public void addItem(Item item) {
        items.add(item); 
    }

    //loopar igenom alla items i listan och skriver ut
    public void displayStorage() {
        for (Item item : items) {
            System.out.println("Vara: " + item.getItemName() + ", Pris: " + item.getItemPrice() + ", Lagersaldo: " + item.getItemStock());
        }
    }
}
