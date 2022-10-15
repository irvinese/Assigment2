import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {

            String player;
            boolean done = false;
            Scanner scanner = new Scanner(System.in);
            Random rnd = new Random();

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            int point = 0;
            int crapsRoll2 = die1 + die2;
        do {
            while (true) {


                System.out.println("player, want to roll the dice");
                player = scanner.nextLine();
                if (player.equalsIgnoreCase("y") || player.equalsIgnoreCase("n")) {
                    break;
                }
                System.out.println("pleases answer Y or N, not: " + player);
            }
            if (crapsRoll == 1) {
                System.out.println("your crapping out" + crapsRoll);
            }
            if (crapsRoll == 7) {
                System.out.println("you win" + crapsRoll);
            }
            if (crapsRoll == 11) {
                System.out.println("you win" + crapsRoll);
            }
            if (crapsRoll == 2) {
                System.out.println("Your crapping out" + crapsRoll);
            }
            if (crapsRoll == 3) {
                System.out.println("your crapping out" + crapsRoll);
            }
            if (crapsRoll == 12){
                System.out.println("your crapping out" + crapsRoll);
            }
            else if (crapsRoll == 4 || crapsRoll == 5 || crapsRoll == 6 || crapsRoll == 8 || crapsRoll == 9 || crapsRoll == 10){
                point = point + crapsRoll;
                System.out.println("\n point =" + point);

                do {
                    crapsRoll2 = die1 + die2;
                    System.out.println("\n your next roll is: " + crapsRoll2);
                    if (crapsRoll2 == point){
                        System.out.println("\n you win");
                        point = 0;
                        break;
                    } if (crapsRoll2 == 7){
                        System.out.println("\n you lose");
                        point = 0;
                        break;
                    }
                } while (crapsRoll2 != point || crapsRoll2 != 7);
            }




            System.out.println("Do you want to play again [Y/N]");
            player = scanner.nextLine(); //recive a string input from the user
            if (player.equalsIgnoreCase("N")) {
                done = true;
            }

        } while (!done);
    }

}