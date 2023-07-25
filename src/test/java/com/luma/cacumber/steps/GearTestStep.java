package com.luma.cacumber.steps;

import com.luma.cacumber.pages.GearPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearTestStep {


    @Given("I am on shopping page")
    public void iAmOmShoppingPage() {
    }


    @When("I Mouse Hover on Gear Menu")
    public void iMouseHoverOnGearMenu() {
       new GearPage().mouseHoverToGearMenu();
    }

    @And("I click on Bags")
    public void iClickOnClickOnBags() {
        new GearPage().clickOnBags();
    }

    @And("I Click on Product Name Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProductOvernightDuffle();
    }

    @And("I  Verify the text {string}")
    public void iVerifyTheText(String dText) {
        Assert.assertEquals(new GearPage().getProductOvernightDuffleText(),dText, "able to verify message");
    }

    @And("I Change Qty {string}")
    public void iChangeQty(String qty) {
       new GearPage().sendProductOvernightDuffleQuantity(qty);
    }

    @And("I Click on Button Add to Cart")
    public void iClickOnButtonAddToCart() throws InterruptedException {
       new GearPage().productOvernightDuffleAddToCartButtonClick();
        Thread.sleep(1000);
    }

    @And("IVerify the text {string}")
    public void iverifyTheText(String verifyText) {
        Assert.assertEquals(new GearPage().getProductOvernightDuffleSuccessMessage(),verifyText, "able to verify message");

    }

    @And("IClick on ‘shopping cart’ Link into message")
    public void iclickOnShoppingCartLinkIntoMessage() {
        new GearPage().clickOnShoppingCartLink();
    }

    @And("I  Verify the product name {string}")
    public void iVerifyTheProductName(String verifyProductafter) {
        Assert.assertEquals(new GearPage().getOvernightDuffleText(),verifyProductafter, "able to verify message");

    }

    @And("I  Verify the Qty is {string}")
    public void iVerifyTheQtyIs(String verifyQty3) {
        Assert.assertEquals(new GearPage().getOvernightDuffleQuantity(),verifyQty3, "able to verify message");
    }


    @And("I Verify the product price {string}")
    public void iVerifyTheProductPrice(String productPrice) {
        Assert.assertEquals(new GearPage().getOvernightDufflePriceText(),productPrice, "able to verify message");
    }

    @And("I Change duffle Qty to {string}")
    public void iChangeDuffleQtyTo(String duffleQuantity) throws InterruptedException{
        Thread.sleep(1000);
        new GearPage().sendProductOvernightDuffleQuantityAgain(duffleQuantity);
    }



    @And("I Click on ‘Update Shopping Cart’ button")
    public void iClickOnUpdateShoppingCartButton() {
        new GearPage().clickOnShoppingCartButton();
    }


    @Then("I Verify the product price is {string}")
    public void iVerifyTheProductPriceIs(String fPrice) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new GearPage().getFinalProductPrice(),fPrice, "able to verify message");

    }

}

