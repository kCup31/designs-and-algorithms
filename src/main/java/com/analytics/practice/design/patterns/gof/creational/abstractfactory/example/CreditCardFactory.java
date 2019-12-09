package com.analytics.practice.design.patterns.gof.creational.abstractfactory.example;

import javax.xml.validation.Validator;

// AbstractFactory
public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if(creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
