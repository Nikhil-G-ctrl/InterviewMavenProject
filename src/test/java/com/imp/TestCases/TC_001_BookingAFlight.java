package com.imp.TestCases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.imp.pageObjects.FlightsBooking;

public class TC_001_BookingAFlight extends BaseClass {

	@Test
	public void BookingFlight() throws IOException {

		FlightsBooking fb = new FlightsBooking(driver);
		fb.clickRoundTrip();
		fb.addFromLocation();
		fb.addToLocation();
		fb.addFromDate();
		fb.addToDate();
		fb.selectAdults();
		fb.clickOnSearchFlights();
		logger.info("Successful!");
		fb.clickOnNonStop();
		fb.clickOnDeparture();
		fb.clickOnDestination();
		fb.clickOnBook();
		fb.clickOnContinueBooking();
		fb.addEmailAddress();
		fb.clickOnContinueEmail();
		fb.selectTrveller1DD();
		fb.addTraveller1FName();
		fb.addTraveller1LName();
		fb.selectTrveller2DD();
		fb.addTraveller2FName();
		fb.addTraveller2LName();
		fb.addPhoneNumber();
		fb.clickOnContinueTraveller();
		fb.clickOnNetBanking();
		fb.clickOnKotak();

		WebElement verify = driver.findElement(By.xpath("/html//select[@id='transferBank']"));

		if (verify.getText().equals("Kotak Bank")) {
			Assert.assertTrue(true);
			logger.info("Page is correct");
		} else {
			captureScreen(driver, "BookingFlight");
			Assert.assertTrue(false);
			logger.info("Page is not correct");
		}

	}

}
