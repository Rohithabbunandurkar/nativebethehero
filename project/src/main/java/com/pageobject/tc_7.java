package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_7 extends baseclass{
	@Test
	public void tc7() {
		dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525676");
		dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		dri.findElement(By.xpath("//android.widget.TextView[@text='Account']")).click();
		WebElement actualid =dri.findElement(By.xpath("//android.widget.EditText[@text='a8525676']"));
	String Actual=	actualid.getText();
		String expected= "a8525676";
		if(Actual.equals(expected)) {
			System.out.println("ID is displayed");
		}else
		{
			System.out.println("ID is not displayed");
		}
	WebElement actual=	dri.findElement(By.xpath("//android.widget.EditText[@text='Golu']"));
String exp=	actual.getText();
if(actual.equals(exp)) {
	System.out.println("name is displayed");
}else {System.out.println("name is not displayed");
	}
WebElement actualemail=dri.findElement(By.xpath("//android.widget.EditText[@text='golunandurkar@gmail.com']"));
String expemail=actualemail.getText();
if(actualemail.equals(expemail)) {
	System.out.println("email is displayed");
}else {System.out.println("email is not displayed");
	}
WebElement actualmobile=dri.findElement(By.xpath("//android.widget.EditText[@text='7020515344']"));
String expmobile=actualmobile.getText();
if(actualmobile.equals(expmobile)) {
	System.out.println("mobile is displayed");
}else {System.out.println("mobile is not displayed");
}
WebElement actaulcity=dri.findElement(By.xpath("//android.widget.EditText[@text='amravati']"));
String expcity=actaulcity.getText();
if(actaulcity.equals(expcity)) {
	System.out.println("city is displayed");
}else {
	System.out.println("city is not displayed");
}
WebElement actualcode=dri.findElement(By.xpath("//android.widget.EditText[@text='07']"));
	String expcode=actualcode.getText();
	if(actualcode.equals(expcode)) {
		System.out.println("code is displayed");
	}else {
		System.out.println("code is not displayed");
	}
	
	}}