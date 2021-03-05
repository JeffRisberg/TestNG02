package com.pageobjects.homepage;

import com.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ToptalHomepage extends BasePage {

  // Page URL
  private static String PAGE_URL = "https://www.toptal.com";

  // Locators

  // Apply as Developer Button
  @FindBy(how = How.LINK_TEXT, using = "Apply as a Freelancer")
  private WebElement developerApplyButton;

  public ToptalHomepage(WebDriver driver) {
    super(driver);

    driver.get(PAGE_URL);

    // Initialize Elements
    PageFactory.initElements(driver, this);

    System.out.println(developerApplyButton);
  }

  public void clickOnDeveloperApplyButton() {
    developerApplyButton.click();
  }
}
