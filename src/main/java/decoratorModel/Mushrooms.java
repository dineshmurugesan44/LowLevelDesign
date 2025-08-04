package decoratorModel;

public class Mushrooms implements Pizza{

    Pizza pizza;
    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription(){
        return pizza.getDescription()+ "+ Mushrooms";
    }

    @Override
    public int getCost(){
        return pizza.getCost() + 25;

    }

}
