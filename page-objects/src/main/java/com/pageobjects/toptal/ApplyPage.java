package com.pageobjects.toptal;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.domain.CandidateType;
import com.framework.core.BasePage;
import org.openqa.selenium.*;

public class ApplyPage extends BasePage {

  private WebElement cookieBannerAllowButton;

  private WebElement talentSelector;
  private WebElement fullNameText;
  private WebElement emailText;
  private WebElement passwordText;
  private WebElement passwordConfirmText;
  private WebElement commitButton;

  public ApplyPage(WebDriver driver) {
    super(driver);

    assertTrue(loadProperties("toptal/applyPage"));

    String pageUrl = properties.getProperty("APPLY_URL");
    assertCurrentUrl(pageUrl);

    String cookieBannerAllowButtonLocator =
        properties.getProperty("APPLY_COOKIE_BANNER_BTN_ALLOW_XPATH");
    cookieBannerAllowButton = getElement(driver, By.xpath(cookieBannerAllowButtonLocator), 30);
    assertNotNull(cookieBannerAllowButton, "cannot find Cookie Banner allow link");

    if (cookieBannerAllowButton != null) {
      highlightElement(getDriver(), cookieBannerAllowButton, HIGHLIGHT_DURATION);

      cookieBannerAllowButton.click();
    }

    String talentSelectorLocator = properties.getProperty("APPLY_TALENT_SELECTOR_XPATH");
    talentSelector = getElement(driver, By.xpath(talentSelectorLocator), 30);
    assertNotNull(talentSelector, "cannot find Talent Selector element");

    String fullNameTextLocator = properties.getProperty("APPLY_FULL_NAME_TEXT_XPATH");
    fullNameText = getElement(driver, By.xpath(fullNameTextLocator), 30);
    assertNotNull(fullNameText, "cannot find FullName Text element");

    String emailTextLocator = properties.getProperty("APPLY_EMAIL_TEXT_XPATH");
    emailText = getElement(driver, By.xpath(emailTextLocator), 30);
    assertNotNull(emailText, "cannot find Email Text element");

    String passwordTextLocator = properties.getProperty("APPLY_PASSWORD_TEXT_XPATH");
    passwordText = getElement(driver, By.xpath(passwordTextLocator), 30);
    assertNotNull(emailText, "cannot find Password Text element");

    String passwordConfirmTextLocator = properties.getProperty("APPLY_PASSWORD_CONFIRM_TEXT_XPATH");
    passwordConfirmText = getElement(driver, By.xpath(passwordConfirmTextLocator), 30);
    assertNotNull(passwordConfirmText, "cannot find Password Confirm Text element");

    String commitButtonLocator = properties.getProperty("APPLY_COMMIT_BUTTON_XPATH");
    commitButton = getElement(driver, By.xpath(commitButtonLocator), 30);
    assertNotNull(commitButton, "cannot find CommitButton element");
  }

  public void selectType(CandidateType candidateType) {
    String defaultValueLocator = properties.getProperty("APPLY_DEFAULT_VALUE_XPATH");

    WebElement defaultValueElement = talentSelector.findElement(By.xpath(defaultValueLocator));

    threadSleep(500);

    highlightElement(getDriver(), defaultValueElement, HIGHLIGHT_DURATION);

    defaultValueElement.click(); // open it

    threadSleep(500);

    String xPathStr = String.format("//div[@data-value='%s']", candidateType.getSelectionValue());

    WebElement typeChild = talentSelector.findElement(By.xpath(xPathStr));

    highlightElement(getDriver(), typeChild, HIGHLIGHT_DURATION);

    threadSleep(500);

    typeChild.click(); // close with a selection
  }

  public void typeFullName(String fullName) {
    scrollToView(getDriver(), fullNameText);

    highlightElement(getDriver(), fullNameText, HIGHLIGHT_DURATION);

    fullNameText.sendKeys(fullName);
  }

  public void typeEmail(String email) {
    scrollToView(getDriver(), emailText);

    highlightElement(getDriver(), emailText, HIGHLIGHT_DURATION);

    emailText.sendKeys(email);
  }

  public void typePassword(String password) {
    scrollToView(getDriver(), passwordText);

    highlightElement(getDriver(), passwordText, HIGHLIGHT_DURATION);

    passwordText.sendKeys(password);
  }

  public void clickCommit() {
    highlightElement(getDriver(), commitButton, HIGHLIGHT_DURATION);

    scrollToView(getDriver(), commitButton);

    commitButton.click();
  }
}
