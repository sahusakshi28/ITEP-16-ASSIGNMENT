class Bank{
    private String accountno;
    private String holdername;
    private double balance;
    public void setData(String accountno,String holdername,double balance){
        this.accountno=accountno;
        this.holdername=holdername;
        this.balance=balance;
    }
    public void balanceEnquiry(){
        System.out.println("Current Balance..."+this.balance);
        

    }
    public void deposite(int amount){
        this.balance=this.balance+amount;
        System.out.println("After deposite:  "+this.balance);
    }
    public void withdrawal(int amount){
        if(amount>this.balance){
            System.out.println("Insufficient balance");
        }else{
            this.balance=this.balance-amount;
            this.balanceEnquiry();
        }
    }
}
class Q3{
    public static void main(String args[]){
        Bank Sbi= new Bank();
        Sbi.setData("sak1289","Sakshi Sahu",50000);
        Sbi.balanceEnquiry();
        Sbi.deposite(1000);
        Sbi.withdrawal(200);
    }
}

