package ExercitiuSuites;

import org.testng.annotations.*;

public class ProfileTests {

    @BeforeGroups("smoke")
    public void setUP(){
        System.out.println("ProfileTests - setup");
    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("ProfileTests - teardown");
    }

    @Test(groups = {"smoke"})
    public void profileTest(){
    }

    @Test(groups = {"regression"})
    public void profileTest2(){
    }

}
