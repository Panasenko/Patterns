package Strategy;

public class Payer {

    PayStrategy payStrategy;

    public Payer(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(int paymentAmount) {
        payStrategy.pay(paymentAmount);
    }

}
