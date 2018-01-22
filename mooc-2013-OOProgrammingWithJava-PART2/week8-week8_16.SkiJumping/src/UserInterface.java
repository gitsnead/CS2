/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class UserInterface {

    private Scanner reader;

    public UserInterface(Scanner input) {
        this.reader = input;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        Roster roster = new Roster();
        while (true) {
            System.out.print("  Participant name: ");
            String participant = this.reader.nextLine();
            if (participant.isEmpty()) {
                break;
            }
            roster.add(participant);
        }
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        String exec = "jump";
        int round = 0;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            exec = this.reader.nextLine();
            System.out.println("");
            if (!exec.contentEquals("jump")) {
                break;
            }
            round++;
            System.out.println("Round " + round);
            System.out.println("");
            this.jumpsOrder(roster);
            System.out.println("");
            System.out.println("Results of round " + round);
            this.jumpsResults(roster);
        }
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        this.tournamentFinal(roster);
    }

    public void jumpsOrder(Roster jumpers) {
        Collections.sort(jumpers.getList());
        System.out.println("Jumping order:");
        for (int i = 0; i < jumpers.getList().size(); i++) {
            System.out.println("  " + (i + 1) + ". " + jumpers.getList().get(i));
        }
    }

    public void jumpsResults(Roster jumpers) {
        Random random = new Random();

        for (Jumper jumper : jumpers.getList()) {
            System.out.println("  " + jumper.getName());
            int jump = random.nextInt(60) + 60;
            System.out.println("    length: " + jump);
            jumper.addLength(jump + " m");
            ArrayList<Integer> votes = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++) {
                votes.add(random.nextInt(10) + 10);
            }
            System.out.println("    judge votes: " + votes);
            jumper.addScore(jump);
            Collections.sort(votes);
            for (int i = 0; i < votes.size(); i++) {
                if (i > 0 && i < 4) {
                    jumper.addScore(votes.get(i));
                }
            }
        }
        System.out.println("");
    }

    public void tournamentFinal(Roster jumpers) {
        Collections.sort(jumpers.getList());
        Collections.reverse(jumpers.getList());
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int i = 1;
        for (Jumper jumper : jumpers.getList()) {
            System.out.println(i + "           " + jumper);
            System.out.println("            " + "jump lengths: " + jumper.printLengths());
            i++;
        }
    }
}
