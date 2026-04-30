package ExercitiuSuites;

import org.testng.annotations.*;

public class LoginTests {

    @BeforeGroups("smoke")
    public void setUP(){
        System.out.println("LoginTests - setup");
    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("LoginTests - teardown");
    }

    @Test(groups = {"smoke"})
    public void loginTest() {
    }


    @Test(groups = {"regression"})
    public void loginTest2(){

    }

}
