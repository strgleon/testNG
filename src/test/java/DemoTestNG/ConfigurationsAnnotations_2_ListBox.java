package DemoTestNG;

import org.testng.annotations.*;
@Test (groups = "smoke")
public class ConfigurationsAnnotations_2_ListBox {
    @Test
    public void test3_BootstrapListBox(){
        System.out.println("     (5) Test Method 1: Bootstrap List Box");
    }

    @Test
    public void test4_JQueryDListBox(){
        System.out.println("     (5) Test Method 2: JQuery List Box");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("    (4) Execute Before Each Test Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("    (4) Execute After Each Test Method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("   (3) Execute Before Class: List Box");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("   (3) Execute After Class: List Box");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("  (2) Execute Before Each Test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("  (2) Execute After Each Test");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("  (2) Execute before the Suite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("  (2) Execute after the Suite");
    }

    @BeforeGroups (groups = {"regression", "smoke"})
    public void beforeGroups(){
        System.out.println("Execute Before Groups:" );
    }
    @AfterGroups(groups = {"regression", "smoke"})
    public void afterGroups(){
        System.out.println("Execute After Groups:" );
    }
}
