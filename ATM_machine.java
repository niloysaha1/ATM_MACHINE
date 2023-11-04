import java.util.*;
class ATM_machine
{
    Scanner sc=new Scanner(System.in);
    int s;
    void totalamount(int amount){
        s=amount;
    }
    void withdraw(int amount){
        do{
            if(amount>5000){
                System.out.println("YOU CANNOT MORE THAN 5000 ");
                amount=sc.nextInt();
            }
        }while(amount>5000);
        int pw,e=0;
        System.out.println("ENTER THE PIN");
        do{
           pw=sc.nextInt();
           e=pin(pw);
        }while(e==0);
        s=s-amount;
        System.out.println("THE TOTAL BALANCE IN YOUR ACCOUNT-"+s);        
    }
    void deposite(int amount){
        int pw,e=0;
        System.out.println("ENTER THE PIN");
        do{
           pw=sc.nextInt();
           e=pin(pw);
        }while(e==0);
        s=s+amount;
        System.out.println("THE TOTAL BALANCE IN YOUR ACCOUNT-"+s);        
    }
    void checkbalance(){
        int pw,e=0;
        System.out.println("ENTER THE PIN");
        do{
           pw=sc.nextInt();
           e=pin(pw);
        }while(e==0);
        System.out.println("THE TOTAL BALANCE IN YOUR ACCOUNT-"+s);
    }
    int pin(int pw){
        if(pw==1234)
        return 1;
        else {
            System.out.println("WRONG PIN\n PLEASE ENTER YOUR PIN AGAIN");
            return 0;
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        ATM_machine ob=new ATM_machine();
        ob.totalamount(50000);        
        long n;
        int pw=0,f,amt;
        do
        {
            System.out.println("ENTER THE ACCOUNT NUMBER");
            n=sc.nextLong();
            if(n==457812)
            {
                System.out.println("ENTER THE PIN");
                pw=sc.nextInt();                
            }
            else
            System.out.println("Invalid!! Please try again\n\n");
            if(pw!=1234){
                System.out.println("Invalid pin!! try again");
            }
        }while(n!=457812 || pw!=1234);
        System.out.println("WELCOME\n\n1.WITHDRAW\n2.DEPOSITE\n3.CHECK BALANCE\n\nIF YOU WANT TO EXIT THEN ENTER 0");
        do{
            f=sc.nextInt();
            if(f==1){
                System.out.println("ENTER THE WITHDRAW AMOUNT");
                amt=sc.nextInt();
                ob.withdraw(amt);
                System.out.println("WELCOME\n\n1.WITHDRAW\n2.DEPOSITE\n3.CHECK BALANCE\n\nIF YOU WANT TO EXIT THEN ENTER 0");
            }            
            else if(f==2){
                 System.out.println("ENTER THE DEPOSITE AMOUNT");
                 amt=sc.nextInt();
                 ob.deposite(amt);
                 System.out.println("WELCOME\n\n1.WITHDRAW\n2.DEPOSITE\n3.CHECK BALANCE\n\nIF YOU WANT TO EXIT THEN ENTER 0");
            }
            else if(f==3){
                ob.checkbalance();
                System.out.println("WELCOME\n\n1.WITHDRAW\n2.DEPOSITE\n3.CHECK BALANCE\n\nIF YOU WANT TO EXIT THEN ENTER 0");
            }
            else if(f==0){
                System.exit(0);
            }
            else
            System.out.println("PLEASE CHOOSE THE CORRECT OPTION");
        }while(true);
    }
}