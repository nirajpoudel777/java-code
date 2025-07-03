import java.util.Scanner;
public class AreaRecatangle {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter a length :");
    double num1=input.nextDouble();
    System.out.println("enter a breadth : ");
    double num2=input.nextDouble();
System.out.println("area of the rectangle is ");
System.out.println(num1*num2);
input.close();
  }

}
