package com.Ten_Adactin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin_Runner extends Base_Class {
	
//	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = browser_Launch("https://adactinhotelapp.com/");
		
//		Wait
		
		implicitlyWait(20);
		
		Pom_Of_Pom P = new Pom_Of_Pom(driver);
		
//		LOGIN
		
		sendKeys(P.getObj().getUserName(),"Bumblebee007");
		
		sendKeys(P.getObj().getPassword(),"Arthi123#");
		
		click(P.getObj().getLogin());
		
//		SEARCH HOTEL
		
		dropDown_SelectByValue(P.getObj1().getLocation(),"London");
		
		dropDown_SelectByValue(P.getObj1().getHotel(),"Hotel Sunshine");
		
		dropDown_SelectByValue(P.getObj1().getRoom_Type(),"Deluxe");
		
		dropDown_SelectByValue(P.getObj1().getNoOfRooms(),"2");
		
		P.getObj1().getCheck_In().clear();
		
		sendKeys(P.getObj1().getCheck_In(),"13/09/2024");
		
		P.getObj1().getCheck_Out().clear();
		
		sendKeys(P.getObj1().getCheck_Out(),"13/10/2024");
		
		dropDown_SelectByValue(P.getObj1().getNoOfPerson(),"2");
		
		dropDown_SelectByValue(P.getObj1().getChildren(),"1");
		
		click(P.getObj1().getSearch());
		
//		SELECT HOTEL
		
		radio_Button(P.getObj2().getRadio_Btn());
		
		P.getObj2().getContinue().click();
		
//		BOOK A HOTEL
		
		sendKeys(P.getObj3().getFirst_Name(),"Swetha");
		
		sendKeys(P.getObj3().getLast_Name(),"Senthil");
		
		sendKeys(P.getObj3().getAddress(),"Dubai main road");
		
		sendKeys(P.getObj3().getCard_Num(),"1234567891011121");
		
		dropDown_SelectByValue(P.getObj3().getCard_Type(),"VISA");
		
		dropDown_SelectByValue(P.getObj3().getMonth(),"10");
		
		dropDown_SelectByValue(P.getObj3().getYear(),"2026");
		
		sendKeys(P.getObj3().getCvv_Num(),"1111");
		
		P.getObj3().getBooking().click();
		
//		BOOKING CONFIRMATION
		
		P.getObj4().getItinerary().click();
		
		sendKeys(P.getObj4().getSearch(),"6ZS5CS804K");
		
		P.getObj4().getGo().click();
		
		screenShot("C:\\Users\\91962\\eclipse-workspace\\Selenium\\Screenshot\\Adactin_runner.png");
		
		P.getObj4().getLogout().click();	
		
/*		
		
//		LOGIN
		
		Login obj = new Login(driver);
		
		sendKeys(obj.getUserName(),"Bumblebee007");
		
		sendKeys(obj.getPassword(),"Arthi123#");
		
		click(obj.getLogin());
		
//		SEARCH HOTEL
		
		Search_Hotel obj1 = new Search_Hotel(driver);
		
		dropDown_SelectByValue(obj1.getLocation(),"London");
		
		dropDown_SelectByValue(obj1.getHotel(),"Hotel Sunshine");
		
		dropDown_SelectByValue(obj1.getRoom_Type(),"Deluxe");
		
		dropDown_SelectByValue(obj1.getNoOfRooms(),"2");
		
		obj1.getCheck_In().clear();
		
		sendKeys(obj1.getCheck_In(),"13/09/2024");
		
		obj1.getCheck_Out().clear();
		
		sendKeys(obj1.getCheck_Out(),"13/10/2024");
		
		dropDown_SelectByValue(obj1.getNoOfPerson(),"2");
		
		dropDown_SelectByValue(obj1.getChildren(),"1");
		
		click(obj1.getSearch());
		
//		SELECT HOTEL
		
		Select_Hotel obj2 = new Select_Hotel(driver);
		
		radio_Button(obj2.getRadio_Btn());
		
		obj2.getContinue().click();
		
//		BOOK A HOTEL
		
		Book_A_Hotel obj3 = new Book_A_Hotel(driver);
		
		sendKeys(obj3.getFirst_Name(),"Swetha");
		
		sendKeys(obj3.getLast_Name(),"Senthil");
		
		sendKeys(obj3.getAddress(),"Dubai main road");
		
		sendKeys(obj3.getCard_Num(),"1234567891011121");
		
		dropDown_SelectByValue(obj3.getCard_Type(),"VISA");
		
		dropDown_SelectByValue(obj3.getMonth(),"10");
		
		dropDown_SelectByValue(obj3.getYear(),"2026");
		
		sendKeys(obj3.getCvv_Num(),"1111");
		
		obj3.getBooking().click();
		
//		BOOKING CONFIRMATION
		
		Booking_Confirmation obj4 = new Booking_Confirmation(driver);
		
		obj4.getItinerary().click();
		
		sendKeys(obj4.getSearch(),"6ZS5CS804K");
		
		obj4.getGo().click();
		
		screenShot("C:\\Users\\91962\\eclipse-workspace\\Selenium\\Screenshot\\Adactin_runner.png");
		
		obj4.getLogout().click();
		
*/		

	}

}
