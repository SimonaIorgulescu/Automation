package ExercitiuSuites;

import org.testng.annotations.*;

public class SearchTests {

    @BeforeGroups("smoke")
    public void setUP(){
        System.out.println("SearchTests - setup");
    }

    @AfterGroups("regression")
    public void tearDown(){
        System.out.println("SearchTests - teardown");
    }

    @Test(groups = {"smoke"})
    public void searchTest(){
    }

    @Test(groups = {"regression"})
    public void searchTest2(){
    }

    @Test(groups = {"regression","slow"})
    public void searchTest3(){
    }

}
