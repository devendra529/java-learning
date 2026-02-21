public class BankAccount{
    //make a private to hide the data 
    private String AccountHoldername;
    private double  Balance;
    private int AccountNumber;
    // this is the constructor same name as class nam
    
    public BankAccount(String AccountHoldername , double Balance ,int AccountNumber){
        this.AccountHoldername=AccountHoldername;
        this.Balance=Balance;
        this.AccountNumber=AccountNumber;
    }
    //using geting method to show private instance variable
    
    public String getAccountHoldername(){
        return AccountHoldername;
    }
    public double getBalance(){
        return Balance;
    }
    public int getAccountNumber(){
        return AccountNumber;
    }
    public void Deposite(double Amount){
        if(Amount>0){
            Balance=+Amount;
            System.out.print("Amount is succesfully deposite");
        }
        else{
            System.out.print("Invalid deposite");
        }
    }
    public void Withdraw(double Amount){
        if(Amount>0 && Amount<=Balance){
            Balance=Balance-Amount;
            System.out.print("Amount is withdraw succesfully");
        }
        else{
            System.out.print("Amount is more than balance:");
        }
    }
}