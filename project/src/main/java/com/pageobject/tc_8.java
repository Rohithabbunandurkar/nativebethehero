package com.pageobject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_8 extends baseclass {
	@Test
	public void tc8() {
		dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525679");
		dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		String errormsg=dri.findElement(By.id("android:id/alertTitle")).getText();
		System.out.println(errormsg);
		dri.findElement(By.id("android:id/button1")).click();
		
	}

}
