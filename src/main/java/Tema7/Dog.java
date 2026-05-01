package Tema7;

public class Dog {

    // Exercitiul 1
    //Creează clasa Dog:
//    Atribute:
//    name
//    age
//    Metode:
//    bark() → afișează: „Câinele <name> latră”
//    getAgeInHumanYears() → returnează age * 7
//    În main:
//    creează 2 obiecte
//    apelează metodele


    String name;
    int age;

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Dog(String name){
        this.name = name;
    }

    public Dog(int age){
        this.age = age;
    }

    public void bark(){
        System.out.println("Cainele " + this.name + " latra");
    }

    public int getAgeInHumanYears(){
        int i = this.age * 7;
        System.out.println("Varsta cainelui in ani umani: " + i);
        return i;
    }

    public static void main(String []args){

        Dog caine1 = new Dog("Mango",4);
        Dog caine2 = new Dog("Michael",10);

        caine1.bark();
        caine1.getAgeInHumanYears();

        caine2.bark();
        caine2.getAgeInHumanYears();
    }
}
