package com.pageobjects.toptal;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.framework.core.BasePage;
import org.openqa.selenium.*;

public class HomePage extends BasePage {

  private WebElement developerApplyButton;

  public HomePage(WebDriver driver) {
    super(driver);

    assertTrue(loadProperties("toptal/homePage"));

    String pageUrl = properties.getProperty("HOME_URL");

    driver.get(pageUrl);
    threadSleep(500);

    String developerApplyLinkLocator = properties.getProperty("HOME_DEVELOPER_APPLY_LINK_XPATH");
    developerApplyButton = getElement(driver, By.xpath(developerApplyLinkLocator), 30);
    assertNotNull(developerApplyButton, "cannot find Developer Apply link");
  }

  public ApplyPage clickOnDeveloperApplyButton() {
    scrollToView(getDriver(), developerApplyButton);

    highlightElement(getDriver(), developerApplyButton, HIGHLIGHT_DURATION);

    developerApplyButton.click();

    return new ApplyPage(getDriver());
  }
}
