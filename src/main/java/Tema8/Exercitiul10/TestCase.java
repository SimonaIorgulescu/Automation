package Tema8.Exercitiul10;

public class TestCase {

    //Creează:
    //- TestCase → protected name + metodă runTest()
    //- clase copil: LoginTest, SearchTest (override runTest)
    //- în main: rulează mai multe teste

    protected String name;

    public TestCase(String name){
        this.name = name;
    }

    public void runTest(){
        System.out.println("Test: " + name + " is running");
    }
}
