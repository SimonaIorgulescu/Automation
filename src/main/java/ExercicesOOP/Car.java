package ExercicesOOP;

public class Car {

    String brand = "VW";
    String model;
    int year;
    boolean isSport;

    public Car (String brand, String model, int year, boolean isSport){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isSport = isSport;
    }

    public Car(String model,int year, boolean isSport){
        this.model = model;
        this.year = year;
        this.isSport = isSport;
    }


    public void  displayInfo(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        if(isSport){
            System.out.println("Este masina sport");
        }else
            System.out.println("Nu este masina sport");

    }

    public boolean isOldCar(){
        if(year <= 2010){
            return true;
        }else
            return false;

    }

    public static void main(String []args){

        Car car1 = new Car("BMW","X7",2020,true);
//        car1.brand = "BMW";
//        car1.model = "X7";
//        car1.year = 2020;
//        car1.isSport = true;

        Car car2 = new Car("Polo",2010,false);

//        car2.brand = "VW";
//        car2.model = "Polo";
//        car2.year = 2010;
//        car2.isSport = false;

        car1.displayInfo();
        car2.displayInfo();

        System.out.println(car1.isOldCar());
        System.out.println(car2.isOldCar());

    }


}
