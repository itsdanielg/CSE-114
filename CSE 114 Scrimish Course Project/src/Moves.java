// Daniel Garcia
// SBU ID: *********
// CSE 114
// Scrimish Course Project

public class Moves {

    //Attack command
    public static void attack(Cards attacker, Cards defender) {
        if (attacker.getType().equals("NORMAL")) {
            if (defender.getType().equals("NORMAL")) {
                if (attacker.getValue() > defender.getValue()) {
                    defender.setStatus(-1);
                }
                else if (attacker.getValue() < defender.getValue()) {
                    attacker.setStatus(-1);
                }
                else {
                    attacker.setStatus(-1);
                    defender.setStatus(-1);
                }
            }
            else {
                if (!(defender.getAbbreviation().equals("SH"))) {
                    defender.setStatus(-1);
                }
                else {
                    defender.setStatus(-1);
                    attacker.setStatus(-1);
                }
            }
        }
        else {
            if (attacker.getAbbreviation().equals("AR")) {
                if (!(defender.getAbbreviation().equals("SH"))) {
                    defender.setStatus(-1);
                }
                else {
                    attacker.setStatus(1);
                    defender.setStatus(1);
                }
            }
            else if (attacker.getAbbreviation().equals("SH")) {
                System.out.print("\nFailed to attack with the shield.");
            }
            else {
                if (!(defender.getAbbreviation().equals("CR"))) {
                    attacker.setStatus(-1);
                }
                else {
                    defender.setStatus(-1);
                }
            }
        }
    }

    //Discard command
    public static void discard(Cards card) {
        card.setStatus(-1);
    }

}
