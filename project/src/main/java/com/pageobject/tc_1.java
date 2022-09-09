package com.pageobject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_1 extends baseclass{
@Test
public void tc1() {
	dri.findElement(By.xpath("//android.widget.TextView[@text='New User - Sign Up']")).click();
	dri.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Rohit");
	dri.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("rohitnandurkar@gmail.com");
	dri.findElement(By.xpath("//android.widget.EditText[@text='Mobile']")).sendKeys("7020515334");
	dri.findElement(By.xpath("//android.widget.EditText[@text='City']")).sendKeys("Pune");
	dri.findElement(By.xpath("//android.widget.EditText[@text='State code']")).sendKeys("41");
	dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();
    WebElement successmessage= dri.findElement(By.id("android:id/alertTitle"));
	successmessage.click();
	String msg=successmessage.getText();
	System.out.println(msg);
	dri.findElement(By.id("android:id/button1")).click();
    String name= dri.findElement(By.xpath("//android.widget.TextView[@text='Rohit']")).getText();
	assertEquals(name, "Rohit");
	System.out.println(name);
	dri.findElement(By.xpath("//android.widget.TextView[@text='Account']")).click();
	dri.navigate().back();
	   dri.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
			dri.findElement(By.xpath("//android.widget.TextView[@text='Logout']")).click();
//			dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525676");
//			dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
}
}
