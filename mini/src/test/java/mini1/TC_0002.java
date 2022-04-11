package mini1;

import org.junit.Test;

public class TC_0002 {

	@Test
	public void Contact() {
		
		Test Test = new Test(driver);
		Test.ClickngOnContact.click();
		
		Test.ClickngOnContactEmail.click().sendKeys("abc@gmail");
		
		Test.ClickngOnContactName.click().sendKeys("abc");

		Test.ClickngOnMessage.click().sendKeys("xyz");
		
		Test.ClickingOnSend.click();
	}

}
