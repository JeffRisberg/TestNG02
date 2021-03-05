package com.pageobjects.google;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class StorePage extends BasePage {

  // Page URL
  private static String PAGE_URL = "https://store.google.com/US";

  public StorePage(WebDriver driver) {
    super(driver);

    assertCurrentUrl(PAGE_URL);

    // Initialize Elements
    PageFactory.initElements(driver, this);
  }
}
