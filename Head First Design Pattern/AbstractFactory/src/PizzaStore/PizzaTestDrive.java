package PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza=nyStore.orderPizza("clam");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
}
