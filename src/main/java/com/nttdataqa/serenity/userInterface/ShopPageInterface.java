package com.nttdataqa.serenity.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPageInterface {

    public static final Target BNT_1 = Target.the("Button Continue1").located(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.caption > h4 > a"));

    public static final Target BNT_2 = Target.the("Button Continue2").located(By.id("button-cart"));

    public static final Target BNT_3 = Target.the("Button Continue3").located(By.cssSelector("#logo > h1 > a"));

    public static final Target BNT_4 = Target.the("Button Continue4").located(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.caption > h4 > a"));

    public static final Target BNT_5 = Target.the("Button Continue5").located(By.cssSelector("#cart > button"));
    public static final Target BNT_6 = Target.the("Button Continue6").located(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(1) > strong"));

    public static final Target BNT_7 = Target.the("Button Continue7").located(By.cssSelector("#content > div.buttons.clearfix > div.pull-right > a"));
    public static final Target BNT_8 = Target.the("Button Continue8").located(By.id("xxxxxxx"));


}

