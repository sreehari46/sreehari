package mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPom {
	public MyPom(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//TC_001
@FindBy(id="itemc") private WebElement ClickingOnPhones;

@FindBy(linkText="Samsung galaxy s6") private WebElement ClickingOnSamsung;

@FindBy(linkText="Add to cart") private WebElement ClickingOnAddToCart;

//@FindBy()

@FindBy(linkText="Cart") private WebElement ClickingOnCart;

@FindBy(css="button[type='button']") private WebElement ClickingOnPlaceOrder;

@FindBy(id="name") private WebElement ClickingOnName;

@FindBy(id="country") private WebElement ClickingOnCoun;

@FindBy(id="city") private WebElement ClickingOnCity;

@FindBy(id="card") private WebElement ClickingOnCard;
		
@FindBy(id="month") private WebElement ClickingOnMon;

@FindBy(id="year") private WebElement ClickingOnYear;

@FindBy(css="button[onclick='purchaseOrder()']") private WebElement ClickingOnPurchase;


//TC_002

@FindBy(linkText="Contact") private WebElement ClickngOnContact;

@FindBy(id="recipient-email") private WebElement ClickngOnContactEmail;

@FindBy(id="recipient-name") private WebElement ClickngOnContactName;

@FindBy(id="message-text") private WebElement ClickngOnMessage;

@FindBy(css="button[onclick='send()']") private WebElement ClickingOnSend;


//TC_001 methods


public WebElement getClickingOnPhones() {
	return ClickingOnPhones;
}

public WebElement getClickingOnSamsung() {
	return ClickingOnSamsung;
}

public WebElement getClickingOnAddToCart() {
	return ClickingOnAddToCart;
}

public WebElement getClickingOnCart() {
	return ClickingOnCart;
}

public WebElement getClickingOnPlaceOrder() {
	return ClickingOnPlaceOrder;
}

public WebElement getClickingOnName() {
	return ClickingOnName;
}

public WebElement getClickingOnCoun() {
	return ClickingOnCoun;
}

public WebElement getClickingOnCity() {
	return ClickingOnCity;
}

public WebElement getClickingOnCard() {
	return ClickingOnCard;
}

public WebElement getClickingOnMon() {
	return ClickingOnMon;
}

public WebElement getClickingOnYear() {
	return ClickingOnYear;
}

public WebElement getClickingOnPurchase() {
	return ClickingOnPurchase;
}


//TC_002 methods

public WebElement getClickngOnContact() {
	return ClickngOnContact;
}

public WebElement getClickngOnContactEmail() {
	return ClickngOnContactEmail;
}

public WebElement getClickngOnContactName() {
	return ClickngOnContactName;
}

public WebElement getClickngOnMessage() {
	return ClickngOnMessage;
}

public WebElement getClickingOnSend() {
	return ClickingOnSend;
}



}

	


