package com.tests.toptal;

import com.framework.core.BaseTest;
import com.pageobjects.toptal.ApplyPage;
import com.pageobjects.toptal.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

  @Test(groups = { "toptal" })
  public void homePageTests() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    HomePage homePage = new HomePage(getDriver());

    ApplyPage applyPage = homePage.clickOnDeveloperApplyButton();

    applyPage.selectType("developers");
    applyPage.typeFullName("Bob Smith");
    applyPage.typeEmail("bob@gmail.com");
    applyPage.typePassword("12345678");
    applyPage.clickCommit();
  }
}
