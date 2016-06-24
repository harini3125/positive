import java.util.Scanner;
 
class A
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter an integer: ");
      Scanner i = new Scanner(System.in);
      x = i.nextInt();
 
      if ( x % 2 == 0 )
         System.out.println(x + "is an even number.");
      else
         System.out.println(x + "is an odd number.");
   }
