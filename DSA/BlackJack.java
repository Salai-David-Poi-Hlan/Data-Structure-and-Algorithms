package DSA;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    private int[] cardYou = new int[5];
    private int[] cardComputer = new int[2];
    private int numYouCard = 2;
    private int sumYou = 0;
    private int sumComputer = 0;
    private String winner;

    public BlackJack() {
        Random rand = new Random();
        cardYou[0] = rand.nextInt(10) + 1; // card values from 1 to 10
        cardYou[1] = rand.nextInt(10) + 1;
        sumYou = cardYou[0] + cardYou[1];

        cardComputer[0] = rand.nextInt(10) + 1;
        cardComputer[1] = rand.nextInt(10) + 1;
        sumComputer = cardComputer[0] + cardComputer[1];
    }

    public void showPlayerCard() {
        System.out.print("Your cards: ");
        for (int i = 0; i < numYouCard; i++) {
            System.out.print(cardYou[i] + " ");
        }
        System.out.println();
    }

    public void showComputerCard() {
        System.out.println("Computer's cards: " + cardComputer[0] + " " + cardComputer[1]);
    }

    public void addMoreCard() {
        if (isEnd()) {
            showPlayerCard();
            showComputerCard();
        } else {
            System.out.println("Want another card? (y/n)...");
            Scanner scan = new Scanner(System.in);
            char input = scan.nextLine().charAt(0);
            if (input == 'y' && numYouCard < 5) {
                Random rand = new Random();
                cardYou[numYouCard] = rand.nextInt(10) + 1;
                sumYou += cardYou[numYouCard];
                numYouCard++;
                showPlayerCard();
                if (sumYou > 21) {
                    System.out.println("You bust!");
                    return;
                }
                addMoreCard(); // Ask again for another card
            } else {
                showPlayerCard();
                showComputerCard();
            }
        }
    }

    public void showSumCard() {
        System.out.println("Your total: " + sumYou);
        System.out.println("Computer's total: " + sumComputer);
    }

    public boolean isEnd() {
        return sumYou >= 21 || numYouCard == 5;
    }

    public void checkWinner() {
        if (sumYou > 21) {
            winner = "Dealer wins!";
        } else if (sumComputer > 21 || sumYou > sumComputer) {
            winner = "You win!";
        } else if (sumYou == sumComputer) {
            winner = "It's a tie!";
        } else {
            winner = "Dealer wins!";
        }
    }

    public String getWinner() {
        return winner;
    }

    public static void main(String[] args) {
        BlackJack bj = new BlackJack();
        bj.showPlayerCard();
        System.out.println("Computer's cards: ? ?");
        bj.addMoreCard();
        bj.showSumCard();
        bj.checkWinner();
        System.out.println("Winner: " + bj.getWinner());
    }
}
