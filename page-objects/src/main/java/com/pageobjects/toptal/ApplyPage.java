package com.pageobjects.toptal;

import com.framework.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class ApplyPage extends BasePage {

  // Page URL
  private static String PAGE_URL = "https://www.toptal.com/talent/apply";

  // Locators
  @FindBy(how = How.CLASS_NAME, using = "cookie_banner-btn_allow")
  private WebElement cookieBannerAllowButton;

  @FindBy(how = How.ID_OR_NAME, using = "talent_create_applicant_talent_kind")
  private WebElement typeSelector;

  @FindBy(how = How.ID_OR_NAME, using = "talent_create_applicant_full_name")
  private WebElement fullNameText;

  @FindBy(how = How.ID_OR_NAME, using = "talent_create_applicant_email")
  private WebElement emailText;

  @FindBy(how = How.ID_OR_NAME, using = "talent_create_applicant_password")
  private WebElement passwordText;

  @FindBy(how = How.ID_OR_NAME, using = "talent_create_applicant_password_confirmation")
  private WebElement passwordConfirmText;

  @FindBy(how = How.ID_OR_NAME, using = "save_new_talent_create_applicant")
  private WebElement commitButton;

  public ApplyPage(WebDriver driver) {
    super(driver);

    assertCurrentUrl(PAGE_URL);

    // Initialize Elements
    PageFactory.initElements(driver, this);

    if (cookieBannerAllowButton != null) {
      cookieBannerAllowButton.click();
    }
  }

  public void selectType(String type) {
    /*
    typeSelector.click(); // open it
    WebElement element = driver.findElement(By.xpath("class[custom_select-options_item_title]"));
    System.out.println("element " + element);
    if (element != null) {
      element.click();
    }
    */
  }

  public void typeFullName(String fullName) {
    try {
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fullNameText);
      Thread.sleep(500);
    } catch (InterruptedException e) {
    }
    fullNameText.sendKeys(fullName);
  }

  public void typeEmail(String email) {
    try {
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emailText);
      Thread.sleep(500);
    } catch (InterruptedException e) {
    }
    emailText.sendKeys(email);
  }

  public void typePassword(String password) {
    try {
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordText);
      Thread.sleep(500);
    } catch (InterruptedException e) {
    }
    passwordText.sendKeys(password);
  }

  public void clickCommit() {
    try {
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", commitButton);
      Thread.sleep(500);
    } catch (InterruptedException e) {
    }
    commitButton.click();
  }
}
