package Day25;

public class chainingXpath {

	public static void main(String[] args) {
		
		// Parent element
		// input[@id='txtUsername']/parent::form 
		// input[@id='txtUsername']/parent::*
		// input[@id='txtUsername']/..
		
		//Child element
		
		//div[@id='divUsername']/child::span
		//div[@id='divUsername']/input
		
		//grand child
		
		//form/*/input
		//form/div/input
		
		
		//ancestor element
		
		//input[@id='txtUsername']/ancestor::form
		//input[@id='txtUsername']/ancestor::*
		
		//descendant element
		
		//form[@id='frmLogin']/descendant::span
		//form[@id='frmLogin']/span
		
		//following element
		
		//input[@id='txtUsername']/following::input[last()]
		
		//precedent element
		
		//Span[text()='Password']/preceding::input
		//Span[text()='Password']/preceding::input[2]
		
		//following-sibling
		//preceding-sibling
		
		// //a[@title='Property in Delhi For Sale']/../..
		
	}

}
