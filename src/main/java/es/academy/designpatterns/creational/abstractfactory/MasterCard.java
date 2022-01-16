package es.academy.designpatterns.creational.abstractfactory;

public class MasterCard implements Card{
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "321";
    }
}
