/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ryanw
 */
public class Menu {

    private Map<String, List<String>> phones = new HashMap<String, List<String>>();
    private Map<String, List<String>> names = new HashMap<String, List<String>>();

    public void addNumber(Scanner reader) {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String phone = reader.nextLine();
        if (this.phones.containsKey(name)) {
            this.phones.get(name).add(phone);
        } else {
            this.phones.put(name, new ArrayList());
            this.phones.get(name).add(phone);
        }
        if (this.names.containsKey(phone)) {
            this.names.get(phone).add(name);
        } else {
            this.names.put(phone, new ArrayList());
            this.names.get(phone).add(name);
        }
    }

    public void searchPerson(Scanner reader) {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        if (this.phones.containsKey(name)) {
            List<String> numbers = this.phones.get(name);
            for (int i = 0; i < this.phones.get(name).size(); i++) {
                System.out.println(this.phones.get(name).get(i));
            }
        } else {
            System.out.println("not found");
        }
    }

    public void searchNumber(Scanner reader) {
        System.out.print("number: ");
        String number = reader.nextLine();
        if (this.names.containsKey(number)) {
            List<String> phones = this.names.get(number);
            for (int i = 0; i < this.names.get(number).size(); i++) {
                System.out.println(this.names.get(number).get(i));
            }
        } else {
            System.out.println("not found");
        }
    }
}
