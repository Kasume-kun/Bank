package Board;

import java.util.*;
public class Bank 
{
    private static Scanner obj = new Scanner (System.in);

    private static float balance = 0;
    private static int anotherTransaction;
    
    static AC1 obj1 = new AC1();
    static AC1 obj2 = new AC1();
    static AC1 obj3 = new AC1();
    static AC1 obj4 = new AC1();
    static Bank ob1 = new Bank();
    static Bank ob2 = new Bank();
    static Bank ob3 = new Bank();
    static Bank ob4 = new Bank();
    public static void main()
    {

        obj1.Sumedh();
        System.out.println(obj1.Name);
        ob1.Name=obj.Name;
        obj2.Mickey();
        System.out.println(obj2.Name);

        obj3.Minnie();
        System.out.println(obj3.Name);

        obj4.Donald();
        System.out.println(obj4.Name);

        menu();
     }

    private static void menu()
    {
        System.out.println("=================================================");
        System.out.println("             WELCOME TO SSK BANK                 ");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("             How can we help you?                ");
        System.out.println("");
        System.out.println(" 1. Open a new Account.(press 1)");
        System.out.println(" 2. Transaction.(press 2)");
        System.out.println(" 3. Currency Exchange.(press 3)");
        System.out.println(" 4. EXIT(press 4)");
        System.out.println("");
        int choice = obj.nextInt();
        System.out.println("");
        switch(choice)
        {
            case 1 :
            System.out.println("=================================================");
            System.out.println("               OPEN A NEW ACCOUNT                ");
            System.out.println("=================================================");

            System.out.println("");
            create();
            break;

            case 2 :  
            login();
            break;

            case 3 :  
            currency();
            break;

        }
    }

    private static void login()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("   YOU NEED TO LOG IN FOR A TRANSACTION.....   ");
        System.out.println("");
        
        System.out.print("Enter your Name : ");
        String user = sc.nextLine();
        System.out.println("");

        System.out.print("Enter your Password : ");
        String pass = sc.nextLine();
        System.out.println("");

        if((user.equals(obj1.Name)) && (pass.equals(obj1.pass)))
        {
            System.out.println("======================================");
            System.out.println("          TRANSACTION SECTION         "); 
            System.out.println("======================================"); 
            System.out.println("");
            obj1.transactSumedh();
        }
        else if((user.equals(user2)) && (pass.equals(pass2)))
        {
            System.out.println("======================================");
            System.out.println("          TRANSACTION SECTION         "); 
            System.out.println("======================================"); 
            System.out.println("");
            obj2.transactDaisy();
        }
        else if((user.equals(user3)) && (pass.equals(pass3)))
        {
            System.out.println("======================================");
            System.out.println("          TRANSACTION SECTION         "); 
            System.out.println("======================================"); 
            System.out.println("");
            obj3.transactDonald();
        }
        else if((user.equals(user4)) && (pass.equals(pass4)))
        {
            System.out.println("======================================");
            System.out.println("          TRANSACTION SECTION         "); 
            System.out.println("======================================"); 
            System.out.println("");
            obj4.transactMickey();
        }
        else if((user.equals(user5)) && (pass.equals(pass5)))
        {
            System.out.println("======================================");
            System.out.println("          TRANSACTION SECTION         "); 
            System.out.println("======================================"); 
            System.out.println("");
            obj5.transactPluto();
        }
        else if((user.equals(user6)) && (pass.equals(pass6)))
        {
            System.out.println("======================================");
            System.out.println("          TRANSACTION SECTION         "); 
            System.out.println("======================================"); 
            System.out.println("");
            obj6.transactUser6();
        }
        else if((user.equals(user7)) && (pass.equals(pass7)))
        {
            System.out.println("======================================");
            System.out.println("          TRANSACTION SECTION         "); 
            System.out.println("======================================"); 
            System.out.println("");
            obj7.transactUser7();
        }
        else if((user.equals(user8)) && (pass.equals(pass8)))
        {
            System.out.println("======================================");
            System.out.println("          TRANSACTION SECTION         "); 
            System.out.println("======================================"); 
            System.out.println("");
            obj8.transactUser8();
        }
        else
        {
            System.out.println("");
            System.out.println("Either the Name or the Password is incorrect....");
            System.out.println("Please try again.");
            login();
        }
    }

    private  void transaction()
    {
        int choice2nd;

        System.out.println("~~~~~~~~~~WELCOME~~~~~~~~~~");
        System.out.println("");
        System.out.println("Please select an option : "); 
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("");

        choice2nd = obj.nextInt();

        switch(choice2nd){
            case 1:
            float amount; 
            System.out.println("=================================");
            System.out.println("          WITHDRAW MONEY         "); 
            System.out.println("================================="); 
            System.out.println(""); 
            System.out.println("Please enter amount to withdraw: "); 
            amount = obj.nextFloat();
            if(amount > balance || amount == 0)
            {
                System.out.println("You have insufficient funds...."); 
                System.out.println(""); 
                anotherTransaction();
            } else 
            {
                balance = balance - amount; 
                System.out.println("You have withdrawn Rs."+amount);
                System.out.println("Your current balance is Rs."+balance);
                System.out.println("");
                anotherTransaction(); 
            }
            break; 

            case 2:
            float deposit; 
            System.out.println("=================================");
            System.out.println("          DEPOSIT MONEY          "); 
            System.out.println("================================="); 
            System.out.println("");
            System.out.println("Please enter amount you would wish to deposit: "); 
            deposit = obj.nextFloat();
            balance = balance + deposit;
            System.out.println("You have deposited Rs."+deposit);
            System.out.println("Your new balance is Rs."+balance);
            System.out.println("");
            anotherTransaction();
            break; 

            case 3:
            System.out.println("=================================");
            System.out.println("          CHECK BALANCE          "); 
            System.out.println("================================="); 
            System.out.println("Your balance is "+balance);
            System.out.println("");
            anotherTransaction(); 
            break;

            default:
            System.out.println("Invalid option"); 
            System.out.println("");
            anotherTransaction();
            break;
        }
    }

    public static void anotherTransaction()
    {
        System.out.println("");
        System.out.println("Want to do more Transactions?????");
        System.out.println("(press 1) to continue.");
        System.out.println("(press 2) to menu.");
        int a = obj.nextInt();
        if(a==1)
        {
            System.out.println("");
            transaction();
            System.out.println("");
        }
        else if(a==2)
        {
            System.out.println("");
            menu();            
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("Invalid Option......Try Again");
            System.out.println("");
            anotherTransaction();
        }
    }

    private static void create()
    {
        int a = 0;
        if (a == 0)
        {
            System.out.println("Enter your name : ");
            user6 = obj.nextLine();
            System.out.println("");
            System.out.println("Password : ");
            pass6 = obj.nextLine();
            System.out.println("");
            menu();
        }
        else if(a==1)
        {      
            System.out.println("Enter your name : ");
            user7 = obj.nextLine();
            System.out.println("");
            System.out.println("Password : ");
            pass7 = obj.nextLine();
            System.out.println("");
            menu();
        }
        else 
        {      
            System.out.println("Enter your name : ");
            user8 = obj.nextLine();
            System.out.println("");
            System.out.println("Password : ");
            pass8 = obj.nextLine();
            System.out.println("");
            menu();
        }
    }

    private static void currency()
    {
        int a,b; 
        double r,d,p;
        System.out.println("======================================");
        System.out.println("           CURRENCY EXCHANGE          ");
        System.out.println("======================================");
        System.out.println("");
        System.out.println("   Selct your initial currency : ");
        System.out.println("   1) Rupee");
        System.out.println("   2) Dollar");
        System.out.println("   3) Pound");
        a = obj.nextInt();
        System.out.println("");
        System.out.println("   Selct your final currency : ");
        System.out.println("   1) Rupee");
        System.out.println("   2) Dollar");
        System.out.println("   3) Pound");
        b = obj.nextInt();
        System.out.println("");
        if(a==1 && b==1)
        {
            System.out.println("");
            System.out.println("Enter the amount in Rupees : ");
            r = obj.nextDouble();
            System.out.println("");
            System.out.println("Your amount in Rupees is Rs."+r);
            System.out.println("");
        }
        else if (a==1 && b==2)
        {
            System.out.println("");
            System.out.println("Enter the amount in Rupees : ");
            r = obj.nextDouble();
            System.out.println("");
            d = r*65;
            System.out.println("Your amount in Dollars is "+d+"$");
            System.out.println("");
        }
        else if (a==1 && b==3)
        {
            System.out.println("");
            System.out.println("Enter the amount in Rupees : ");
            r = obj.nextDouble();
            System.out.println("");
            p = r*85;
            System.out.println("Your amount in Pounds is "+p+" pounds");
            System.out.println("");
        }
        else if(a==2 && b==1)
        {
            System.out.println("");
            System.out.println("Enter the amount in Dollars : ");
            d = obj.nextDouble();
            System.out.println("");
            r = d/65;
            System.out.println("Your amount in Rupees is Rs."+r);
            System.out.println("");
        }
        else if (a==2 && b==2)
        {
            System.out.println("");
            System.out.println("Enter the amount in Dollars : ");
            d = obj.nextDouble();
            System.out.println("");
            System.out.println("Your amount in Dollars is "+d+"$");
            System.out.println("");
        }
        else if (a==2 && b==3)
        {
            System.out.println("");
            System.out.println("Enter the amount in Dollars : ");
            d = obj.nextDouble();
            System.out.println("");
            p = d*(17/13);
            System.out.println("Your amount in Pounds is "+p+" pounds");
            System.out.println("");
        }
        else if(a==3 && b==1)
        {
        }
        else if (a==3 && b==2)
        {
        }
        else if (a==3 && b==3)
        {
        }
        else
        {
            System.out.println("Error.....Please enter a valid input!!!!!!");
        }

        System.out.println("Want to Exchange more currency?????");
        System.out.println("(press 1) to continue.");
        System.out.println("(press 2) to menu.");
        int z = obj.nextInt();
        if(z==1)
        {
            System.out.println("");
            currency();
            System.out.println("");
        }
        else if(z==2)
        {
            System.out.println("");
            menu();            
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("Invalid Option......Try Again");
            System.out.println("");
            menu();
        }
    }
}