// AbstractionVsInterfaceMain.java
// Demo class to compare Abstraction vs Interface

public class AbstractionVsInterfaceMain {
    public static void main(String[] args) {

        System.out.println("=== Abstraction using Abstract Class ===");
        Payment cardPayment = new CardPayment("Govardhan");
        cardPayment.pay(500.0);

        Payment upiPaymentAbstract = new UpiPaymentAbstract("Rahul");
        upiPaymentAbstract.pay(300.0);

        System.out.println();

        System.out.println("=== Abstraction using Interface ===");
        UpiPayment phonePe = new PhonePe("govardhan@ybl");
        phonePe.pay(750.0);

        UpiPayment gpay = new GooglePay("rahul@okhdfcbank");
        gpay.pay(1200.0);

        Rewardable rewardable = new PhonePe("rewards@ybl");
        int points = rewardable.getRewardPoints(750.0);
        System.out.println("Reward points earned: " + points);
    }
}
