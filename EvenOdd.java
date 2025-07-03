import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
System.out.println("Enter a number");
double num1=input.nextDouble();
if(num1 %2==0){
System.out.println("the number is even");
}else{
  System.out.println("the number is odd");
}
input.close();
  }
}
