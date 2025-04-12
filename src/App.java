public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //test variabler
        String greeting = "Tjena mittbena!"; 

        System.out.println("Greeting säger " + greeting);

        int greetingLenght = greeting.length();

        System.out.println("Greeting har " + greetingLenght + " tecken!");
        
        //test för metod addera
        int number1 = 2;
        int number2 = 3; 

        int number3 = Utils.addera(number1, number2); 

        System.out.println(number1 + "+" + number2 + "=" + number3); //lär finnas snyggare sätt att skriva på

        //test för item och storage
        Storage storage = new Storage(); 

        //skapar nytt item med Item-klassen som mall 
        Item item1 = new Item("Tavla", 1000, 2); 
        Item item2 = new Item("Bok", 300, 10); 

        //lägger till ett item med addItem-metoden från storage-klassen
        storage.addItem(item1); 
        storage.addItem(item2); 

        //Skriver ut de tillagda itemsarna med metod displayStorage från storage-klassen  
        storage.displayStorage(); 

        //fiffigt! 
    }
}
