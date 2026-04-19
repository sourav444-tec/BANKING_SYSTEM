import java.util.*;
public  class  Bank{
    static ArrayList<Bank> db=new ArrayList<Bank>();
    int cid,acn;
    double abl;
    string amn,pass;

    public Bank() {
        Scanner(System.in);
        System.out.println("Enter customer id");
        cid=sc.next int();
        System.out.print("Enter Account Name:");
        acn=sc.next int();
        System.out.println("Enter the opening Ballance:");
        abl:sc.next double();
        sc.nextLine(); //string buffer reset line
        System.out.print("Enter Password:");
        pass=sc.nextLine();
        db.add(this);
    }
    public static void disp(){
        for(Bank x:db)
            System.out.println(x.cid+"--"+x.amn+"--"+x.abl);
    }
    public static int signin(int cid,String pass){
        for(int i=0;i<db.size();i++){
            if(cid==db.get(i).cid && pass.equals(db.get(i).pass))
            return i;
        }
    }
    public static void signup(){
        new Bank();

    }
    public static void menu(Bank tg){
        Scanner sc= new 
        Scanner(system.in);
        system.out.print("1.Enquary:\n 2. Deposit\n 3.withdraw\n 4. Transation\n0. signout);
        int ch;
        while(true){
            System.out.println("Customer ID:"+tg.cid);
            System.out.println("Account No:"+tg.cid);
            System.out.println("Customer Name"+tg.amn);
            System.out.println("Ballance Rs."+tg.abl);
        }
        else if (ch==2){
            System.out.print("Enter deposit ammount:");
            double da=sc.nextDoubl);
            tg.abl+=da;
            System.out.println("Rs."+da+"has been creadited to A/C+tg.acn);
        
        else if( ch==3)
        {
            system.out.print("RS."+ +"has been debited from A/C"+TG.acn);
        }
        else{
            System.out.println("Insuffications ballance ");
         }
         else if(ch == 0)
         break;
         else
         system.out.println("Invalid choice");
        }
    }
}

    

    
}