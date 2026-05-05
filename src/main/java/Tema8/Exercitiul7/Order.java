package Tema8.Exercitiul7;

public class Order {

    // Exercitiul 7
    // Creează:
    //- Order → protected orderId + metodă printOrder()
    //- OnlineOrder extinde Order → metodă trackOrder()
    //- testează accesul la orderId

    protected String orderId;

    public void printOrder(){
        System.out.println("Order printed");
    }

}
