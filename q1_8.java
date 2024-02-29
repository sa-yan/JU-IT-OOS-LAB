/*
 * Write a class for “Account” containing data members ‘accountNumber’, ‘holderName’,
‘balance’ and add constructors and necessary accessor/modifier functions for these data
members. Now create two class “SavingsAccount” and “CurrentAccount” extending from this
class. SavingsAccount will have a member variable ‘interestRate’ and member function
‘calculateYearlyInterest’. Write another class “Manager” that contains a list Account. Also write
a main() function to create an instance of Manager class. Add two SavingsAccount and three
CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print the details of all
accounts.
 */

 class Account{
    int accountNumber;
    String holderName;
    double balance;

    Account(){
        accountNumber = 0;
        holderName="";
        balance=0.0;
    }

    Account(int  accNo,String name,double bal){
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    void print(){

    }
    double calculateYearlyInterest()
    {
        return 0;
    }

 }

 class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(int accNo,String name,double bal,double rate){
        super(accNo,name,bal);
        interestRate = rate;
    }
    double calculateYearlyInterest()
    {
        return (balance*interestRate);
    }
    void print()
    {
        System.out.println("Account Holder : "+ holderName);
        System.out.println("Account No. : "+ accountNumber);
        System.out.println("Balance left : " + balance);
    }
 }

 class CurrentAccount extends Account{
    CurrentAccount(int  accNo,String name,double bal){
        super(accNo,name,bal);
    }

    void print()
    {
        System.out.println("Account Holder : " + holderName);
        System.out.println("Account No. : "+ accountNumber);
        System.out.println("Balance left : " + balance);
    }
 }


 class Manager{
    static Account acc[] = new Account[5];

    Manager(){
        acc[0]=new SavingsAccount(1128, "Sayan", 1128, 1.5);

        acc[1]=new SavingsAccount(1126, "Anindya", 22000 , 0.6);

        acc[2] = new CurrentAccount(1127, "Adil", 3000);
        acc[3] = new CurrentAccount(1136, "Asim", 4000);
        acc[4] = new CurrentAccount(1134, "Siddhant", 5000);
    }

    public static void main(String[] args) {

        Manager ob = new Manager();
        for(int i = 0; i<2;i++)
            System.out.println("The yearly interest of the savings account no "+ (i+1) + " is "+ acc[i].calculateYearlyInterest());


        System.out.println("");

        for(int i = 0; i<acc.length; i++){
            acc[i].print();
            System.out.println("");
        }
    }
 }