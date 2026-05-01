package Tema7;

public class ShoppingCart {

    // Exercitiul 5
//    Creează clasa ShoppingCart:
//    Atribute:
//    totalPrice
//    Metode:
//    addProduct(double price)
//    removeProduct(double price)
//    getTotal()
//    Reguli:
//    totalPrice nu poate deveni negativ
//    În main:
//    adaugă 3 produse
//    șterge unul
//    afișează totalul

    double totalPrice;

    public ShoppingCart(double totalPrice){
        this.totalPrice = totalPrice;
    }

    public double addProduct(double price){
        return this.totalPrice = this.totalPrice + price;
    }

    public void removeProduct(double price){
        if(totalPrice - price < 0){
            System.out.println("Your total price can't below 0");
        }else {
            this.totalPrice = this.totalPrice - price;
        }
    }

    public void getTotal(){
        System.out.println("Total is :" + totalPrice);
    }

    public static void main(String []args){

        ShoppingCart cart = new ShoppingCart(0);

        cart.addProduct(100);
        cart.getTotal();

        cart.addProduct(250);
        cart.getTotal();

        cart.addProduct(130);
        cart.getTotal();

        cart.removeProduct(500);
        cart.getTotal();



    }

}
