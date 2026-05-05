package MostenireInheritance;

public class Tester extends Employee{

    public Tester(String name){
        super(name);
    }

    public void work(String application){
        System.out.println(name + " tests " + application + ".");
    }

    public void work(){
        System.out.println(name + " testeaza");
    }
}
