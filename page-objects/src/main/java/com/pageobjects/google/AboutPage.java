package com.pageobjects.google;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class AboutPage extends BasePage {

  // Page URL
  private static String PAGE_URL = "https://about.google";

  public AboutPage(WebDriver driver) {
    super(driver);

    assertCurrentUrl(PAGE_URL);

    // Initialize Elements
    PageFactory.initElements(driver, this);
  }
}
