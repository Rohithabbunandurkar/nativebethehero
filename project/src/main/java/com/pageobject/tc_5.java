package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_5 extends baseclass{
	@Test
	public void tc5() {
		dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525676");
		WebElement login=dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
		login.click();
	boolean value=	login.isDisplayed();
	System.out.println(value);
	dri.findElement(By.xpath("//android.widget.TextView[@text='Logout']")).click();
	}

}
