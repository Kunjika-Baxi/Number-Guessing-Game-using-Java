import java.util.Scanner;
import java.util.Random;
public class Number_Guessing_Game
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       int num,max=50,min=1;char ch;double n;
       n=Math.random()*(max-min+1)+min;
       System.out.println("-----Number Guessing Game-----");
       while(true)
       {
           System.out.println("\nEnter Number You want to Guess (1-50) : ");
           num=sc.nextInt();
           if(num==(int)n)
           {
               System.out.println("Yay!!! Congrats!! You have Guessed the Number Correctly.\nThank you Playing.\nHope you Enjoyed!!\n");
               break;
           }
           else if(n<num)
           {
               System.out.println("-----> Your Guess is Higher Than Number");
           }
           else
           {
               System.out.println("-----> Your Guess is Lower Than Number");
           }
       }
       while(true)
       {
       System.out.println("\nDo you Want to Play Again ? (y/n) : ");
       ch=sc.next().charAt(0);
       if(ch=='y')
       {
           n=Math.random()*(max-min+1)+min;
            while(true)
          {
           System.out.println("\nEnter Number You want to Guess (1-50) : ");
           num=sc.nextInt();
           if(num==(int)n)
           {
               System.out.println("Yay!!! Congrats!! You have Guessed the Number Correctly.\nThank you Playing.\nHope you Enjoyed!!\n");
               break;
           }
           else if(n<num)
           {
               System.out.println("-----> Your Guess is Higher Than Number");
           }
           else
           {
               System.out.println("-----> Your Guess is Lower Than Number");
           }
          }
       }
       else 
       {
           System.out.println("Thank You!!");break;
       }
       }
    }
}