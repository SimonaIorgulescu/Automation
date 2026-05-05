package MostenireInheritance;

public class Developer extends Employee{

    public Developer(String name){
        super(name);
    }

    public void work(String application){
        System.out.println(name + " develops " + application);
    }

}
