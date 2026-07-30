package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

	//@Test
	void test_hardassertions()
	{
	    System.out.println("testign.....");
	    System.out.println("testign.....");

	    Assert.assertEquals(1, 2); //hard assertion

	    System.out.println("testing....");
	    System.out.println("testing....");
	}

	@Test
	void test_softassertion()
	{
	    System.out.println("testign.....");
	    System.out.println("testign.....");

	    SoftAssert sa = new SoftAssert();

	    sa.assertEquals(1, 2); //soft assertion

	    System.out.println("testing....");
	    System.out.println("testing....");
	    sa.assertAll();
	    
	    /*
	     2 kinds of assertions

		1)	Hard assertions
			
		2)	Soft assertions
			
		-->	Hard assertions
			
			We can access from "Assert" class.
			Methods are static.
			
			If hard assertion fails then the rest of the statements will not be executed.
			
		-->	Soft assertion
			
			We can access through "SoftAssert" object.
			
			SoftAssert sa = new SoftAssert();
			sa.assertTrue()
			
			If soft assertion fails then the rest of the statements will still execute.
	     
	     
	     */
	}
}
