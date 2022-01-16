package es.academy.designpatterns;

import es.academy.designpatterns.creational.abstractfactory.AbstractFactory;
import es.academy.designpatterns.creational.abstractfactory.Card;
import es.academy.designpatterns.creational.abstractfactory.FactoryProvider;
import es.academy.designpatterns.creational.abstractfactory.PaymentMethod;
import es.academy.designpatterns.creational.factory.Payment;
import es.academy.designpatterns.creational.factory.PaymentFactory;
import es.academy.designpatterns.creational.factory.PaymentType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        //factoryTest();
        abstractFactoryTest();
    }

    private static void factoryTest(){
        Payment payment = PaymentFactory.buildPayment(PaymentType.CARD);
        payment.doPayment();
    }

    private static void abstractFactoryTest(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card card = (Card) abstractFactory.create("VISA");
        AbstractFactory abstractFactory2 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymenMethod = (PaymentMethod) abstractFactory2.create("DEBIT") ;
        System.out.println("Card Type " + card.getCardType() + " & payment method " + paymenMethod.doPayment());
    }

}
