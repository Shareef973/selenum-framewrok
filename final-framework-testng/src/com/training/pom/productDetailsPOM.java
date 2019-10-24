package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class productDetailsPOM {
	
private WebDriver driver; 
	
	public productDetailsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Uniform Store')]")
	private WebElement uniform;
	
	@FindBy(xpath="//div[@id='banner0']//div//img[@class='img-responsive']")
	private WebElement psu;

	@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//a[1]//img[1]")
	private WebElement shirt;

	@FindBy(xpath="//select[@id='input-option386']")
	private WebElement chestsize;
	
	@FindBy(id="button-cart")
	private WebElement cart;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement showcart;
	
	@FindBy(xpath="//strong[contains(text(),'View Cart')]")
	private WebElement vucart;
	
	@FindBy(xpath="//table[@class='table table-bordered']//img[@class='img-thumbnail']")
	private WebElement check1;

	@FindBy(xpath="//form//tbody//td[2]")
	private WebElement check2;
	
	@FindBy(xpath="//td[contains(text(),'TBSM-4th-8th STD')]")
	private WebElement check3;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement check4;
	
	//@FindBy(name = "View Cart")
	//private WebElement check4;
	
	
	@FindBy(xpath="//div[@class='row']//tbody//td[5]")
	private WebElement check5;
	
	@FindBy(xpath="//tbody//td[6]")
	private WebElement check6;
	
	
	
	public void unif() {
		this.uniform.click();
	}
	
	public void Premsckl() {
		this.psu.click();
	}
	
	public void Shirt() {
		this.shirt.click();
	}
	
	public void sizeselect(String value) {
		
		this.chestsize.click();
		Select val=new Select(this.chestsize);
		val.selectByVisibleText(value);
	}
	
	public void cart() {
		this.cart.click();
		
	}
	
	public void chkcart() {
		this.showcart.click();
		
	}
	
	public void cartview() {
		this.vucart.click();
		
	}
	
	public void check() {
		
	boolean image=this.check1.isDisplayed();
	image=true;
	
	String name = this.check2.getText();
	System.out.println(name);
	name.contains("Regular T-Shirt (Maroon)");
	
	String model = this.check3.getText();
	System.out.println(model);
	model.contains("TBSM-4th-8th STD");
	
	
	String unit=this.check4.getText();
	System.out.println(unit);
	unit.contains("1");
	
	String unitprice = this.check5.getText();
	System.out.println(unitprice);
	unitprice.contains("567");
	
	String total = this.check5.getText();
	System.out.println(total);
	total.contains("567");
	
	}
	
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement rem;
	
	
	
	public void remove() {
		this.rem.click();
		boolean text=driver.getPageSource().contains("Your shopping cart is empty!");
		
		if (text=true) {
			System.out.println("Your shopping cart is empty!");
		}
		else {
			System.out.println("test failed");
		}
		
		}
	
	
}


