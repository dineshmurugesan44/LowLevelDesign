package decoratorModel;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Pizza> orderList = new ArrayList<>();


    public void addOrder(Pizza pizza) {
        orderList.add(pizza);
    }

    public int getTotalCost(){
        int totalCost = 0;

        for (Pizza pizza : orderList) {
            totalCost += pizza.getCost();
        }
        return totalCost;
    }

    public void printAllOrders(){
        System.out.println("======= Order Summary =======");
        for(int i=0; i<orderList.size(); i++){
            System.out.println("Order " + (i + 1) + ": " + orderList.get(i).getDescription());
        }
        System.out.println("=============================");
        System.out.println("Total Bill: ₹" + getTotalCost());

    }

}
