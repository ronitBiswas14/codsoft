import java.util.*;

public class numberg {
public static void numrandom() 
{
    {   Scanner sc= new Scanner(System.in);
        int a=1+ (int)(100*Math.random());
        int guess,k=5,score,i; 
        System.out.println("you have to guess the number.\n"+"A random number is choosen b/w 1 to 100 \n"+"you have 5 trails");      
        for( i=1;i<k;i++)
        {   System.out.println("ENTER YOUR GUESS");
            guess=sc.nextInt();
            if(guess==a)
            {
                System.out.println("YOUR GUESS IS CORRECT");
                break;
            }
            else if(guess<a && i<k)
            {
                System.out.println("THE NUMBER IS GREATER THAN YOUR GUESS");
            
            }
            else if(guess>a && i<k)
            {
                System.out.println("THE NUMBER IS LESSER THAN YOUR GUESS");
            }
            }
            System.out.println(i);
            if(i==k)
            System.out.println("YOUR CHANCES HAVE EXHAUSTED");
            System.out.println("The number was :"+a);
    }
}

    public static void main(String[] args) {
        numrandom();
    }
}
