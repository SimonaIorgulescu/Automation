package MostenireInheritance;

public class Employee {

    public String name;

    public Employee(String name){
        this.name = name;
    }

    public void work(String job){
        System.out.println(this.name + " is working as " + job + ".");
    }
}
