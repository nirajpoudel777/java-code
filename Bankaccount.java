public class Bankaccount {
  double amount;
  double accountNumber;
  String accountName;
  int time;
  int rate = 12;

Bankaccount(double amount, double accountNumber, String accountName,int time,int rate){
this.accountName=accountName;
this.accountNumber=accountNumber;
this.amount=amount;
this.time=time;
this.rate=rate;
  }
  public void displayinfo(){
    System.out.println("amount"+amount);
    System.out.println("accountnumber"+accountNumber);
    System.out.println("accountname"+accountName);
  }
public void calculateInterest(){
  double interest = this.time*this.amount*this.rate/100;
  System.out.println("interest"+interest);
}
public static void main(String[] args) {
  Bankaccount p1 =new Bankaccount(5000000, 012344556, "niraj", 5, 12);
  p1.calculateInterest();
  p1.displayinfo();
}
}