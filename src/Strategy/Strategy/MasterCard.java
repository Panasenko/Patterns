package Strategy.Strategy;

import Strategy.PayStrategy;

public class MasterCard implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Выбрана оплата MasterCard на сумму " + paymentAmount);
    }

}
