package Tema7;

public class Temperature {

    // Exercitiul 3
//    Creează clasa Temperature:
//    Atribute:
//    celsius
//    Metode:
//    toFahrenheit() → returnează conversia
//    toKelvin() → returnează conversia
//    Formule:
//    F = C * 9/5 + 32
//    K = C + 273.15
//    În main:
//    creează obiect și afișează valorile



    double celsius;

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double toFahrenheit(){
        return celsius * 9.0 / 5.0 + 32;
    }

    public double toKelvin(){
        return celsius + 273.15;
    }


    public static void main(String []args){

        Temperature temperature1 = new Temperature(12);

        System.out.println(temperature1.toFahrenheit());
        System.out.println(temperature1.toKelvin());

    }
}
