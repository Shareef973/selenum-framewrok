package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class passwdchangePOM {
	
private WebDriver driver; 
	
	public passwdchangePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-password")
	private WebElement inpassword;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement press;
	
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Password')]")
	private WebElement passwrd;
		
	@FindBy(id="input-password")
	private WebElement passwd;
	
	@FindBy(id="input-confirm")
	private WebElement passwd2;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement contnue;
	
	

	public void emali(String email) {
		this.email.clear(); 
		this.email.sendKeys(email); 
	}
	

	public void enterpassword(String inpassword) {
		this.inpassword.clear(); 
		this.inpassword.sendKeys(inpassword); 
	}
	
    public void Click() {
		
		this.press.click();
	}

	
	
	public void clickpasswordpage() {
		this.passwrd.click();
		}
	
	public void sendPassword(String passwd) {
		this.passwd.clear(); 
		this.passwd.sendKeys(passwd); 
	}
	
	public void confirmPassword(String passwd2) {
		this.passwd2.clear(); 
		this.passwd2.sendKeys(passwd2); 
	}

	public void contin() {
		
		this.contnue.click();
	}

}
