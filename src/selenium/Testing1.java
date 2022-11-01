package selenium;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing1 {
  @Test(dataProvider = "dp")
  public void abc(Integer n, String s) {
	  System.out.println(n+s);
  }
  
  //same as junit
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod");

  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  //second and once in class
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");

  }

  //first and once in class
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");

  }

  // first and once in suite
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuite");

  }
  
  @Test(groups = "smoke")
  public void test1() {
	  System.out.println("test1");

  }
  
  @Test (groups = "sanity")
  public void test2() {
	  System.out.println("test2");

  }
  
  @Test (groups = "reg")
  public void test3() {
	  System.out.println("test3");

  }
  
  //Afterclass
  //AfterTest
  //AfterSuite

}
