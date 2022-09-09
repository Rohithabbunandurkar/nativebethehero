package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_4 extends baseclass{
	@Test
	public void tc4() {
		dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525676");
		dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		 WebElement v=    (WebElement) dri.findElements(By.className("android.view.ViewGroup")).get(6);
			v.click();
		boolean whatsapp=	dri.findElement(By.xpath("//android.widget.TextView[@text='WhatsApp']")).isDisplayed();
		System.out.println(whatsapp);
		boolean email =	dri.findElement(By.xpath("//android.widget.TextView[@text='E-mail']")).isDisplayed();
		
		System.out.println(email);
	}

}
