package com.tests.toptal;

import com.framework.core.BaseTest;
import com.pageobjects.toptal.ApplyPage;
import com.pageobjects.toptal.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

  @Test
  public void homepageTests() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    HomePage toptalHomePage = new HomePage(getDriver());

    ApplyPage applyPage = toptalHomePage.clickOnDeveloperApplyButton();

    applyPage.selectType("developers");
    applyPage.typeFullName("Bob Smith");
    applyPage.typeEmail("bob@gmail.com");
    applyPage.typePassword("12345678");
    applyPage.clickCommit();
  }
}
