package Strategy.Strategy;

import Strategy.PayStrategy;

public class Visa implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Выбрана оплата Visa на сумму " + paymentAmount);
    }

}
