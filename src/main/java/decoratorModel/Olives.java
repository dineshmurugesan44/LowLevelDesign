package decoratorModel;

public class Olives implements Pizza{

    Pizza pizza;
    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription(){
        return pizza.getDescription()+ "+ Olives";
    }

    @Override
    public int getCost(){
        return pizza.getCost() + 30;

    }
}
