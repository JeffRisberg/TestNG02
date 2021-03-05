package com.tests.homepage;

import com.framework.core.BaseTest;
import com.pageobjects.homepage.ToptalHomepage;
import org.testng.annotations.Test;

public class ToptalHomePageTests extends BaseTest {

  @Test
  public void homepageTests() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    ToptalHomepage toptalHomepage = new ToptalHomepage(getDriver());
  }
}
