// InterfaceDemo.java
// Example of abstraction using interface

interface UpiPayment {
    void pay(double amount);
    String getUpiId();
}

interface Rewardable {
    int getRewardPoints(double amount);
}

class PhonePe implements UpiPayment, Rewardable {

    private String upiId;

    public PhonePe(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("PhonePe payment of: " + amount + " using UPI ID: " + upiId);
    }

    @Override
    public String getUpiId() {
        return upiId;
    }

    @Override
    public int getRewardPoints(double amount) {
        // Simple logic: 1 point per 100 units
        return (int) (amount / 100);
    }
}

class GooglePay implements UpiPayment {

    private String upiId;

    public GooglePay(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Google Pay payment of: " + amount + " using UPI ID: " + upiId);
    }

    @Override
    public String getUpiId() {
        return upiId;
    }
}
