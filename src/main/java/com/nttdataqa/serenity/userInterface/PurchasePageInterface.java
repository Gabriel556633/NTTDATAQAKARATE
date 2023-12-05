package com.nttdataqa.serenity.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePageInterface {

    public static final Target INP_FIRST_NAME = Target.the("Input Name").located(By.id("input-payment-firstname"));
    public static final Target INP_LAST_NAME = Target.the("Input Last Name").located(By.id("//*[@id='input-payment-lastname']"));
    public static final Target INP_EMAIL = Target.the("Input Email").located(By.id("//*[@id='input-payment-email']"));
    public static final Target INP_PHONE = Target.the("Input Phone").located(By.id("//*[@id='input-payment-telephone']"));
    public static final Target INP_COMPANY = Target.the("Input Company").located(By.id("//*[@id='input-payment-company']"));
    public static final Target INP_ADDRESS1 = Target.the("Input Address1").located(By.id("//*[@id='input-payment-address-1']"));
    public static final Target INP_CITY = Target.the("Input City").located(By.id("//*[@id='input-payment-city']"));
    public static final Target INP_POST_CODE = Target.the("Input Post Code").located(By.id("//*[@id='input-payment-postcode']"));
    public static final Target INP_COUNTRY = Target.the("Input Country").located(By.id("//*[@id='input-payment-country']"));
    public static final Target INP_ZONE = Target.the("Input Zone").located(By.id("//*[@id='input-payment-zone']"));
    public static final Target INP_REGION = Target.the("Input Region").located(By.id("//*[@id='input-payment-zone']/option[6]"));
    public static final Target OP_REGION = Target.the("Input Region").located(By.id("//*[@id='input-payment-zone']/option[6]"));
    public static final Target BNT_CONTINUE = Target.the("Button Continue1").located(By.id("//*[@id='button-guest']"));
    public static final Target BNT_CONTINUE2 = Target.the("Button Continue2").located(By.id("//*[@id='button-shipping-method']"));
    public static final Target BNT_CONTINUE3 = Target.the("Button Continue3").located(By.id("//*[@id='collapse-payment-method']/div/div/[3]/div/input[1]"));
    public static final Target BNT_CONTINUE4 = Target.the("Button Continue4").located(By.id("//*[@id='button-payment-method']"));
    public static final Target BNT_CONTINUE5 = Target.the("Button Continue4").located(By.id("//*[@id='button-confirm']"));

}
