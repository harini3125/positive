import java.util.*;
class A{  
  public static void main(String[] args)  {  
    int c=0,a,n,temp;  
    Scanner in = new Scanner(System.in);
      System.out.println("Input a number to check if it is an Armstrong number");      
      n = in.nextInt();
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  
