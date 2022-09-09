package com.pageobject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_9 extends baseclass{
	@Test
	public void tc9() {
		//dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525676");
	//	dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		dri.findElement(By.xpath("//android.widget.TextView[@text='New User - Sign Up']")).click();
		dri.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys("");
		dri.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("");
		dri.findElement(By.xpath("//android.widget.EditText[@text='Mobile']")).sendKeys("");
		dri.findElement(By.xpath("//android.widget.EditText[@text='City']")).sendKeys("");
		dri.findElement(By.xpath("//android.widget.EditText[@text='State code']")).sendKeys("");
		dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();
	String errormsg=	dri.findElement(By.xpath("//android.widget.TextView[@text='Error while signup']")).getText();
	System.out.println(errormsg);
	dri.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	
	
	
	
	}

}
