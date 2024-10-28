public class Main {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();

        String cardNumber = "1234567890123456";
        String pin = "1234";
        double amount = 25.00;

        boolean paymentSuccess = paymentFacade.makePayment(cardNumber, pin, amount);

        if (paymentSuccess) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order failed.");
        }
    }
}