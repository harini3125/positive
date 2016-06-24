import java.util.Scanner;

  public class A
  {

   public static void main(String[] args)
   { 

    Scanner i = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = i.nextInt();

    if( n == 0)
    { 
    System.out.println("Number is equal to zero");
    }
    else if (n > 0)
    { 
    System.out.println("Number is positive");
    }
    else 
    {
    System.out.println("Number is negative");
    }
 }
 }
