package ua.ithillel.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("After Class");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @AfterGroups
    public void AfterGroups() {
        System.out.println("After Groups");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
    @Test(priority = 3)
    public void Test_1() {
        System.out.println("FirstTest.Test_1()");
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void Test_2() {
        System.out.println("FirstTest.Test_2()");
        Assert.assertFalse(false);
    }

    @Test(priority = 1)
    public void Test_3() {
        System.out.println("FirstTest.Test_3()");
        Assert.assertFalse(false);
    }
}
