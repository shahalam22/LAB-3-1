class PaymentFacade {
    private AccountVerification accountVerification;
    private SecurityCheck securityCheck;
    private BalanceCheck balanceCheck;
    private LedgerUpdate ledgerUpdate;
    private NotificationService notificationService;

    public PaymentFacade() {
        accountVerification = new AccountVerification();
        securityCheck = new SecurityCheck();
        balanceCheck = new BalanceCheck();
        ledgerUpdate = new LedgerUpdate();
        notificationService = new NotificationService();
    }

    public boolean makePayment(String cardNumber, String pin, double amount) {
        System.out.println("\nStarting payment process...");

        if (!accountVerification.verifyAccount(cardNumber)) {
            System.out.println("Account verification failed.");
            return false;
        }

        if (!securityCheck.checkSecurityPin(pin)) {
            System.out.println("Security PIN check failed.");
            return false;
        }

        if (!balanceCheck.checkSufficientBalance(amount)) {
            System.out.println("Insufficient balance.");
            return false;
        }

        // Deduct balance, update ledger, and send notification
        balanceCheck.deductBalance(amount);
        ledgerUpdate.makeEntry(cardNumber, amount);
        notificationService.sendNotification("Payment of $" + amount + " completed successfully.");

        System.out.println("Payment process completed successfully.");
        return true;
    }
}

// Account Verification
class AccountVerification {
    public boolean verifyAccount(String cardNumber) {
        System.out.println("Verifying account for card...");
        // Simulate account verification
        return cardNumber.length() == 16; // Simplified account number check
    }
}

// Security Check
class SecurityCheck {
    public boolean checkSecurityPin(String pin) {
        System.out.println("Checking security PIN...");
        // Simulate PIN check
        return pin.length() == 4; // Simplified PIN check
    }
}

// Balance Check
class BalanceCheck {
    private double balance = 100.00; // Simulated balance for demo purposes

    public boolean checkSufficientBalance(double amount) {
        System.out.println("Checking if sufficient balance is available...");
        return amount <= balance;
    }

    public void deductBalance(double amount) {
        System.out.println("Deducting balance...");
        balance -= amount;
    }
}

// Ledger Update
class LedgerUpdate {
    public void makeEntry(String cardNumber, double amount) {
        System.out.println("Making ledger entry for card: " + cardNumber + " for Amount: $" + amount);
    }
}

// Notification
class NotificationService {
    public void sendNotification(String message) {
        System.out.println("Notification: " + message);
    }
}