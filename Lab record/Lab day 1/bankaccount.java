/*A bank maintains two kinds of accounts - Savings Account and Current Account. The savings account provides compound interest, deposit and withdrawal facilities. The current account only provides deposit and withdrawal facilities. Current account holders should also maintain a minimum balance. If balance falls below this level, a service charge is imposed. Create a class Account that stores customer name, account number and type of account. From this derive the classes Curr-acet and Sav-acet. Include the necessary methods in order to achieve the following tasks.
a. Accept deposit from a customer and update the balance
b. Display the balance.
e. Compute interest and add to balance.
d. Permit withdrawal and update the balance (Check for the minimum balance, impose penalty if necessary).*/

import java.io.DataInputStream;

class account{
    static String name;
    static int accno;
    static String acctype;
    static double balance=0;
    public void read(String name,int accno,String acctype){
            this.name=name;
            this.accno=accno;
            this.acctype=acctype;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited successfully.. Blanance amount is "+balance);
    }
    public void balancedisplay(){
        System.out.println("----------Account Details--------------");
        System.out.println("Name: "+name);
        System.out.println("Account Number :"+accno);
        System.out.println("Account type:"+acctype);
        System.out.println("Balance amound :"+balance);
        System.out.println("----------Account Details--------------");
    }
        
}

class curracc extends account{
    double minbalance=1000.0;
    double servicecharge=50.0;
    public void withdraw(double amount){
        if (amount >0 || amount <=balance) {
            balance-=amount;
            if (balance< minbalance) {
                balance-=servicecharge;
                System.out.println("Balance less than minimum charge .. service charge of "+servicecharge+" deducted form Account.. Balance is $"+balance);

            }
            System.out.println("Withdraw successfully.. Balance amount is "+balance);
        }
        else{
            System.out.println("Insufficent balance...");
        }
        
    }
    
}


class saveacc extends account{
    double intrestrate=0.5,intrest;

    public void callc(){
        intrest=balance*intrestrate;
        balance+=intrest;
        System.out.println("Intreset of rupees "+intrest+" Added to your account...");
    }
    public void withdraw(double amount){
        if (amount >0 || amount <=balance) {
            balance-=amount;
            System.out.println("Withdraw successfully.. Balance amount is "+balance);
        }
        else{
            System.out.println("Insufficent balance...");
        }  
    }

}

public class bankaccount {
    static DataInputStream in=new DataInputStream(System.in);
    @SuppressWarnings("deprecation")
    public static void main(String ar[]) {
        String name;
        int accno;
        int choice;
        try {
            System.out.println("Enter the Name:");
            name=in.readLine();
            System.out.println("Enter the account  number :");
            accno=Integer.parseInt(in.readLine());
            System.out.println("Enter the account type \n 1. Savings \n 2.current");
            choice=Integer.parseInt(in.readLine());

            if (choice==1) {
                saveacc obj=new saveacc();
                obj.read(name, accno, "Savings");
                int select;
                while (true) {
                    System.out.println("1.deposit \n2.withdraw \n3.display Blanace \n4.exit");
                    select=Integer.parseInt(in.readLine());

                    switch (select) {
                        case 1:
                            System.out.println("enter the Amount to deposit :");
                            double amount=Double.parseDouble(in.readLine());
                            obj.deposit(amount);
                            break;
                        case 2:
                            System.out.println("Enter the amount to withdraw:");
                            double withamount=Double.parseDouble(in.readLine());
                            obj.withdraw(withamount);
                        case 3:
                            obj.callc();
                            obj.balancedisplay();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                }
            }
            else if (choice==2) {
                curracc obj2=new curracc();
                obj2.read(name, accno, "Current");
                int select;
                while (true) {
                    System.out.println("1.deposit \n2.withdraw \n3.display Blanace \n4.exit");
                    select=Integer.parseInt(in.readLine());

                    switch (select) {
                        case 1:
                            System.out.println("enter the Amount to deposit :");
                            double amount=Double.parseDouble(in.readLine());
                            obj2.deposit(amount);
                            break;
                        case 2:
                            System.out.println("Enter the amount to withdraw:");
                            double withamount=Double.parseDouble(in.readLine());
                            obj2.withdraw(withamount);
                        case 3:
                            obj2.balancedisplay();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                }

            }

        } catch (Exception e) {
        }
    }
    
}