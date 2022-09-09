package com.pageobject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utility.baseclass;

public class tc_2 extends baseclass {
	@Test
	public void tc2() {
		dri.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("a8525676");
		dri.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		dri.findElement(By.xpath("//android.widget.TextView[@text='Add Case']")).click();
		dri.findElement(By.xpath("//android.widget.EditText[@text='Give title']")).sendKeys("bethehero");
		dri.findElement(By.xpath("//android.widget.EditText[@text='Give description']")).sendKeys("iambest");
		dri.findElement(By.xpath("//android.widget.EditText[@text='Give value']")).sendKeys("1234");
		dri.findElement(By.xpath("//android.widget.TextView[@text='ADD CASE']")).click();
		dri.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
   String title=dri.findElement(By.xpath("//android.widget.TextView[@text='bethehero']")).getText();
		assertEquals(title, "bethehero");
	String dis=	dri.findElement(By.xpath("//android.widget.TextView[@text='iambest']")).getText();
	assertEquals(dis, "iambest");
	String tc=dri.findElement(By.xpath("//android.widget.TextView[@text='Totally 1 cases.']")).getText();
	System.out.println(tc);
		
	}

}
