package decoratorModel;

public class Client {
    public static void main(String[] args) {

        System.out.println("order no:1");

        Pizza pizza1 = new Olives
                         (new Mushrooms
                           (new Cheese
                             (new Farmhouse())));

        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

        System.out.println();

        System.out.println("order no:2");

        Pizza base = new Margherita();
        Pizza withCheese = new Cheese(base);
        Pizza withJalapeno = new Jalapeno(withCheese);


        System.out.println(withJalapeno.getDescription());
        System.out.println(withJalapeno.getCost());

        //TOTAL ORDER DETAILS
        OrderService orderService = new OrderService();
        orderService.addOrder(withJalapeno);
        orderService.addOrder(pizza1);

        orderService.printAllOrders();



    }
}
