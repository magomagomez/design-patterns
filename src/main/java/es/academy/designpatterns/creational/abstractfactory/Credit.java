package es.academy.designpatterns.creational.abstractfactory;

public class Credit implements PaymentMethod{

    @Override
    public String doPayment() {
        return "CREDIT";
    }
}
