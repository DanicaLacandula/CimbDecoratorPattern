// BankAccount.java
public interface BankAccount {
    String showAccountType();
    Double getInterestRate();      // Change: Double instead of double
    Double getBalance();           // Change: Double instead of double
    String showBenefits();
    Double computeBalanceWithInterest();  // Change: Double instead of double
    String showInfo();
}