import java.util.*;
public class Pizza {
    public static void main(String[] args) {
    }

    private int price;
    private int basePizzaPrice;

    private int cheesePrice = 100;
    private int toppingsPrice = 100;
    private int carryBagPrice = 20;
    private boolean isExtraCheese = false;
    private boolean isExtraToppings = false;
    private boolean isOptedTakeAway = false;

    boolean veg;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheese = true;
        System.out.println("Extra cheese price added");
        this.price += cheesePrice;

    }

    public void addExtraToppings() {
        isExtraToppings = true;
        System.out.println("Extra Toppings price added");
        this.price += toppingsPrice;
    }
    public void takAway() {
        isOptedTakeAway = true;
        System.out.println("Takeaway Opted");
        this.price += carryBagPrice;
    }
    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheese){
            bill = "Extra Cheese Added : " + cheesePrice;
            System.out.println(bill);
        }
        if(isExtraToppings){
            bill = "Extra Toppings Added : " + toppingsPrice;
            System.out.println(bill);
        }
        if(isOptedTakeAway){
            bill = "Take Away opted Added : " + carryBagPrice;
            System.out.println(bill);
        }
        bill = "Bill :" + this.price;
        System.out.println(bill);
    }

}