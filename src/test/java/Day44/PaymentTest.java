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

1. All sanity
2. All Regression
3. All Sanity but not Regression
4. All Regression but not Sanity
5. Only Sanity and Regression 
 */
public class PaymentTest 
{
	@Test(priority=1,groups= {"sanity","Regression","Functional"})
    void paymentInRupees() {
        System.out.println("Payment in rupees....");
    }
	
	@Test(priority=2,groups= {"sanity","Regression","Functional"})
    void paymentInDollar() {
        System.out.println("Payment in rupees....");
    }
	
		
}
