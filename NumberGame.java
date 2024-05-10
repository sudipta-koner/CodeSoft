// TASK 1 : NUMBER GAME
import java.util.*;
class NumberGame
{
    int calScore(int num,int myNum)
    {
        int score = 100;
        int d=Math.abs(num-myNum);
        score=score-d*10;
        return d; 
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        NumberGame ob = new NumberGame();
        Random r = new Random();
        boolean choice = true;
        
        while(choice){

            int range = 100;
            int attempt = 0;
            int maxAttempt = 7;
            boolean correct = false;
            int num = r.nextInt(range)+1;

            System.out.println("<<<<<< Welcome to the Game >>>>>>");
            System.out.println("There is a number and you have to guess it in 7 attempts..");
            System.out.println("The number is in between 1 and "+range);
            System.out.println("Good luck player!");

            while(!correct && attempt<maxAttempt)
            {
                System.out.print("Enter your number : ");
                int myNum = sc.nextInt();
                attempt++;
                int score=ob.calScore(num,myNum);

                if(myNum==num)
                {
                    correct=true;
                    System.out.println("Congratulations! you have guessed right");
                    System.out.println("You took "+attempt+" attempts.");
                    System.out.println("Score : "+score);
                }
                else if(myNum<num)
                {
                    System.out.println("Enter a big number");
                }
                else
                {
                    System.out.println("Enter a small number");
                }

                if(!correct && attempt<maxAttempt)
                {
                    System.out.println("You have "+(maxAttempt-attempt)+" attempts left");
                }
            }
            if (!correct)
            {
                System.out.println("Sorry ! You have no attempt left");
                System.out.println("The correct number is "+num);   
            }

            System.out.print("Do you Want to play again ? (Yes or No) : ");
            String str=sc.next().toLowerCase();
            boolean isEqual=str.equals("yes");
            if(!isEqual)
            {
                choice=false;
                System.out.println("Thank you. Good Bye.");
            }
        }

    }
        
    
}