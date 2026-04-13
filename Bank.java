import java.util.*;
public  class  Bank{
    static ArrayList<Bank> db=new ArrayList<Bank>();
    int cid,acn;
    double abl;
    String anm,pass;

    public Bank() {
        Scanner(System.in);
        System.out.println("Enter customer id");
        cid=sc.next int();
        System.out.print("Enter Account Name:");
        acn=sc.next int;
        System.out.println("Enter the opening Ballance:");
        abl:sc.next double();
        sc.nextLine(); //string buffer reset line
        System.out.print("Enter Password:");
        pas=sc.nextLine();
        db.add(this);
    }
    public ststic void disp(){
        for(Bank x:db)
            System.out.println(x.cid+"--"+x.anm+"--"+x.abl);
    }
    public ststic int sigin(int cid,STRING pass){
        for(int i=0;i<db.size();i++){
            if(cid==db.get(i).cid && pass.equals(db.get(i).pass))
            return i;
        }
    }

    

    
}