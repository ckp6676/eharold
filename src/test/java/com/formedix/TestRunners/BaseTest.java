package com.formedix.TestRunners;

import com.formedix.DataReaders.PropertyFileReaders;
import com.formedix.Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void toKnowWhichClassIsExecuting() {
        System.out.println(super.getClass().getName() + " is started execution");
    }


    @BeforeMethod
    public void openBrowserAndLaunchApplication() {
        String brname = PropertyFileReaders.test_data.get("fomedix.browserName").toString();
        driver = BrowserFactory.getBrowser(brname);
        String url = PropertyFileReaders.getPropertyValue("formedix.url");
        BrowserFactory.launchApplication(url);

    }

    @AfterMethod
    public void closeBrowsers() {
        BrowserFactory.closeAllWindow();

    }

    @AfterClass
    public void toKnowWhichClassCompletedExecution() {
        System.out.println(super.getClass().getName() + " is completed execution");
    }
}

