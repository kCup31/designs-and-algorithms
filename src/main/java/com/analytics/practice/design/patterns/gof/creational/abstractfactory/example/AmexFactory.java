package com.analytics.practice.design.patterns.gof.creational.abstractfactory.example;

import javax.xml.validation.Validator;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
