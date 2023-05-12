package com.formedix.PageObject;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class formedixFunctionality extends BasePage {

    private WebDriver driver;

    public formedixFunctionality(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(name = "username")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "btnSubmit")
    WebElement signIn;
    @FindBy(xpath = "//*[@id=\"menuMdb\"]/fdx-main-nav-item/div/p[2]")
    WebElement repo;
    @FindBy(xpath = "//*[@id=\"menuMdbStudies\"]/span/span")
    WebElement studies;
    @FindBy(xpath = "//*[@id=\"fdxMdbContainerListItem0MenuToggle\"]")
    WebElement techStudy;
    @FindBy(id="fdxMdbContainerListItem0View")
    WebElement view;
    @FindBy(xpath = "//*[@id=\"FORMTypeView\"]")
    WebElement forms;
    @FindBy(className = "fdx-ellipsis")
    WebElement medicalHistory;
    @FindBy(xpath = "//*[@id=\"switchEditMode\"]/span[2]")
    WebElement editForm;
    @FindBy(id = "assetLocaleEditTextTextareadescription")
    WebElement description;
    @FindBy(id="saveAsset")
    WebElement update;
    @FindBy(xpath = "//*[@id=\"menuUser\"]/fdx-main-nav-item/div/p[1]")
    WebElement testTeamTechTest;
    @FindBy(xpath = "//*[@id=\"menuUserLogout\"]/span/span")
    WebElement singOut;

    public void enterUserName() {
        userName.sendKeys("testteamtechtest");
    }

    public void enterPassword() {
        password.sendKeys("Ryz3T3st!x");
    }

    public void clickOnSingIn(){
        signIn.click();
    }
    public void moveToRepository(){
        Actions a = new Actions(driver);
        a.moveToElement(repo).build().perform();
    }
    public void clickOnStudies(){
        studies.click();
    }
    public void clickOnTechStudy(){
        techStudy.click();

    }
    public void clickOnView(){
        view.click();
    }
    public void clickOnForms(){
        forms.click();
    }
    public void clickOnMedicalHistory(){
        medicalHistory.click();
    }
    public void clickOnEdit(){
        editForm.click();
    }
    public void addDescription(){
        description.clear();
        description.sendKeys("this is updated by chirag prajapati");
    }
    public void clickOnUpdate(){
        update.click();
    }
    public void moveToSingOffButton(){
        Actions a = new Actions(driver);
        a.moveToElement(testTeamTechTest).build().perform();
    }
    public void clickOnSingOut(){
        singOut.click();
    }


}
