

import java.util.Scanner;
class Utils{
    public static void delay(int milliseconds) {
        try{
            Thread.sleep(milliseconds);

        }
        catch(InterruptedException e){
            System.out.println("Error in processing. Please Try again.");
            Thread.currentThread().interrupt();
        }
    }
}

class AtmMachine {
    private int user_pin = 6984;
private int accountBalance = 500000;

    public AtmMachine() {
        
    }
public boolean checkCorrectPin(int pin){
    if(pin==user_pin){
        Utils.delay(1000);
        System.out.println("Pin match successful! ");
        return true;
    }
   
    
return false;
}
    public void withdraw(int w_amt) {
        if (w_amt <= accountBalance) {
            accountBalance -= w_amt;
            System.out.println("Processing withdrawal..");
            Utils.delay(1000);
            System.out.println("Withdrawal successful! Amount withdrawn: " + w_amt);
            Utils.delay(500);
            System.out.println("Bank balance : "+accountBalance);
        } else {
            System.out.println("Uh-oh, Withdrawal amount exceeds account balance");
        }
    }

    public void deposit(int d_amt) {
        if (d_amt > 0) {
           accountBalance =  accountBalance + d_amt;
          System.out.println("Processing deposit..");
          Utils.delay(1000);
            System.out.println("Deposit successful! Amount deposited: " + d_amt);
            Utils.delay(500);
            System.out.println("Bank balance : "+accountBalance);
        
        } else {
            System.out.println("Please deposit a valid amount");
        }
    }

    public void balance() {
       System.out.println("Checking balance..");
       Utils.delay(500);
          System.out.println("Your account balance is: " + accountBalance);
    }
}
public class AtmCodSoft {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtmMachine am = new AtmMachine();
        
        while(true){
            System.out.println("Welcome to our ATM");
            Utils.delay(500);
            System.out.println("Please input the number corresponding to your required action: \n1 - Cash Withdrawal\n2 - Cash Deposit\n3 - Check Account Balance\n4-Quit");
            int in = sc.nextInt();
            if(in==4){
                System.out.println("Thank you for using our ATM!");
                break;
            }
            System.out.println("Enter your pin: ");
            int pin = sc.nextInt();
       boolean res = am.checkCorrectPin(pin);
if(res){
    switch (in) {
        case 1:
            System.out.println("Enter the amount to withdraw:");
            int w_amt = sc.nextInt();
            am.withdraw(w_amt);
            break;
        case 2:
            System.out.println("Enter the amount to deposit:");
            int d_amt = sc.nextInt();
            am.deposit(d_amt);
            break;
        case 3:
            am.balance();
            break;
        default:
            System.out.println("Enter a valid choice");
            break;
    }
}
else{
    System.out.println("Invalid pin, TRY AGAIN");
}          
        }
        sc.close();
    }
}
