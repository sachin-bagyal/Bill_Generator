public class Deluxe_Pizza extends Pizza {
    public Deluxe_Pizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

}
