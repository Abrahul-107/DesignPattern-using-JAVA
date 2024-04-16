public class Inheritance 
{
    public static void main(String[] args) 
    {
        SavingAccount acc = new SavingAccount();
        acc.depositAmount(550);
        acc.withdrawAmount(200); // Withdraw an amount less than the balance
        acc.withdrawAmount(500); // Withdraw an amount greater than the balance
    }
}

class BankAccount 
{
    int cash = 0;
    int deposit = 0;
    int withdraw = 0;

    public void depositAmount(int cash) 
    {
        this.deposit += cash;
        this.cash += deposit;
        System.out.println("Your total bank balance is " + this.cash);
    }

    public void withdrawAmount(int cash) 
    {
        if (cash >= this.cash) 
        {
            this.withdraw += cash;
            this.cash -= cash;
            System.out.println("Your total bank balance is " + this.withdraw + " And total balance is  "+this.cash);
        } 
        else 
        {
            System.out.println("Insufficient balance for withdrawal "+ cash);
        }
    }
}

class SavingAccount extends BankAccount 
{
    @Override
    public void withdrawAmount(int withdrawamount) 
    {
        System.out.println(this.cash);
        if (this.cash <= 500) 
        {
            System.out.println("Insufficient balance for withdrawal  "+withdrawamount);
            System.out.println("Your total bank balance is " + this.cash );
        }
        else
        {
            this.cash -= withdrawamount;
            System.out.println("cash withdraw successfull "+ withdrawamount);

        }
        
    }
}
