package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo 
{

	@Test
	void testtitle() 
	{
		String exp_title="Opencart";
		String act_title="Openca";
		
		/*if(exp_title.equals(act_title)) 
		{
		System.out.println("Test is passed");	
			
		}
		
		else {
			System.out.println("Test if failed");
		}
		*/
		
		//Assert.assertEquals(exp_title, act_title);
		
		
		if(exp_title.equals(act_title)) 
		{
			
			System.out.println("Test is passed");	
			Assert.assertTrue(true);
		}
		
		else 
		{
			System.out.println("Test if failed");
			Assert.assertTrue(false);
		}
		
		
	}
}

