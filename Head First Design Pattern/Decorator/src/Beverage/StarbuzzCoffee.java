package Beverage;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverag=new Espresso();
        System.out.println(beverag.getDescription()+" $"+beverag.cost());

        Beverage beverage2=new DarkRoast();
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
