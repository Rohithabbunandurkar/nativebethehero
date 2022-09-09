package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_6 extends baseclass {
	@Test
	public void tc6() {
		dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525676");
		dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		dri.findElement(By.xpath("//android.widget.TextView[@text='Account']")).click();
		dri.findElement(By.xpath("//android.widget.TextView[@text='EDIT']")).click();
	WebElement id=	dri.findElement(By.xpath("//android.widget.EditText[@text='Golu']"));
	id.clear();
	id.sendKeys("Rohit");
	WebElement email=dri.findElement(By.xpath("//android.widget.EditText[@text='golunandurkar@gmail.com']"));
	email.clear();
	email.sendKeys("rohitnandurkar@gmail.com");
	WebElement num=	dri.findElement(By.xpath("//android.widget.EditText[@text='7020515344']"));
	num.clear();
	num.sendKeys("7020515334");
	WebElement city=	dri.findElement(By.xpath("//android.widget.EditText[@text='amravati']"));
	city.clear();
	city.sendKeys("Pune");
	WebElement scode=	dri.findElement(By.xpath("//android.widget.EditText[@text='07']"));
	scode.clear();
	scode.sendKeys("41");
	dri.findElement(By.xpath("//android.widget.TextView[@text='UPDATE']")).click();
	dri.navigate().back();
	dri.findElement(By.xpath("//android.widget.TextView[@text='Logout']")).click();
	
	
	}

}
