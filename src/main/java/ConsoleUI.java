package main.java;

import java.util.Scanner;

// Třída pro uživatelské rozhraní
public class ConsoleUI {
    private InsuranceManager manager;
    private Scanner scanner;

    // Konstruktor inicializuje správce a scanner
    public ConsoleUI() {
        manager = new InsuranceManager();
        scanner = new Scanner(System.in);
    }

    // Hlavní smyčka aplikace
    public void start() {
        while (true) {
            displayMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addInsured();
                    break;
                case "2":
                    displayAllInsured();
                    break;
                case "3":
                    findInsured();
                    break;
                case "4":
                    System.out.println("Děkujeme za použití aplikace. Konec.");
                    return;
                default:
                    System.out.println("Neplatná volba, zadejte 1–4.");
            }
        }
    }

    // Zobrazení menu
    private void displayMenu() {
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("---------------------------------");
        System.out.println("1. Přidat nového pojištěného");
        System.out.println("2. Vypsat všechny pojištěné");
        System.out.println("3. Vyhledat pojištěného");
        System.out.println("4. Ukončit aplikaci");
        System.out.println();
        System.out.print("Zadejte volbu: ");
    }

    // Metoda pro pozastavení programu a čekání na vstup uživatele
    private void pause() {
        System.out.println();
        System.out.println("Pokračujte libovolnou klávesou...");
        scanner.nextLine();
    }

    // Metoda pro přidání pojištěného
    private void addInsured() {
        try {
            System.out.print("Zadejte jméno: ");
            String firstName = scanner.nextLine();
            System.out.print("Zadejte příjmení: ");
            String lastName = scanner.nextLine();
            System.out.print("Zadejte věk: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Zadejte telefonní číslo: ");
            String phoneNumber = scanner.nextLine();

            InsuredPerson person = new InsuredPerson(firstName, lastName, age, phoneNumber);
            manager.addInsured(person);
            pause();
        } catch (NumberFormatException e) {
            System.out.println("Chyba: Věk musí obsahovat pouze číslice.");
        } catch (IllegalArgumentException e) {
            System.out.println("Chyba: " + e.getMessage());
        }
    }

    // Metoda pro vypsání všech pojištěných
    private void displayAllInsured() {
        manager.displayAllInsured();
        pause();
    }

    // Metoda pro vyhledání pojištěného
    private void findInsured() {
        System.out.print("Zadejte jméno: ");
        String firstName = scanner.nextLine();
        System.out.print("Zadejte příjmení: ");
        String lastName = scanner.nextLine();
        manager.findInsured(firstName, lastName);
        pause();
    }
}