import java.util.Scanner;
public class Digitsum {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter a digit : ");
  int num1=input.nextInt();
  int sum=0;
  for(; num1!=0;num1/=10){
sum+=num1%10;
  }
  System.out.println("Sum of digit is:"+sum);
  input.close();
  }
}
  
