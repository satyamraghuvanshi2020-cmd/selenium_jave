package Day44;

import org.testng.annotations.Test;

/*
 Types of Tests

Sanity → Quick checks to confirm basic functionality works.

Regression → Checks that new changes didn’t break old features.

Functional → Validates specific functionality works as expected.

Mapping Tests to Categories
Login Tests (Sanity)

loginByFacebook → sanity

loginByEmail → sanity

loginByTwitter → sanity

👉 These are basic login tests, so they fall under Sanity testing.

Signup Tests (Regression)

signupByFacebook → regression

signupByTwitter → regression

signupByEmail → regression

👉 Signup functionality is categorized under Regression testing.

Payment Tests (Sanity + Regression + Functional)

paymentInRupees → sanity, regression, functional

paymentInDollars → sanity, regression, functional

👉 Payment tests are important (critical functionality), so they are tested in all categories.
 */
public class LoginTests 
{
	@Test(priority=1,groups= {"sanity"})
    void loginByEmail() 
	{
        System.out.println("This is login by email..");
    }

    @Test(priority=2,groups= {"sanity"})
    void loginByFacebook() 
    {
        System.out.println("This is login by facebook..");
    }

    @Test(priority=3,groups= {"sanity"})
    void loginByTwitter() 
    {
        System.out.println("This is login by twitter..");
    }
	
}
