package co.leomedina;

import co.leomedina.model.Senate;
import co.leomedina.model.Senator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Generator {
    private BufferedReader mReader;
    private Senate senate;
    private HashMap<String, String> mMenu;

    public Generator(Senate senate) {
        this.senate = senate;
        mReader = new BufferedReader(new InputStreamReader(System.in));
        mMenu = new HashMap<String, String>();
        generateMenu();
    }

    private void generateMenu() {
        mMenu.put("Add", "Add Senator");
        mMenu.put("Quit", "Quit the program");
    }

    private void run() {
        String option = "";

        do try {
            option = promptForAction();
            switch (option) {
                case "add":
                    senate.addSenator(promptForSenator());
                    break;
                case "quit":
                    System.out.println("Thanks for playing! ");
                    break;
                default:
                    System.out.println("Invalid answer, Try again! ");
            }

        } catch (IOException ioe) {
            System.out.println("Invalid Answer");
            ioe.printStackTrace();
        } while (true);
    }

    private String promptForAction() throws IOException {
        System.out.printf("There %d options available: %nn", mMenu.size());
        for (Map.Entry<String, String> option : mMenu.entrySet()) {
            System.out.printf("%s - %s%n", option.getValue(), option.getValue());
        }
        System.out.println("What do you want to do? ");
        return mReader.readLine().trim().toLowerCase();
    }

    private Senator promptForSenator() throws IOException {
        System.out.println("What is the first name of the Senator? ");
        String firstName = mReader.readLine();
        System.out.println("what is the last name of the Senator? ");
        String lastName = mReader.readLine();
        System.out.println("What is state are they from? ");
        String state = mReader.readLine();
        System.out.println("What political party are they a part of? ");
        char party = (char) mReader.read();
        return new Senator(firstName, lastName, state, party);
    }
}
