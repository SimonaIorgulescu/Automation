package Tema8.Exercitiul7;

public class Main {

    public static void main(){

        Order order = new Order();

        order.printOrder();

        OnlineOrder onlineOrder = new OnlineOrder();

        onlineOrder.printOrder();
        onlineOrder.trackOrder();
    }
}
