package com.bionic.web;

import org.springframework.context.annotation.Scope;

import javax.inject.Named;

/**
 * Created by oper4 on 31.10.2014.
 */
@Named("msgs")
@Scope("session")
public class MessageBean {
    private final String nameRequired =
            "Merchant name field could not be empty";
    private final String bankNameRequired =
            "Bank name field could not be empty";
    private final String chargeRange =
            "Charge percent field is not between the expected values of 0.1 and 15";

    public MessageBean() {
    }

    public String getNameRequired() {
        return nameRequired;
    }

    public String getBankNameRequired() {
        return bankNameRequired;
    }

    public String getChargeRange() {
        return chargeRange;
    }
}
