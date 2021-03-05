package com.tests.homepage;

import org.testng.annotations.Test;
import com.framework.core.BaseTest;
import com.pageobjects.homepage.GoogleHomepage;

public class GoogleHomePageTests extends BaseTest {

  @Test
  public void homepageTests() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    GoogleHomepage googleHomepage = new GoogleHomepage(getDriver());
  }
}
