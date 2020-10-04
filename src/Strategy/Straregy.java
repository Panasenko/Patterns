package Strategy;

public class Straregy {

    public static void main(String[] args) {
        new Payer(new MasterCard()).pay(10);
        new Payer(new Visa()).pay(10);
    }

}

interface PayStrategy {

    void pay(int paymentAmount);
}

class PayPal implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Выбрана оплата PayPal на сумму " + paymentAmount);
    }

}

class Visa implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Выбрана оплата Visa на сумму " + paymentAmount);
    }

}

class MasterCard implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Выбрана оплата MasterCard на сумму " + paymentAmount);
    }

}

class Payer {

    PayStrategy payStrategy;

    public Payer(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(int paymentAmount) {
        payStrategy.pay(paymentAmount);
    }

}


