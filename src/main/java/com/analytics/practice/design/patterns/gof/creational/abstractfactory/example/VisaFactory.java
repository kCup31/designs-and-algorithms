package com.analytics.practice.design.patterns.gof.creational.abstractfactory.example;

import javax.xml.validation.Validator;

public class VisaFactory extends CreditCardFactory {

    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();

            case PLATINUM:
                return new VisaBlackCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
