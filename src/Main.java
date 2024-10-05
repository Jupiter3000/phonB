import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

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
            case 1 -> System.out.println("List");
            case 2 -> System.out.println("Add");
            case 3 -> System.out.println("Delete");
            case 4 -> System.out.println("Update");
            case 5 -> System.out.println("Search");
            case 6 -> System.out.println("Exit");

        }


    }
}