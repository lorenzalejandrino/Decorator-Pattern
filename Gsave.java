public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;


    public GSave(SavingsAccount savingsAccount){
        this.bankAccount = savingsAccount;
    }
    public void setBankAccount(BankAccount bankAccount){
        this.bankAccount= bankAccount;
    }
    @Override
    public String showAccountType(){
        return "GSave";
    }
    @Override
    public Double getInterestRate(){
        return 0.025;
    }
    @Override
    public Double getBalance(){
        return bankAccount.getBalance();
    }
    @Override
    public String showBenefits(){
        return "Standard Savings Account, GCash Transfer";
    }
    @Override
    public Double computeBalanceWithInterest(){
        return bankAccount.getBalance() * 1.025;
    }
    @Override
    public String showInfo(){
        return bankAccount.showInfo();
    }
}
