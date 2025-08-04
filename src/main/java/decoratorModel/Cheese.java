package decoratorModel;

public class Cheese implements Pizza {

    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDescription(){
        return pizza.getDescription() + "+ Cheese";
    }

    @Override
    public int getCost(){
        return pizza.getCost() + 20;

    }

}
