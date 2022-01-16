package es.academy.designpatterns.creational.factory;

public class PaymentFactory {

    public static Payment buildPayment(PaymentType type) {
        return switch (type) {
            case GOOGLE -> new GooglePayment();
            default -> new CardPayment();
        };
    }
}
