// calculater
import java.util.Scanner;
public class _17 
{
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     double a=sc.nextDouble();
     System.out.println("Enter a number:");
     double b=sc.nextDouble();
     double result;
     System.out.println("Enter the operation:");
     char operation=sc.next().charAt(0);
     if(operation== '+')
     {
        
         result = a+b;
         System.out.println("A+B="+result);
     }
     else if(operation== '-')
     {
        result= a-b;
        System.out.println("A+B="+result);  
     }
     else if(operation== '*')
     {
        result= a*b;
        System.out.println("A+B="+result);  
    }
    else if(operation== '/')
     {
        result= a/b;
        System.out.println("A+B="+result);  
    }
    else
    {
        System.out.println("Enter valid operation");
    }
    sc.close();
    }
}
