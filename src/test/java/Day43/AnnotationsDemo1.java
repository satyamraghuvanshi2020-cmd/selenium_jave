package Day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {

	/*
	1) Login  -- @BeforeMethod
	2) Search ---> @Test
	3) Logout -- @AfterMethod
	4) Login
	5) Advanced search --- @Test
	6) Logout
	*/
	
	@BeforeMethod
	void login()
    {
        System.out.println("This is login..");
    }
	
	@Test(priority=1)
    void search()
    {
        System.out.println("This is search...");
    }
	
	@Test(priority=2)
    void advacedsearch()
    {
        System.out.println("The advanced search...");
    }

	@AfterMethod
    void logout()
    {
        System.out.println("This is logout...");
    }
	
}
