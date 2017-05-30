// Daniel Garcia
// SBU ID: *********
// CSE 114
// Scrimish Course Project

import java.util.Scanner;
import java.util.ArrayList;

public class Player {

    private static int DACount = 0;
    private static int SWCount = 0;
    private static int MSCount = 0;
    private static int WACount = 0;
    private static int HACount = 0;
    private static int LSCount = 0;
    private static int ARCount = 0;
    private static int SHCount = 0;
    private static int CRCount = 0;

    public static int getCRCount() {
        return CRCount;
    }

    public static void setCRCount(int count) {
        CRCount = count;
    }

    public static void createPlayerDeck(ArrayList<ArrayList<Cards>> deck) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            ArrayList<Cards> pile = new ArrayList<Cards>(5);
            for (int j = 0; j < 5; j++) {
                pickCard(deck, pile, i, j, input);
            }
            deck.add(i, pile);
        }
    }

    public static void pickCard(ArrayList<ArrayList<Cards>> deck, ArrayList<Cards> pile, int i, int j, Scanner input) {
        System.out.print("Pile #" + (i + 1) + ": Enter the abbreviation of card " + (j + 1) + " on pile " + (i + 1) + " (Enter R for a random card): ");
        String card = input.next().toUpperCase();
        if (card.equals("R")) {
            card = AI.selectCard();
        }
        if (card.equals("DA")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                System.out.print("\nA crown card is needed on the bottom of at least one pile. Please put a crown card on this pile.\n");
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (DACount == 5) {
                    System.out.print("\nYou have no more Dagger cards remaining. Please try again.\n");
                    pickCard(deck, pile, i, j, input);
                }
                else {
                    pile.add(j, new Dagger());
                    DACount++;
                }
            }
        }
        else if (card.equals("SW")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                System.out.print("\nA crown card is needed on the bottom of at least one pile. Please put a crown card on this pile.\n");
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (SWCount == 5) {
                    System.out.print("\nYou have no more Sword cards remaining. Please try again.\n");
                    pickCard(deck, pile, i, j, input);
                }
                else {
                    pile.add(j, new Sword());
                    SWCount++;
                }
            }
        }
        else if (card.equals("MS")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                System.out.print("\nA crown card is needed on the bottom of at least one pile. Please put a crown card on this pile.\n");
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (MSCount == 3) {
                    System.out.print("\nYou have no more Morning Star cards remaining. Please try again.\n");
                    pickCard(deck, pile, i, j, input);
                }
                else {
                    pile.add(j, new MorningStar());
                    MSCount++;
                }
            }
        }
        else if (card.equals("WA")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                System.out.print("\nA crown card is needed on the bottom of at least one pile. Please put a crown card on this pile.\n");
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (WACount == 3) {
                    System.out.print("\nYou have no more War Axe cards remaining. Please try again.\n");
                    pickCard(deck, pile, i, j, input);
                }
                else {
                    pile.add(j, new WarAxe());
                    WACount++;
                }
            }
        }
        else if (card.equals("HA")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                System.out.print("\nA crown card is needed on the bottom of at least one pile. Please put a crown card on this pile.\n");
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (HACount == 2) {
                    System.out.print("\nYou have no more Halberd cards remaining. Please try again.\n");
                    pickCard(deck, pile, i, j, input);
                }
                else {
                    pile.add(j, new Halberd());
                    HACount++;
                }
            }
        }
        else if (card.equals("LS")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                System.out.print("\nA crown card is needed on the bottom of at least one pile. Please put a crown card on this pile.\n");
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (LSCount == 2) {
                    System.out.print("\nYou have no more Longsword cards remaining. Please try again.\n");
                    pickCard(deck, pile, i, j, input);
                }
                else {
                    pile.add(j, new LongSword());
                    LSCount++;
                }
            }
        }
        else if (card.equals("AR")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                System.out.print("\nA crown card is needed on the bottom of at least one pile. Please put a crown card on this pile.\n");
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (ARCount == 2) {
                    System.out.print("\nYou have no more Archer cards remaining. Please try again.\n");
                    pickCard(deck, pile, i, j, input);
                }
                else {
                    pile.add(j, new Archer());
                    ARCount++;
                }
            }
        }
        else if (card.equals("SH")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                System.out.print("\nA crown card is needed on the bottom of at least one pile. Please put a crown card on this pile.\n");
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (SHCount == 2) {
                    System.out.print("\nYou have no more Shield cards remaining. Please try again.\n");
                    pickCard(deck, pile, i, j, input);
                }
                else {
                    pile.add(j, new Shield());
                    SHCount++;
                }
            }
        }
        else if (card.equals("CR")) {
            if (CRCount == 1) {
                System.out.print("\nYou have no more Crown cards remaining. Please try again.\n");
                pickCard(deck, pile, i, j, input);
            }
            else if (j != 0) {
                System.out.print("\nYou must put a Crown card on the bottom of a pile. Please try again.\n");
                pickCard(deck, pile, i, j, input);

            }
            else {
                pile.add(j, new Crown());
                CRCount++;
            }
        }
        else {
            System.out.print("\nPlease enter a valid card.\n");
            pickCard(deck, pile, i, j, input);
        }
    }

    public static void playerTurn(ArrayList<ArrayList<Cards>> deck, ArrayList<ArrayList<Cards>> deck2) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please select a pile from your deck (1-5): ");
        int selection = 0;
        if (input.hasNextInt()) {
            selection = input.nextInt();
        }
        else {
            System.out.println("\nPlease enter a valid input.");
            playerTurn(deck, deck2);
        }
        if (selection > 5 || selection < 1) {
            System.out.println("\nPlease pick an existing pile.");
            playerTurn(deck, deck2);
        }
        else {
            if (deck.get(selection - 1).size() == 0) {
                System.out.println("\nThis pile has no more cards remaining. Please try again.");
                playerTurn(deck, deck2);
            }
            else {
                playerCommand(selection, deck, deck2);
            }
        }
    }

    public static void playerCommand(int selection, ArrayList<ArrayList<Cards>> deck, ArrayList<ArrayList<Cards>> deck2) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type (AT) if you would like to attack or (DC) if you would like to discard: ");
        String command = input.next().toUpperCase();
        if (command.equals("AT")) {
            opponentPile(selection, deck, deck2);
        }
        else if (command.equals("DC")) {
            if (deck.get(selection - 1).size() == 0) {
                System.out.println("\nThis pile has no more cards remaining. Please try again.");
                playerTurn(deck, deck2);
            }
            else if (deck.get(selection - 1).get(deck.get(selection - 1).size() - 1).getAbbreviation() == "CR") {
                System.out.println("\nA crown cannot be discarded. Please try again.");
                playerTurn(deck, deck2);
            }
            else {
                Moves.discard(deck.get(selection - 1).get(deck.get(selection - 1).size() - 1));
                System.out.println("\n" + deck.get(selection - 1).get(deck.get(selection - 1).size() - 1).getName() + " card has been successfully discarded from the top of the pile.");
            }
        }
        else {
            System.out.println("\nThis command does not exist. Please try again.");
            playerCommand(selection, deck, deck2);
        }
    }


    public static void opponentPile(int selection, ArrayList<ArrayList<Cards>> deck, ArrayList<ArrayList<Cards>> deck2) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please select a pile from the opponent's deck: ");
        int target = input.nextInt();
        if (target > 5 || target < 1) {
            System.out.println("\nPlease pick an existing pile.");
            opponentPile(selection, deck, deck2);
        }
        else if (deck.get(target - 1).size() == 0) {
            System.out.println("\nThis pile has no more cards remaining. Please try again.");
            opponentPile(selection, deck, deck2);
        }
        else {
            Cards card = deck.get(selection - 1).get(deck.get(selection - 1).size() - 1);
            Cards card2 = deck2.get(target - 1).get(deck2.get(target - 1).size() - 1);
            Moves.attack(card, card2);
            if (card.getStatus() == -1 && card2.getStatus() == -1) {
                System.out.println("\nYour " + card.getName() + " card and the opponent's " + card2.getName() + " card have both been discarded.");
            }
            else if (card.getStatus() == -1) {
                System.out.println("\nYour " + card.getName() + " card has been defeated by the opponent's " + card2.getName() + " card.");
            }
            else if (card2.getStatus() == -1) {
                System.out.println("\nYour " + card.getName() + " card has successfully killed the opponent's " + card2.getName() + " card.");
            }
            else {
                System.out.println("\nNeither your " + card.getName() + " card nor the opponent's " + card2.getName() + " card were discarded.");
            }
        }
    }

    public static void removeAllDead(ArrayList<ArrayList<Cards>> deck, ArrayList<ArrayList<Cards>> deck2) {
        int i, j;
        for (i = 0; i < 5; i++) {
            int remaining = deck.get(i).size();
            for (j = 0; j < remaining; j++) {
                if (deck.get(i).get(j).getStatus() == -1 && deck.get(i).get(j).getAbbreviation().equals("CR")) {
                    setCRCount(0);
                    deck.get(i).remove(j);
                }
                else if (deck.get(i).get(j).getStatus() == -1) {
                    deck.get(i).remove(j);
                }
            }
        }
        for (i = 0; i < 5; i++) {
            int remaining = deck2.get(i).size();
            for (j = 0; j < remaining; j++) {
                if (deck2.get(i).get(j).getStatus() == -1 && deck2.get(i).get(j).getAbbreviation().equals("CR")) {
                    AI.setCRCount(0);
                    deck2.get(i).remove(j);
                }
                else if (deck2.get(i).get(j).getStatus() == -1) {
                    deck2.get(i).remove(j);
                }
            }
        }
    }

    public static void showRemaining(ArrayList<ArrayList<Cards>> deck) {
        int i, j;
        for (i = 0; i < 5; i++) {
            System.out.print("Pile " + (i + 1) + ": ");
            if (deck.get(i).size() == 0) {
                System.out.println();
            }
            else {
                for (j = 0; j < deck.get(i).size(); j++) {
                    System.out.print(deck.get(i).get(j).getAbbreviation() + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

}
