public class main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
        //basePizza.getPizzaPrice();
        //basePizza.addExtraCheese();
        //basePizza.addExtraTopings();
        //basePizza.takeAway();
        //basePizza.getBill();


        deluxpizza deluxpizza = new deluxpizza(true);
        deluxpizza.takeAway();
        deluxpizza.getBill();
        
    }
}
