package ThreadsAndMultithreading.BankATM;

public class Account {

    private int balance = 6000;

    public int getBalance(){
        return balance;
    }

    public  void withdraw(int ammount){

        balance=balance-ammount;
    }
}
