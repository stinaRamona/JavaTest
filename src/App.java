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
    }
}
