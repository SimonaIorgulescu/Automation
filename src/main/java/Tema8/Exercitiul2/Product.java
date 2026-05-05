package Tema8.Exercitiul2;

public class Product {

    // Exercitiul 2
    // Creează clasa Product:
    //- private name, price
    //- în setter pentru price: nu permite valori <= 0
    //- testează valori valide și invalide

    private String name;
    private double price;


    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        if(newPrice <= 0){
            System.out.println("Price can't be 0 or lower");
        }else {
            price = newPrice;
        }
    }


    public static void main(){

        Product product = new Product();

        product.setName("Eau de toilette");
        String newProduct = product.getName();
        System.out.println(newProduct);


        product.setPrice(400);
        double newPrice = product.getPrice();
        System.out.println(newPrice);

        product.setPrice(-30);
        double priceNew = product.getPrice();

    }



}
