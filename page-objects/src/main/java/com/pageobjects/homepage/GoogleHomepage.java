package com.pageobjects.homepage;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage extends BasePage {

  // Page URL
  private static String PAGE_URL = "https://www.google.com";

  @FindBy(how = How.LINK_TEXT, using = "Google")
  private WebElement googleButton;

  public GoogleHomepage(WebDriver driver) {
    super(driver);

    driver.get(PAGE_URL);

    // Initialize Elements
    PageFactory.initElements(driver, this);

    System.out.println(googleButton);
  }

  public void clickOnGoogleButton() {
    googleButton.click();
  }
}
