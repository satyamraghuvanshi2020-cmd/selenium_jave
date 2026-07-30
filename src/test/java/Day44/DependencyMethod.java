package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;


//Dependency
public class DependencyMethod 
{

	// First test (priority 1) → Open the application
    
	@Test(priority=1)
    void openapp() 
    {
        Assert.assertTrue(true);    
        
    }

    // Second test (priority 2) → Login to the application
    
	@Test(priority=2, dependsOnMethods= {"openapp"})
    void login() 
    {
		Assert.assertTrue(true);
    }

    // Third test (priority 3) → Perform a search
    
	@Test(priority=3, dependsOnMethods= {"login"})
    void search() 
    {
		Assert.assertTrue(false);
    }

	// Fourth test (priority 5) -> advsearch from the  application
	
    @Test(priority=4,dependsOnMethods= {"login","search"})
    void advsearch() 
    {
    	Assert.assertTrue(true);
    }
    
    
    // Fiveth test (priority 4) → Logout from the application
    
    @Test(priority=5, dependsOnMethods= {"login"})
    void logout() 
    {
    	Assert.assertTrue(true);
    }
}
