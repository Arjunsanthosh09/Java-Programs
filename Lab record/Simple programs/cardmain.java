// 19.Create an interface “CreditCardInterface” with methods to viewCreditAmount, viewPin, changePin, 
// useCard and payBalance. Create a class Customer (name, card number, pin, creditAmount – initialized to 0).
//  Implement methods viewCreditAmount, viewPin, changePin and payBalance of the interface. From Customer,
//   create classes RegularCardHolder (maxCreditLimit) and GoldCardHolder (String specialPrivileges)
//    and define the remaining methods of the interface. 


import java.io.DataInputStream;

interface CreditCardInterface {
    public void viewCreditAmount();

    public void viewPin();

    public void changePin(int newpin);

    public void useCard(double amount);

    public void payBalance(double amount);

}

class Customer implements CreditCardInterface {
    String name;
    String cardnumber;
    int pin;
    double creditAmount = 0;

    public void viewCreditAmount() {
        System.out.println("Credit Amount is :" + creditAmount);
    }

    public void viewPin() {
        System.out.println("The card pin is :" + pin);
    }

    public void changePin(int newpin) {
        pin = newpin;
        System.out.println("New pin is :" + pin);

    }

    public void useCard(double amount) {
        System.out.println("Card usage is not defined for the base customer.");
    }

    public void payBalance(double amount) {
        if (creditAmount > amount) {
            creditAmount -= amount;
            System.out.println("Balance amount is $" + creditAmount);
        }
    }
}

class RegularCardHolder extends Customer {
    static double maxCreditLimit;

    public RegularCardHolder(String name, String cardNumber, int pin, double maxlimit) {
        this.name = name;
        this.cardnumber = cardNumber;
        this.pin = pin;
        maxCreditLimit = maxlimit;
    }

    public void useCard(double amount) {
        if (creditAmount + amount > maxCreditLimit) {
            System.out.println("The card exceeds the limit. the Maximum limit is $" + maxCreditLimit);
        } else {
            creditAmount += amount;
            System.out.println("The balance is $" + creditAmount);
        }
    }
}

class GoldCardHolder extends RegularCardHolder {
    String specialPrivileges;

    public GoldCardHolder(String name, String cardNumber, int pin, String specialPrivileges) {
        super(name, cardNumber, pin, maxCreditLimit);
        this.specialPrivileges = specialPrivileges;
    }

    public void useCard(double amount) {
        creditAmount += amount;
        System.out.println("Transaction of $" + amount + " approved. Current credit: $" + creditAmount);
    }

    public void SpecialPrivileges() {
        System.out.println("Special Privileges: " + specialPrivileges);
    }
}

public class cardmain {
    public static void main(String ar[]) {
        DataInputStream dis=new DataInputStream(System.in);
        try {
            System.out.println("Enter Customer Type (1 for Regular, 2 for Gold): ");
            int customerType = Integer.parseInt(dis.readLine());

            System.out.println("Enter Name: ");
            String name = dis.readLine();

            System.out.println("Enter Card Number: ");
            String cardNumber = dis.readLine();

            System.out.println("Enter Pin: ");
            int pin = Integer.parseInt(dis.readLine());

            if (customerType == 1) {
                System.out.println("Enter Max Credit Limit: ");
                double maxCreditLimit = Double.parseDouble(dis.readLine());

                RegularCardHolder regularCardHolder = new RegularCardHolder(name, cardNumber, pin, maxCreditLimit);
                System.out.println("Regular Card Holder Created:");
                regularCardHolder.viewCreditAmount();

                System.out.println("Enter amount to use the card: ");
                double amount = Double.parseDouble(dis.readLine());
                regularCardHolder.useCard(amount);

            } else if (customerType == 2) {
                System.out.println("Enter Special Privileges: ");
                String specialPrivileges = dis.readLine();

                GoldCardHolder goldCardHolder = new GoldCardHolder(name, cardNumber, pin, specialPrivileges);
                System.out.println("Gold Card Holder Created:");
                goldCardHolder.viewCreditAmount();

                System.out.println("Enter amount to use the card: ");
                double amount = Double.parseDouble(dis.readLine());
                goldCardHolder.useCard(amount);

                goldCardHolder.SpecialPrivileges();
            } else {
                System.out.println("Invalid Customer Type!");
            }
        } catch (Exception e) {
        }
    }

}
