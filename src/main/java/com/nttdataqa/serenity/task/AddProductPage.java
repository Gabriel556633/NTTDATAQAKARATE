package com.nttdataqa.serenity.task;

import com.nttdataqa.serenity.userInterface.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductPage implements Task {
    public static Task addProductsToCart(){return instrumented(AddProductPage.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShopPageInterface.BNT_1, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_1),
                WaitUntil.the(ShopPageInterface.BNT_2, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_2),
                WaitUntil.the(ShopPageInterface.BNT_3, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_3),
                WaitUntil.the(ShopPageInterface.BNT_4, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_4),
                WaitUntil.the(ShopPageInterface.BNT_2, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_2),
                WaitUntil.the(ShopPageInterface.BNT_3, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_3),
                WaitUntil.the(ShopPageInterface.BNT_5, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_5),
                WaitUntil.the(ShopPageInterface.BNT_6, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_6),
                WaitUntil.the(ShopPageInterface.BNT_7, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_7),
                WaitUntil.the(ShopPageInterface.BNT_8, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.BNT_8)

        );
    }
}
