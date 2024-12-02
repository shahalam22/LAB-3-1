public class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private double lateFee;
    private String openingHours;
    private int borrowingLimit;

    private LibraryConfigManager() {
        // Default values
        lateFee = 0.50;
        openingHours = "9:00 AM - 5:00 PM";
        borrowingLimit = 5;
    }

    public static LibraryConfigManager getInstance() {
        if (instance == null) {
            synchronized (LibraryConfigManager.class) {
                if (instance == null) {
                    instance = new LibraryConfigManager();
                }
            }
        }
        return instance;
    }

    // Getters and setters
    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }
}
