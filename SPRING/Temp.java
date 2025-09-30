/*
 * Payment Gateway Example
 * Define an interface PaymentProcessor with processPayment(double amount).
 * 
 * Implement two processors: CreditCardProcessor and UPIProcessor.
 * 
 * Inject the processor into an OrderService class.
 * 
 * Demonstrate IoC by switching processors without modifying OrderService.
 * 
 * 
 */

interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class UPIProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

class OrderService {
    private PaymentProcessor paymentProcessor;

    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(double amount) {
        System.out.println("Placing order of $" + amount);
        paymentProcessor.processPayment(amount);
    }
}

public class Temp {
    public static void main(String[] args) {

        OrderService orderService1 = new OrderService(new CreditCardProcessor());
        orderService1.placeOrder(100.0);

        OrderService orderService2 = new OrderService(new UPIProcessor());
        orderService2.placeOrder(200.0);
    }
}