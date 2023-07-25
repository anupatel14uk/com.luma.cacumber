package com.luma.cacumber.steps;

import com.luma.cacumber.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class womenStep {

    @Given("I am on women shopping page")
    public void iAmOnWomenShoppingPage() {
    }

    @When("I mouse Hover on Women Menu")
    public void iMouseHoverOnWomenMenu() {
        new WomenPage().mouseHoverToWomenMenu();
    }

    @And("I mouse Hover on Tops")
    public void iMouseHoverOnTops() throws InterruptedException {
        Thread.sleep(1000);
        new WomenPage().mouseHoverWomenTopMenu();
    }

    @And("I click on Jackets")
    public void iClickOnJackets() {
       new WomenPage().mouseHoverWomenTopMenuClickOnJackets();

    }

    @Then("I storing jackets names in list,filter Product Name, Ascending Order,display in alphabetical order")
    public void iStoringJacketsNamesInListFilterProductNameAscendingOrderDisplayInAlphabeticalOrder()throws InterruptedException {
        List<String> jacketsNameListBefore = new WomenPage().getJacketsNames();
        System.out.println("size ---" + jacketsNameListBefore.size());
        // Select Sort By filter “Product Name”
        new WomenPage().filterByProductName();
        Thread.sleep(1000);
        // After Sorting value
        List<String> jacketsNameListAfter = new WomenPage().getJacketsNamesAfterSorting();
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);

    }


    @Then("I storing jackets price in list,Sort By filter Price,list after,before to Ascending Order,price display in Low to High")
    public void iStoringJacketsPriceInListSortByFilterPriceListAfterBeforeToAscendingOrderPriceDisplayInLowToHigh()throws InterruptedException {
        List<Double> jacketsPriceListBefore= new WomenPage().getJacketsPriceListBefore();
        // Select Sort By filter “Price”
        new WomenPage().getFilterByProductPrice();
        // After Sorting Products by Price
        Thread.sleep(1000);
        // Storing jackets price in list after
        List<Double> jacketsPriceListAfter= new WomenPage().getJacketsPriceListAfter();
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }
}
