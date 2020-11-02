package com.semanticbits.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    //Expertise is the first Tab and it has 4 module like Software Development, Cloud Services, Big Data, Mobility
    @FindBy(xpath = "//*([contains(text(),'Expertise')])[1]")
    protected WebElement ExpertiseTab;

         @FindBy (xpath = "(//*[contains(text(),'Software Development')])[1]")
         protected WebElement softwareDevModule;

         @FindBy (xpath = "(//*[contains(text(),'Cloud Services')])[1]")
         protected WebElement cloudServicesModule;

         @FindBy (xpath = "(//*[contains(text(),'Big Data')])[1]")
         protected WebElement bigDataModule;

         @FindBy (xpath = "(//*[contains(text(),'Mobility')])[1]")
         protected WebElement mobilityModule;

    //Domains is the second Tab and it has 5 module like Health IT ...
    @FindBy (xpath = "(//*[contains(text(),'Domains')])[1]")
    protected WebElement DomainsTab;




}
