import java .util.Scanner;
class ATM
  {
    int balance;
    //withdraw
    void withdraw(int amt)
    {
      if(balance>amt)
      {
        balance=balance-amt;
        System.out.println("Withdraw Succesfully");
      }
    }
     //deposit
    void deposit(int amt)
    {
      balance=balance+amt;
      System.out.println("deposited succesfully");
    }
    //checkbalance
    void checkBalance()
    {
     System.out.println(balance); 
    }
    }
class Atm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ATM atm=new ATM();
      atm.balance=10000;
      char ch='y';
      do
      {
        System.out.println("1.withdraw \n 2.Deposit \n 3.checkBalance \n");
        System.out.println("Select option");
        int option=sc.nextInt();
        switch(option)
          {
            case 1:
              System.out.println("Enter amount");
              int amount =sc.nextInt();
              atm.withdraw(amount);
              break;
              case 2:
              System.out.println("Enter amount");
              int amount1 =sc.nextInt();
              atm.deposit(amount1);
              break;
              case 3:
              atm.checkBalance();
              break;
              default :
              System.out.println("Invalid option");
          }
        System.out.println("Do you want to continue");
        ch=sc.next().charAt(0);
      }
        while(ch=='y');
    }
  }
  
  

  