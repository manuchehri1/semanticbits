package com.semanticbits.step_definitions;

import com.semanticbits.pages.HomePage;
import com.semanticbits.pages.expertise.ExpertisePage;
import com.semanticbits.utilities.ConfigurationReader;
import com.semanticbits.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class HomepageStepDefinition {
    HomePage homePage = new HomePage();
    ExpertisePage expertisePage = new ExpertisePage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("user navigate to the {string} page")
    public void user_navigate_to_the_page(String tabName) {
        homePage.moveToByName(tabName);
    }

    @Then("user should verify that title is a {string}")
    public void user_should_verify_that_title_is_a(String expectedPageTile) {
        String actualPageTile = Driver.getDriver().getTitle();
        assertEquals(expectedPageTile,actualPageTile);
    }

    @When("user hover over {string} tab and click {string} module")
    public void user_hover_over_tab_and_click_module(String tabName, String moduleName) {
       homePage.moveToByName(tabName,moduleName);
    }


}
