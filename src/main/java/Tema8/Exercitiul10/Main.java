package Tema8.Exercitiul10;

public class Main {

    public static void main(String[] args){

        TestCase[] tests = {
                new LoginTest("Login with valid credentials"),
                new LoginTest("Login with invalid password"),
                new LoginTest("Login with username only"),
                new SearchTest("Search for product 'abc'"),
                new SearchTest("Search for product code '022589'")
        };

        for(TestCase test : tests){
            test.runTest();
        }

    }
}
