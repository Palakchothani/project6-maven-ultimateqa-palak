package com.ultimateqa.testsuite;

import com.ultimateqa.pages.HomePage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest
{
  HomePage homepage = new HomePage();

  @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
    homepage.navigatedToLoginPageWithClick();
  }
}
