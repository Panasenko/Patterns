package Strategy;

import Strategy.Strategy.MasterCard;
import Strategy.Strategy.Visa;

public class Main {

    public static void main(String[] args) {
        new Payer(new MasterCard()).pay(10);
        new Payer(new Visa()).pay(10);
    }

}
