package com.nttdataqa.serenity.glue;

import com.nttdataqa.serenity.task.AddProductPage;
import com.nttdataqa.serenity.task.OpenPage;
import com.nttdataqa.serenity.task.PurchaseFormPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginGlue {

    public static final String ACTOR_NAME = "USer";

    @Before
    public void setTheStag(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingreso a la pagina OpenCart$")
    public void login(String actor){theActorCalled(actor).attemptsTo(OpenPage.loadPage());}

    @When("selecciono un producto$")
    public void seleccionProducto(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                AddProductPage.addProductsToCart());
        }

    @Then("agrego producto al carrito$")
    public void addproduct(){}

    @And("voy al carrito$")
    public void viewcart(){}

    @When("ingreso datos  (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void form(String first_name ,String last_name,String email,String phone,String company,String address,String city,String post_code,String country,String region)
    {
        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.withData(first_name,last_name,email,phone,company,address,city,post_code,country,region));
    }

    @Then("voy a nuevo formulario")
    public void next(){}
}