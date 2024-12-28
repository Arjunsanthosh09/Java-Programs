// 30.Define a class Account and subclasses FD and SB. Write menu driven program to perform 
// operations deposit, withdrawal and display details. Repeat the operationsbased on user option.    
      
    import java.io.DataInputStream;
    class Account{
    String accountholder;
    int bankaccno;
    double balance;
    
    public Account(String ac,int bn,double ba){
        accountholder=ac;
        bankaccno=bn;
        balance=ba;
    }
    public void deposit(double amount){
        if (amount >0) {
            balance+=amount;
            System.out.println("Deposied Sucessfully .. Balance amount is $"+balance);
        }
        else{
            System.out.println("Invalid deposit amount...");
        }
    }
    public void credit(double am){
        if (am>0 && am<balance) {
            balance-=am;
            System.out.println(am+"$ credited from your account successfully... Balance amount is "+balance);
        }else{
            System.out.println("Invalid amount .. Low balance...");
        }
    }

    public void display(){
        System.out.println("AccountHolder Name : "+accountholder);
        System.out.println("Account Number : "+bankaccno);
        System.out.println("Bank Balance :"+balance);
    }
}

class Fd extends Account{
    double interestrate;
    int months;
    public Fd(String ac,int bn,double ba,double intrest,int mon){
        super(ac, bn, ba);
        interestrate=intrest;
        months=mon;
    }
    public void display(){
        super.display();
        System.out.println("Interest rate :"+interestrate);
        System.out.println("Duriation : "+months);
    }

}

class Sb extends Account{
    double minbal;
    public Sb(String ac,int bn,double ba,float minbal){
        super(ac, bn, ba);
        this.minbal=(double)minbal;
    }
    public void credit(double amount){
        if (balance - amount >= minbal) {
            super.credit(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance requirement not met.");
        }
    }
    public void display(){
        super.display();
        System.out.println("Minimum balance  :"+minbal);
    }
}

public class AccountManagement{
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        int choice;
        try {
            Fd obj1 = new Fd("Arjun", 1012345, 500000, 5.5, 12);
            Sb obj2 = new Sb("Arun", 10213466, 100000, 1000);
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Deposit into FD Account");
                System.out.println("2. Deposit into SB Account");
                System.out.println("3. Withdraw from SB Account");
                System.out.println("4. Display FD Account Details");
                System.out.println("5. Display SB Account Details");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
    
                choice=Integer.parseInt(in.readLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter the desposit amount for FD Account :");
                        double amount=Double.parseDouble(in.readLine());
                        obj1.deposit(amount);
                        break;
                    case 2:;
                        System.out.println("Enter the deposit amount for Sb Account :");
                        double am=Double.parseDouble(in.readLine());
                        obj2.deposit(am);
                        break;
                    case 3:
                        System.out.println("Enter the amount to withdraw from the Sb Account :");
                        double drawam=Double.parseDouble(in.readLine());
                        obj2.credit(drawam);
                        break;
                    case 4:
                        System.out.println("Details of the Fd Account :");
                        obj1.display();
                        break;
                    case 5:
                        System.out.println("Details of the Sb Account :");
                        obj2.display();
                        break;
                    case 6:
                        System.out.println("Exiting.....");
                        return;
                    default:
                        System.out.println("Invalid choice .....");
                        break;
                }
                  
            }
            
        } catch (Exception e) {}
        
    }
}