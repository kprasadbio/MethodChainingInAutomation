package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {  
	
	@FindBy(xpath="//input[@name='firstname']")
	 private WebElement txt_FN;
	
	@FindBy(xpath="//input[@name='lastname']")
	 private  WebElement txt_LN;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	 private WebElement txt_eMail;
	
	public RegisterPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}
	
	
	public void inputFirstName(String FN){
		txt_FN.sendKeys(FN);
	}
	
	public void inputLastName(String LN){
		txt_LN.sendKeys(LN);
	}
	
	public void inputEmail(String email){
		txt_eMail.sendKeys(email);
	}
	
	
	  
}
