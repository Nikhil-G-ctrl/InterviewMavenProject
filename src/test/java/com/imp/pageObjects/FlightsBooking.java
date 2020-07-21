package com.imp.pageObjects;

import org.bson.codecs.ValueCodecProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightsBooking {
	
	WebDriver lDriver;
	
	public FlightsBooking(WebDriver rdriver) {
		lDriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html//input[@id='RoundTrip']")
	WebElement roundtrip;
	
	@FindBy(xpath="/html//input[@id='FromTag']")
	WebElement fromlocation;
	
	@FindBy(xpath="/html//input[@id='ToTag']")
	WebElement tolocation;
	
	@FindBy(xpath="/html//input[@id='DepartDate']")
	WebElement fromdate;
	
	@FindBy(xpath="/html//input[@id='ReturnDate']")
	WebElement todate;
	
	@FindBy(xpath="/html//select[@id='Adults']")
	WebElement adults;
	
	@FindBy(xpath="/html//input[@id='SearchBtn']")
	WebElement searchflights;
	
	@FindBy(xpath="/html//div[@id='root']/div[@class='App flex flex-column']/main[@class='flex-1']/div[@class='container']//div[@class='pr-2']/div[2]/div[2]/div/label[1]/div[1]/span")
	WebElement nonstopcheckbox;
	
	@FindBy(xpath="/html//div[@id='root']/div[@class='App flex flex-column']/main[@class='flex-1']/div[@class='container']/div[@class='row']/div[@class='col-19']/div[2]/div[12]/div[1]/div[1]/div/div[2]/div[1]//p[.='22:15']")
	WebElement depindigo;
	
	@FindBy(xpath="/html//div[@id='root']/div[@class='App flex flex-column']/main[@class='flex-1']/div[@class='container']/div[@class='row']/div[@class='col-19']/div[2]/div[12]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[1]")
	WebElement retspicejet;
	
	@FindBy(xpath="/html//div[@id='root']/div[@class='App flex flex-column']//div[@class='col-19']/div[2]/div[7]/div//button[.='Book']")
	WebElement book;
	
	@FindBy(xpath="/html//input[@id='insurance_confirm']")
	WebElement acceptterms;
	
	@FindBy(xpath="/html//input[@id='itineraryBtn']")
	WebElement continuebooking;
	
	@FindBy(xpath="/html//input[@id='username']")
	WebElement email;
	
	@FindBy(xpath="/html//input[@id='LoginContinueBtn_1']")
	WebElement continuemail;
	
	@FindBy(xpath="//form[@id='travellerDetails']/div[1]//dd[@class='ugly']/select[@name='AdultTitle1']")
	WebElement traveller1dd;
	
	@FindBy(xpath="//form[@id='travellerDetails']/div[1]//dl[@class='horizontal travellers']/dd/input[@name='AdultFname1']")
	WebElement traveller1fname;
	
	@FindBy(xpath="//form[@id='travellerDetails']/div[1]//dl[@class='horizontal travellers']/dd/input[@name='AdultLname1']")
	WebElement traveller1lname;
	
	@FindBy(xpath="//form[@id='travellerDetails']/div[2]//dd[@class='ugly']/select[@name='AdultTitle2']")
	WebElement traveller2dd;
	
	@FindBy(xpath="//form[@id='travellerDetails']/div[2]//dl[@class='horizontal travellers']/dd/input[@name='AdultFname2']")
	WebElement traveller2fname;
	
	@FindBy(xpath="//form[@id='travellerDetails']/div[2]//dl[@class='horizontal travellers']/dd/input[@name='AdultLname2']")
	WebElement traveller2lname;
	
	@FindBy(xpath="/html//input[@id='mobileNumber']")
	WebElement mobileno;
	
	@FindBy(xpath="/html//input[@id='travellerBtn']")
	WebElement continuetraveller;
	
	@FindBy(xpath="//li[@id='NBTab']/a[@title='Net Banking']")
	WebElement netbanking;
	
	@FindBy(xpath="/html//input[@id='kotak_bank']")
	WebElement kotakradio;
	
	public void clickRoundTrip() {
		roundtrip.click();
	}
	
	public void addFromLocation() {
		fromlocation.sendKeys("Mumbai, IN - Chatrapati Shivaji Airport (BOM)");
	}
	
	public void addToLocation() {
		tolocation.sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
	}
	
	public void addFromDate() {
		fromdate.sendKeys("Sun, 26 Jul, 2020");
	}
	
	public void addToDate() {
		todate.sendKeys("Mon, 27 Jul, 2020");
	}
	
	public void selectAdults() {
		
		Select select = new Select(adults);
		select.selectByValue("2");
	}
	
	public void clickOnSearchFlights() {
		searchflights.click();
	}
	
	public void clickOnNonStop() {
		nonstopcheckbox.click();
	}
	
	public void clickOnDeparture() {
		depindigo.click();
	}
	
	public void clickOnDestination() {
		retspicejet.click();
	}
	
	public void clickOnBook() {
		book.click();
	}
	
	public void clickOnAcceptTerms() {
		acceptterms.click();
	}
	
	public void clickOnContinueBooking() {
		continuebooking.click();
	}
	
	public void addEmailAddress() {
		email.sendKeys("verve@sample.com");
	}
	
	public void clickOnContinueEmail() {
		continuemail.click();
	}
	
	public void selectTrveller1DD() {
		Select select1 = new Select(traveller1dd);
		select1.selectByValue("Mr");
	}
	
	public void addTraveller1FName() {
		traveller1fname.sendKeys("David");
	}

	public void addTraveller1LName() {
		traveller1lname.sendKeys("Clinton");
	}
	
	public void selectTrveller2DD() {
		Select select1 = new Select(traveller2dd);
		select1.selectByValue("Mr");
	}
	
	public void addTraveller2FName() {
		traveller2fname.sendKeys("Kane");
	}
	
	public void addTraveller2LName() {
		traveller2lname.sendKeys("Guptill");
		
	}
	
	public void addPhoneNumber() {
		mobileno.sendKeys("9999999999");
	}
	
	public void clickOnContinueTraveller() {
		continuetraveller.click();
	}
	
	public void clickOnNetBanking() {
		netbanking.click();
	}
	
	public void clickOnKotak() {
		kotakradio.click();
	}



	
	
	
	
	
	
	
	
	

}
