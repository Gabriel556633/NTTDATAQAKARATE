package com.nttdataqa.serenity.task;

import com.nttdataqa.serenity.userInterface.PurchasePageInterface;
import com.nttdataqa.serenity.userInterface.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Task {

    private final String first_name;
    private final String last_name;
    private final String email;
    private final String phone;
    private final String company;
    private final String address;
    private final String city;
    private final String post_code;
    private final String country;
    private final String region;

    public PurchaseFormPage(String first_name, String last_name, String email, String phone, String company, String address, String city, String post_code, String country, String region) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.address = address;
        this.city = city;
        this.post_code = post_code;
        this.country = country;
        this.region = region;
    }

    public static Performable withData(String first_name, String last_name, String email, String phone, String company, String address, String city, String post_code, String country, String region){
        return instrumented(PurchaseFormPage.class,first_name,last_name,email,phone,company,address,city,post_code,country,region);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(PurchasePageInterface.INP_FIRST_NAME,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(first_name).into(PurchasePageInterface.INP_FIRST_NAME),

                WaitUntil.the(PurchasePageInterface.INP_LAST_NAME,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(last_name).into(PurchasePageInterface.INP_LAST_NAME),

                WaitUntil.the(PurchasePageInterface.INP_EMAIL,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(email).into(PurchasePageInterface.INP_EMAIL),

                WaitUntil.the(PurchasePageInterface.INP_PHONE,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(phone).into(PurchasePageInterface.INP_PHONE),

                WaitUntil.the(PurchasePageInterface.INP_COMPANY,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(company).into(PurchasePageInterface.INP_COMPANY),

                WaitUntil.the(PurchasePageInterface.INP_ADDRESS1,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(address).into(PurchasePageInterface.INP_ADDRESS1),

                WaitUntil.the(PurchasePageInterface.INP_CITY,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(city).into(PurchasePageInterface.INP_CITY),

                WaitUntil.the(PurchasePageInterface.INP_POST_CODE,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(post_code).into(PurchasePageInterface.INP_POST_CODE),

                WaitUntil.the(PurchasePageInterface.INP_COUNTRY,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.INP_COUNTRY),

                WaitUntil.the(PurchasePageInterface.INP_REGION,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.INP_REGION),

                WaitUntil.the(PurchasePageInterface.OP_REGION,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.OP_REGION),

                WaitUntil.the(PurchasePageInterface.BNT_CONTINUE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.BNT_CONTINUE),

                WaitUntil.the(PurchasePageInterface.BNT_CONTINUE2, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.BNT_CONTINUE2),

                WaitUntil.the(PurchasePageInterface.BNT_CONTINUE3, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.BNT_CONTINUE3),

                WaitUntil.the(PurchasePageInterface.BNT_CONTINUE4, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.BNT_CONTINUE4),

                WaitUntil.the(PurchasePageInterface.BNT_CONTINUE5, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PurchasePageInterface.BNT_CONTINUE5)




        );
    }
}