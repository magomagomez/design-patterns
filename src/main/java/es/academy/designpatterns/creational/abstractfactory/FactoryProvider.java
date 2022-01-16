package es.academy.designpatterns.creational.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factory){
        if("Card".equals(factory)){
            return new CardFactory();
        } else if ("PaymentMethod".equals(factory)){
            return new PaymentMethodFactory();
        }
        return null;
    }
}
