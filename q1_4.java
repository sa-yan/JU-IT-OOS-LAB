class BankAccount{
    int accountNumber;
    float balance;
    String ownerName;
    
    public BankAccount(int accNum, float balance, String name){
    accountNumber = accNum;
    this.balance = balance;
    ownerName = name;
    }
    
    void add(float amount){
    balance += amount;
    }
    
    void subtract(float amount){
    balance -= amount;
    }
    
    //SHOWING DETAILS OF A PARTICULAR ACCOUNT
    
    void details(){
    System.out.print("Account Number: "+accountNumber);
    System.out.print("\t\tAccount Holder: "+ownerName);
    System.out.print("\t\tCurrent Balance: "+balance);
    System.out.println();
    }
    
    }
    
    class AccountManager{
    int maxLimit, index;
    BankAccount bankAccounts[];
    AccountManager(int maxLimit){
    index =0;
    this.maxLimit = maxLimit;
    bankAccounts = new BankAccount[maxLimit];
    }
    
    //CREATE NEW ACCOUNT
    void create(BankAccount account){
    if(index < maxLimit){
    bankAccounts[index]=account;
    index++;
    System.out.println(index);
    }
    }
    
    //DELETE AN EXISTING ACCOUNT
    void delete(int accountNum){
    int i=0;
    while(i<index){
    if(bankAccounts[i].accountNumber == accountNum){break;}else{System.out.println("ACCOUNT NOT PRESENT!!!");}
    i++;
    }
    
    while(i<index){
    bankAccounts[i]=bankAccounts[i+1];
    }
    
    bankAccounts[i].accountNumber =0;
    bankAccounts[i].balance = 0;
    bankAccounts[i].ownerName ="";
    index--;
    }
    
    
    //DEPOSIT MONEY
    
    void deposit(int accNum, float amount){
    int i;
    for(i=0;i<index;i++){
    if(bankAccounts[i].accountNumber == accNum){
    bankAccounts[i].add(amount);
    }
    }
    }
    
    //WITHDRAW OF MONEY
    
    void withdraw(int accNum, float amount){
    int i;
    for(i=0;i<index;i++){
    if(bankAccounts[i].accountNumber == accNum){
    bankAccounts[i].subtract(amount);
    }
    }
    }
    
    //ALL ACCOUNT DETAILS
    void showDetails(){
    int i;
    for( i=0;i<index;i++){
       bankAccounts[i].details();
    }
    }
    }
    
     
    
    class Bank{
    public static void main(String args[]){
    
    AccountManager manager = new AccountManager(10);
    
    BankAccount account1 = new BankAccount(1128, 3500, "Sayan");
    BankAccount account2 = new BankAccount(1127, 9500, "Adil");
    BankAccount account3 = new BankAccount(1126, 10500, "Anindya");
    BankAccount account4 = new BankAccount(1122, 8500, "Suman");
    
    //ADDING 4 ACCOUNTS
    manager.create(account1);
    manager.create(account2);
    manager.create(account3);
    manager.create(account4);
    
    //DELETING ONE ACCOUNT
    manager.delete(1122);
    
    manager.showDetails();
    
    }
    
    }
