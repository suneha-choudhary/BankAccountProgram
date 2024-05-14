class Customer{ 
  private String Name;
  private int Age;
  
  public Customer(String Name, int Age){
    this.Name = Name;
    this.Age = Age;
  }

public String getName(){
  return Name;
}
public int getAge(){
  return Age;
}
}

class Account{
  private String Customer;
  private int AccountNumber;
  private double Balance;
  
  public Account(String Customer,int AccountNumber){
    this.Customer = Customer;
    this.AccountNumber = AccountNumber;
  }

public String getCustomer(){
  return Customer;
}

public int getAccountNumber(){
  return AccountNumber;
}
  
public double getBalance(){
  return Balance;
}

public void Balance(double amount){
  Balance = 12000;
  System.out.println("Your current balance is: " + Balance);
}


public void deposit(double amount){
    if (amount > 0){
    Balance += amount;
    System.out.println("Deposited Amount: " +" "+ amount +" "+ "New Balance: " +" "+ Balance);
    }
    else{
    System.out.println("The deposited amount should be in positive numbers.");
    }
}

public void Withdraw(int amount){
  if ( amount < Balance & amount > 0){
  Balance -= amount;
  System.out.println("Balance Withdrawal Amount: " +" "+ amount +" "+ "New Balance: " +" "+ Balance);
  }
  else{
  System.out.println("Money in your account is not enough for this payment.Check your balance and try again later.");
  }
}
}

public class bankAccount{
  public static void main(String[]args){
    Customer Neha = new Customer("Neha",26);
    int AccountNumber = 12345;
    Account account = new Account("Neha" ,AccountNumber);
    System.out.println("Welcome," + Neha.getName());
    account.Balance(12000);
    account.deposit(10000);
    account.Withdraw(1500);
    System.out.println("Current Balance = "+ account.getBalance());
  }
}










