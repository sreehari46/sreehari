package mini1;


import org.junit.Test;

public class TC_0001  {

	@Test
	public void TC_01() {
	
		
		
		  Test Test = new Test(driver);
		Test.ClickingOnPhones.click();
		
		Test.ClickingOnSamsung.click();
		
		Test.ClickingOnAddToCart.click();
		
		Test.ClickingOnCart.click();
		
		Test.ClickingOnPlaceOrder.click();
		
		Test.ClickingOnName.click().sendKeys("abc");
		
		Test.ClickingOnCoun.click().sendKeys("xyz");
		
		Test.ClickingOnCity.click().sendKeys("pqrs");
		
		Test.ClickingOnCard.click().sendKeys(1234);
		
		Test.ClickingOnMon.click().sendKeys("may");
		
		Test.ClickingOnYear.click().sendKeys("2024");
		
		Test.ClickingOnPurchase.click();
		
		
		
		
			
		}

	}


