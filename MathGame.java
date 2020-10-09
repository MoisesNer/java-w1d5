//Gil & Moises
import java.util.Scanner;
import java.lang.Math;

public class MathGame {

    public static short num1, num2;

    public static void main(String[] args){
       
        Scanner input  = new Scanner(System.in);
        short p1 = 3, p2 = 3;
        char answer;

        while(true){
            System.out.println("Hello and welcome to the two player math game, would you like to play? (y/n)");
            answer = input.next().charAt(0);

            if(Character.toUpperCase(answer) == 'Y'){
                System.out.println("You each have 3 lives");
                break;

            } else if (Character.toUpperCase(answer) == 'N'){
                break;
            } else { 
                System.out.println("You have to enter Y or N");
            }
        }

    if(Character.toUpperCase(answer) == 'Y'){
        do{

            generateRandomNumbers();
            System.out.println("Player 1: what is " + num1 + " + " + num2 + "?");
            int p1Answer = input.nextInt();
            
            if(p1Answer == num1 + num2){
                System.out.println("Correct!");
            } else {
                p1--;
                if (p1 == 0){
                    break;
                } else {

                System.out.println("Incorrect, the answer is " + (num1 + num2));
                }
            }

                System.out.println( "The lives: Player 1: " + p1 + "/3 Player 2: " + p2 + "/3\n");

            generateRandomNumbers();
            System.out.println("Player 2: what is " + num1 + " + " + num2 + "?");
            int p2Answer = input.nextInt();
            if(p2Answer == num1 + num2){
                System.out.println("Correct!");
            } else {
                p2--;
                if (p2 == 0){
                    break;
                
                } else {
                System.out.println("Incorrect, the answer is " + (num1 + num2));
                }
            }
            System.out.println( "The lives: Player 1: " + p1 + "/3 Player 2: " + p2 + "/3\n");
            
        } while (p1 > 0 || p2 > 0);
       
        System.out.println("The lives: Player 1: " + p1 + "/3 Player 2: " + p2 + "/3\n");
        if(p1 > 0){
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    }

    public static void generateRandomNumbers() {

        num1 = (short)(Math.random() * 120);
        num2 = (short)(Math.random() * 120);
    }
}