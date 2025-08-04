package decoratorModel;

public class Jalapeno implements Pizza{

    Pizza pizza;
    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription(){
        return pizza.getDescription()+ "+ Jalapeno";
    }

    @Override
    public int getCost(){
        return pizza.getCost() + 15;

    }
}
