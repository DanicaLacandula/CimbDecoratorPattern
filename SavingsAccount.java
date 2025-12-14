public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private Double balance;        // Must be Double to match interface
    
    @Override
    public String showAccountType() {
        return "Savings Account";
    }
    
    @Override
    public Double getInterestRate() {      // Must be Double
        return 0.01;
    }
    
    @Override
    public Double getBalance() {           // Must be Double
        return balance;
    }
    
    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }
    
    @Override
    public Double computeBalanceWithInterest() {  // Must be Double
        return balance + (balance * getInterestRate());
    }
    
    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\nAccount name: " + accountName + "\nBalance: " + balance;
    }
    
    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public void setBalance(Double balance) {      // Must be Double
        this.balance = balance;
    }
}