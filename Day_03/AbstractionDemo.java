// AbstractionDemo.java
// Example of abstraction using abstract class

abstract class Payment {
    private String customerName;

    public Payment(String customerName) {
        this.customerName = customerName;
    }

    // Abstract method - must be implemented by subclasses
    abstract void pay(double amount);

    // Concrete method - common behavior
    public void printReceipt(double amount) {
        System.out.println("Payment Receipt");
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("-----------------------------");
    }
}

class CardPayment extends Payment {

    public CardPayment(String customerName) {
        super(customerName);
    }

    @Override
    void pay(double amount) {
        System.out.println("Processing card payment of: " + amount);
        // Card payment specific logic here
        printReceipt(amount);
    }
}

class UpiPaymentAbstract extends Payment {

    public UpiPaymentAbstract(String customerName) {
        super(customerName);
    }

    @Override
    void pay(double amount) {
        System.out.println("Processing UPI payment of: " + amount);
        // UPI payment specific logic here
        printReceipt(amount);
    }
}
