package es.academy.designpatterns.creational.factory;

public class CardPayment implements Payment{

    @Override
    public void doPayment() {
        System.out.println("Card");
    }
}
