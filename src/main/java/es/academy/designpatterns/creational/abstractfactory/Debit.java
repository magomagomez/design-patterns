package es.academy.designpatterns.creational.abstractfactory;

public class Debit implements PaymentMethod{

    @Override
    public String doPayment() {
        return "DEBIT";
    }
}
