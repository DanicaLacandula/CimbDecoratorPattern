public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;
    
    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    @Override
    public String showAccountType() {
        return "UpSave";
    }
    
    @Override
    public Double getInterestRate() {          // Must be Double
        return 0.04;
    }
    
    @Override
    public Double getBalance() {               // Must be Double
        return bankAccount.getBalance();
    }
    
    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }
    
    @Override
    public Double computeBalanceWithInterest() {  // Must be Double
        return getBalance() + (getBalance() * getInterestRate());
    }
    
    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}