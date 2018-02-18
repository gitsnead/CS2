/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author ryanw
 */
public class Menu {

    private Contact people;

    public Menu() {
        this.people = new Contact();
    }

    private String input(String prompt, Scanner reader) {
        System.out.print(prompt);
        return reader.nextLine();
    }

    private String white(int space) {
        String spacing = "";
        for (int i = 0; i < space; i++) {
            spacing += " ";
        }
        return spacing;
    }

    private void printNumbers(ArrayList<String> numbers, int spaces) {
        if (numbers.isEmpty()) {
            System.out.println("  not found");
        }
        for (String number : numbers) {
            System.out.println(white(spaces) + number);
        }
    }

    private void printPersonInfo(String name) {
        if (this.people.hasInfo(name)) {
            System.out.println(this.people.searchAddressbyPerson(name));
            if (this.people.getPhones().containsKey(name)) {
                System.out.println("  phone numbers:");
                printNumbers(this.people.searchNumbersByPerson(name), 3);
            } else {
                System.out.println("  phone number not found");
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void addNumber(Scanner reader) {
        String name = input("whose number: ", reader);
        String phone = input("number: ", reader);
        this.people.addPhone(name, phone);
    }

    public void searchPerson(Scanner reader) {
        String name = input("whose number: ", reader);
        this.printNumbers(people.searchNumbersByPerson(name), 1);
    }

    public void searchNumber(Scanner reader) {
        String number = input("number: ", reader);
        System.out.print(this.people.searchPersonByNumber(number));
    }

    public void addAddress(Scanner reader) {
        String name = input("whose address: ", reader);
        String street = input("street: ", reader);
        String city = input("city: ", reader);
        this.people.addAddress(name, street, city);
    }

    public void searchPersonInfo(Scanner reader) {
        String name = input("whose information: ", reader);
        this.printPersonInfo(name);
    }

    public void deleteContact(Scanner reader) {
        String name = input("whose information: ", reader);
        this.people.getPhones().remove(name);
        this.people.getHome().remove(name);
    }

    public void filteredSearch(Scanner reader) {
        String term = input("keyword (if empty, all listed): ", reader);
        HashSet<String> peopleHits = this.people.searchKeyword(term);
        if (peopleHits.isEmpty()) {
            System.out.println("");
            System.out.println("keyword not found");
        } else {
            List<String> peopleHitsSorted = new ArrayList<String>(peopleHits);
            Collections.sort(peopleHitsSorted);
            for (String name : peopleHitsSorted) {
                System.out.println("");
                System.out.println(" " + name);
                this.printPersonInfo(name);
            }
        }
    }
}
