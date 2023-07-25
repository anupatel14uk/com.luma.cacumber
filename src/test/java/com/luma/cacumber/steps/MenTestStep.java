package com.luma.cacumber.steps;

import com.luma.cacumber.pages.MenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MenTestStep {

    @Given("I am on Men shopping page")
    public void iAmOnMenShoppingPage() {
    }

    @When("I Mouse Hover To MenMenu")
    public void iMouseHoverToMenMenu() {
       new MenPage().mouseHoverToManMenu();

    }
    @And("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() {
       new MenPage().mouseHoverToManMenu();
    }

    @And("I Click on Pants")
    public void iClickOnPants() {
        new MenPage().clickOnPants();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on size thirty two.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSizeThirtyTwo() {
       new MenPage().mouseHoverOnCronusYogaPant();
       new  MenPage().mouseHoverOnCronusYogaPantAndClickOnSize32();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on colour Black.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
         new MenPage().mouseHoverOnCronusYogaPantAndClickOnColourBlack();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton()throws InterruptedException {
        new MenPage().mouseHoverOnCronusYogaPant();
        new MenPage().mouseHoverOnCronusYogaPantAndClickOnAddToCartButton();
        Thread.sleep(1000);
    }

    @And("I Verify the text {string}")
    public void iVerifyTheText(String vString) throws InterruptedException{
        Assert.assertEquals(new MenPage().getProductAddedCronusYogaPantToyourShoppingCartText(),vString, "able to verify message");
        Thread.sleep(1000);
    }

    @And("I Click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
       new MenPage().clickOnShoppingCartLinkIntoMessageText();
    }

    @And("I  Verify the text is {string}")
    public void iVerifyTheTextIs(String cartString) {
        Assert.assertEquals(new MenPage().getCartLinkMessageText(),cartString, "able to verify message");
    }

    @And("I  Verify the product name is {string}")
    public void iVerifyTheProductNameIs(String pName) {
        Assert.assertEquals(new MenPage().getProductNameCronusYogaPant(),pName, "able to verify message");
    }

    @And("I Verify the product size {string}")
    public void iVerifyTheProductSize(String size) {
        Assert.assertEquals(new MenPage().getProductSizeIs32(),size, "able to verify message");
    }

    @Then("I Verify the product colour {string}")
    public void iVerifyTheProductColour(String colour) {
        Assert.assertEquals(new MenPage().getProductYogaPantColorBlack(),colour, "able to verify message");
    }

}
