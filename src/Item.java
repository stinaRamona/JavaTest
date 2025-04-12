//Item är en publik klass 
public class Item {

    //Privata variabler för Item-klassen (är kopplade till Item)
    private String ItemName;
    
    private int ItemPrice; 

    private int ItemStock; 

    //Konstruktor
    public Item(String ItemName, int ItemPrice, int ItemStock) {
        this.ItemName = ItemName; 
        this.ItemPrice = ItemPrice; 
        this.ItemStock = ItemStock; 
    }

    //Metoder för att hämta värden för de privata variablerna
    public String getItemName() {
        return ItemName; 
    }

    public int getItemPrice() {
        return ItemPrice; 
    }

    public int getItemStock() {
        return ItemStock; 
    }
}
