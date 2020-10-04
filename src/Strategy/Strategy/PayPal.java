package Strategy.Strategy;

import Strategy.PayStrategy;

public class PayPal implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Выбрана оплата PayPal на сумму " + paymentAmount);
    }

}