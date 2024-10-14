import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[][] contacts = new String[100][3];
    static int size = 0;

    public static void main(String[] args) {
        showMenue();
    }

    public static void showMenue() {
        System.out.println("***Menue***");
        int item = 0;
        do {
            System.out.println("1.List contact");
            System.out.println("2.Add contact");
            System.out.println("3.Delete contact");
            System.out.println("4.Update contact");
            System.out.println("5.Search contact");
            System.out.println("6.Exit");
            System.out.println("Please choose an item");
            item = scanner.nextInt();
        }
        while (item > 5 || item < 1);
        switch (item) {
            case 1 -> showList();
            case 2 -> Add();
            case 3 -> Delete();
            case 4 -> update();
            case 5 -> search();
            case 6 -> System.exit(0);
        }
        showMenue();
    }

    public static void showList() {
        System.out.println("***List***");
        if (size == 0) {
            System.out.println("List is emoty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            printContacts(i);
        }

    }

    public static void Add() {
        System.out.println("***Add***");
        if (size == 100) {
            System.out.println("List is full");
            return;
        }
        scanner.nextLine();
        System.out.print("Enter name :");
        contacts[size][0] = scanner.next();
        System.out.println("Enter phone number :");
        contacts[size][1] = scanner.next();
        System.out.println("Enter address :");
        contacts[size][2] = scanner.next();
        size++;
        System.out.println("Contact added successfully");
    }

    public static void Delete() {
        System.out.println("***Delete***");
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.next();
        int index = findContact(phoneNumber);
        if (index == -1) {
            System.out.println("phoneNumber not found");
            return;
        }
        shift(index);
        size--;
        System.out.println("Contact deleted successfully");


    }

    public static int findContact(String phoneNumber) {
        for (int i = 0; i < size; i++) {
            if (contacts[i][0].equals(phoneNumber))
                return i;
        }
        return -1;
    }

    public static void shift(int index) {
        for (int i = index; i < 100 - 1; i++) {
            contacts[i][0] = contacts[i + 1][0];
            contacts[i][1] = contacts[i + 1][1];
            contacts[i][2] = contacts[i + 1][2];
        }
        contacts[99][0] = null;
        contacts[99][1] = null;
        contacts[99][2] = null;
    }

    public static void search() {
        System.out.println("***Search***");
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        scanner.nextLine();
        System.out.println("Enter phone number :");
        String phoneNumber = scanner.next();
        int index = findContact(phoneNumber);
        if (index == -1) {
            System.out.println("phoneNumber not found");
            return;
        }

    }

    public static void printContacts(int index) {
        System.out.println("Name: " + contacts[index][0]);
        System.out.println("Phone number: " + contacts[index][1]);
        System.out.println("Address: " + contacts[index][2]);
        System.out.println("-----------------");

    }

    public static void update() {
        System.out.println("***Update***");
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        scanner.nextLine();
        System.out.println("Enter phone number :");
        String phoneNumber = scanner.next();
        int index = findContact(phoneNumber);
        if (index == -1) {
            System.out.println("phoneNumber not found");
            return;
        }
        System.out.print("Enter name:");
        contacts[index][0] = scanner.nextLine();
        System.out.print("Enter address:");
        contacts[index][2] = scanner.nextLine();
        System.out.println("update phonenumber successfully");
    }
    public static void search2() {
        System.out.println("***Search2***");

    }
}