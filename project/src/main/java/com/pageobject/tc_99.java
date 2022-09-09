package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_99 extends baseclass{
	@Test
	public void tc99() {
		
		
		dri.findElement(By.xpath("//android.widget.TextView[@text='New User - Sign Up']")).click();
		dri.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Rohit");
		dri.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("rohitnandurkar@gmail.com");
		dri.findElement(By.xpath("//android.widget.EditText[@text='Mobile']")).sendKeys("7020515334");
		dri.findElement(By.xpath("//android.widget.EditText[@text='City']")).sendKeys("Pune");
		dri.findElement(By.xpath("//android.widget.EditText[@text='State code']")).sendKeys("410");
		dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();
	WebElement e=	dri.findElement(By.xpath("//android.widget.TextView[@text='Error while signup']"));
	System.out.println(e.getText());
	dri.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	}

}
