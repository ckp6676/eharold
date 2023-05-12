package com.formedix.TestRunners;

import com.formedix.Utils.BrowserFactory;
import com.formedix.Utils.CommonUtil;
import org.testng.annotations.Test;
import com.formedix.PageObject.formedixFunctionality;

public class formedixTestrunner extends  BaseTest{

    @Test
    public void testFormedixFunctionality(){
        formedixFunctionality test = new formedixFunctionality(BrowserFactory.getBrowser());
        test.enterUserName();
        test.enterPassword();
        test.clickOnSingIn();
        test.moveToRepository();
        test.clickOnStudies();
        test.clickOnTechStudy();
        test.clickOnView();
        CommonUtil.waitDefinite(3);
        test.clickOnForms();
        CommonUtil.waitDefinite(3);
        test.clickOnMedicalHistory();
        test.clickOnEdit();
        test.addDescription();
        test.clickOnUpdate();
        CommonUtil.waitDefinite(3);
        test.moveToSingOffButton();
        test.clickOnSingOut();
     //   BrowserFactory.closeAllWindow();

    }
}
