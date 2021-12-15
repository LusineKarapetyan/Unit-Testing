public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive = true;
    private String holderName;

    public BankAccount(double balance, double minimumBalance){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    /**
     * setting getters for Bank Account
     * variables
     */
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getMinimumBalance() {
        return minimumBalance;
    }
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * defining a method for withdrawing amount
     * by checking if the amount is more than minimum balance
     */
        public double withdraw(double amount) {
        if(balance - amount > minimumBalance){
            balance -= amount;
            return amount;
        } else {
            throw new RuntimeException();
        }
    }

    /**
     * defining a method to deposit amount
     * and return the balance
     */

    public double deposit(double amount) {
        return balance += amount;
    }
}
