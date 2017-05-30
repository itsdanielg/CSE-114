// Daniel Garcia
// SBU ID: *********
// CSE 114
// Scrimish Course Project

import java.util.Scanner;
import java.util.ArrayList;

public class AI {

    private static int DACount = 0;
    private static int SWCount = 0;
    private static int MSCount = 0;
    private static int WACount = 0;
    private static int HACount = 0;
    private static int LSCount = 0;
    private static int ARCount = 0;
    private static int SHCount = 0;
    private static int CRCount = 0;
    private static int SHOW = 1;


    public static void setSHOW(int choice) {
        SHOW = choice;
    }

    public static int getCRCount() {
        return CRCount;
    }

    public static void setCRCount(int count) {
        CRCount = count;
    }

    public static void createOpponentDeck(ArrayList<ArrayList<Cards>> deck) {
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
        String card = selectCard();
        if (card.equals("DA")) {
            if (CRCount == 0 && i == 4 && j == 0) {
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (DACount == 5) {
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
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (SWCount == 5) {
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
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (MSCount == 3) {
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
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (WACount == 3) {
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
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (HACount == 2) {
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
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (LSCount == 2) {
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
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (ARCount == 2) {
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
                pickCard(deck, pile, i, j, input);
            }
            else {
                if (SHCount == 2) {
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
                pickCard(deck, pile, i, j, input);
            }
            else if (j != 0) {
                pickCard(deck, pile, i, j, input);

            }
            else {
                pile.add(j, new Crown());
                CRCount++;
            }
        }
    }

    public static void opponentTurn(ArrayList<ArrayList<Cards>> deck, ArrayList<ArrayList<Cards>> deck2) {
        int selection = selectPile();
        if (deck.get(selection - 1).size() == 0) {
            opponentTurn(deck, deck2);
        }
        else {
            opponentCommand(selection, deck, deck2);
        }
    }

    public static void opponentCommand(int selection, ArrayList<ArrayList<Cards>> deck, ArrayList<ArrayList<Cards>> deck2) {
        String command = selectCommand();
        if (command.equals("AT")) {
            playerPile(selection, deck, deck2);
        }
        else {
            if (deck.get(selection - 1).size() == 0) {
                opponentTurn(deck, deck2);
            }
            else if (deck.get(selection - 1).get(deck.get(selection - 1).size() - 1).getAbbreviation() == "CR") {
                opponentTurn(deck, deck2);
            }
            else {
                Moves.discard(deck.get(selection - 1).get(deck.get(selection - 1).size() - 1));
                System.out.println(deck.get(selection - 1).get(deck.get(selection - 1).size() - 1).getName() + " card has been successfully discarded from the top of the opponent's pile " + selection + ".");
            }
        }
    }


    public static void playerPile(int selection, ArrayList<ArrayList<Cards>> deck, ArrayList<ArrayList<Cards>> deck2) {
        int target = selectPile();
        if (deck.get(target - 1).size() == 0) {
            playerPile(selection, deck, deck2);
        }
        else {
            Cards card = deck.get(selection - 1).get(deck.get(selection - 1).size() - 1);
            Cards card2 = deck2.get(target - 1).get(deck2.get(target - 1).size() - 1);
            Moves.attack(card, card2);
            if (card.getStatus() == -1 && card2.getStatus() == -1) {
                System.out.println("The opponent's " + card.getName() + " card and your " + card2.getName() + " card have both been discarded.");
            }
            else if (card.getStatus() == -1) {
                System.out.println("The opponent's " + card.getName() + " card has been defeated by your " + card2.getName() + " card.");
            }
            else if (card2.getStatus() == -1) {
                System.out.println("The opponent's " + card.getName() + " card has successfully killed your " + card2.getName() + " card.");
            }
            else {
                System.out.println("Neither the opponent's " + card.getName() + " card nor your " + card2.getName() + " card were discarded.");
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
                    Player.setCRCount(0);
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
        if (SHOW != 0) {
            for (i = 0; i < 5; i++) {
                System.out.print("Pile " + (i + 1) + ": ");
                if (deck.get(i).size() == 0) {
                    System.out.println();
                }
                else {
                    for (j = 0; j < deck.get(i).size(); j++) {
                        System.out.print("FD ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
        else {
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

    public static String selectCard() {
        int choice = (int) (Math.random() * 9);
        if (choice == 0) return "DA";
        else if (choice == 1) return "SW";
        else if (choice == 2) return "MS";
        else if (choice == 3) return "WA";
        else if (choice == 4) return "HA";
        else if (choice == 5) return "LS";
        else if (choice == 6) return "AR";
        else if (choice == 7) return "SH";
        else return "CR";
    }

    public static int selectPile() {
        return (int) (1 + Math.random() * 5);
    }

    public static String selectCommand() {
        int choice = (int) (Math.random() * 4);
        if (choice > 0) {
            return "AT";
        }
        else {
            return "DC";
        }
    }

}
