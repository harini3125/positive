import java.util.Scanner;
 
class A
{
int x, y, z;
   public static void main(String args[])
   {
        System.out.println("Enter three integers: ");
      Scanner i = new Scanner(System.in);
   x = i.nextInt();
      y = i.nextInt();
      z = i.nextInt();
   if ( x > y && x > z )
         System.out.println(x + "is largest.");
      else if ( y > x && y > z )
         System.out.println(y + "is largest.");
      else if ( z > x && z > y )
         System.out.println(z + "is largest.");
   }
