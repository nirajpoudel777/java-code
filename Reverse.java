import java.util.Scanner;
public class Reverse {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter a word :");
    String word=input.nextLine();
    String reversed=new StringBuilder(word).reverse().toString();
    System.out.println(reversed);
    input.close();
  }
}
