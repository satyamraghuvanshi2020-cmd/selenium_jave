package Day43.pack.copy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 
{
@Test
void pqr() {
	System.out.println("this pqr is from c3");
}

@BeforeSuite
void before()
{
	System.out.println("This before suit from c3");
}

@AfterSuite
void after() 
{
	System.out.println("This is after suit from c3");
}

}
