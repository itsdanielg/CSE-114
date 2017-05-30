// Daniel Garcia
// SBU ID: *********
// CSE 114
// Scrimish Course Project

import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        System.out.println("Welcome to Scrimish! \n"
                + "\nDagger = DA (x5 only) || Sword = SW (x5 only) \nMorning Star = MS (x3 only) || War Axe = WA (x3 only) "
                + "\nHalberd = HA (x2 only) || Longsword = LS (x2 only) \nArcher = AR (x2 only) || Shield = SH (x2 only)"
                + " || Crown = CR (x1 only)\n");
        ArrayList<ArrayList<Cards>> PlayerDeck = new ArrayList<ArrayList<Cards>>();
        ArrayList<ArrayList<Cards>> OpponentDeck = new ArrayList<ArrayList<Cards>>();
        Scanner input = new Scanner(System.in);
        Player.createPlayerDeck(PlayerDeck);
        System.out.print("\nEnter \"0\" to show opponent's cards. (Enter any key to keep cards face down): ");
        String show = input.next();
        if (show.equals("0")) {
            AI.setSHOW(0);
        }
        AI.createOpponentDeck(OpponentDeck);
        System.out.println("\nYour Deck");
        Player.showRemaining(PlayerDeck);
        System.out.println("Opponent Deck");
        AI.showRemaining(OpponentDeck);
        game(PlayerDeck, OpponentDeck);
    }

    public static void computerMove() {
        System.out.println("The computer is making a move. Wait 3 seconds...\n");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public static void game(ArrayList<ArrayList<Cards>> PlayerDeck, ArrayList<ArrayList<Cards>> OpponentDeck) {
        Player.playerTurn(PlayerDeck, OpponentDeck);
        Player.removeAllDead(PlayerDeck, OpponentDeck);
        System.out.println("\nYour Deck");
        Player.showRemaining(PlayerDeck);
        System.out.println("Opponent Deck");
        AI.showRemaining(OpponentDeck);
        if (Player.getCRCount() == 0) {
            System.out.println("\nYour crown card has died. You have lost the game.");
        }
        else if (AI.getCRCount() == 0) {
            System.out.println("\nThe opponent's crown card has died, You have won the game!");
        }
        else {
            computerMove();
            AI.opponentTurn(OpponentDeck, PlayerDeck);
            AI.removeAllDead(OpponentDeck, PlayerDeck);
            System.out.println("\nYour Deck");
            Player.showRemaining(PlayerDeck);
            System.out.println("Opponent Deck");
            AI.showRemaining(OpponentDeck);
            if (Player.getCRCount() == 0) {
                System.out.println("\nYour crown card has died. You have lost the game.");
            }
            else if (AI.getCRCount() == 0) {
                System.out.println("\nThe opponent's crown card has died, You have won the game!");
            }
            else {
                game(PlayerDeck, OpponentDeck);
            }
        }
    }

}
