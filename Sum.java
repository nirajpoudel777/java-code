import java.util.Scanner;
public class Sum {
  double a;
  double b;
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
System.out.println("Enter a first number :");
double num1=input.nextDouble();
System.out.println("Enter a second number :");
double num2=input.nextDouble();
System.out.println("The sum of two number is ");
System.out.println(num1+num2);
input.close();
  }
}
