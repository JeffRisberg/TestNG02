package com.tests.google;

import com.pageobjects.google.AboutPage;
import com.pageobjects.google.StorePage;
import org.testng.annotations.Test;
import com.framework.core.BaseTest;
import com.pageobjects.google.HomePage;

public class HomePageTests extends BaseTest {

  @Test
  public void homepageTests() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    HomePage homePage = new HomePage(getDriver());
    AboutPage aboutPage = homePage.clickAboutButton();

    homePage = new HomePage(getDriver());
    StorePage storePage = homePage.clickStoreButton();
  }
}
