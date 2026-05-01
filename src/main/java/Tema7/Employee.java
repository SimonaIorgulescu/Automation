package Tema7;

public class Employee {

    // Exercitiul 4
//    Atribute:
//    name
//    salary
//    Metode:
//    constructor cu parametri
//    increaseSalary(double percent)
//    getSalary()
//    În main:
//    creează 2 angajați
//    crește salariul unuia
//    afișează rezultatul

    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        salary = salary + percent/100 * salary;
    }

    public void getSalary(){
        System.out.println(this.salary);
    }

    public static void main(String []args){

        Employee emp1 = new Employee("Simona",3500);
        Employee emp2 = new Employee("Ioana",4000);

        emp1.increaseSalary(20);
        emp1.getSalary();

    }

}
