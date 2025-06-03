package main.java;

// Třída reprezentující pojištěnou osobu
public class InsuredPerson {

    // Privátní atributy
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    // Konstruktor s validací prázdného jména a příjmení
    public InsuredPerson(String firstName, String lastName, int age, String phoneNumber) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Jméno nesmí být prázdné.");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Příjmení nesmí být prázdné.");
        }
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.age = age;
        this.phoneNumber = phoneNumber.trim();
    }

    // Gettery pro přístup k atributům
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Přepsaná metoda toString pro formátovaný výpis
    @Override
    public String toString() {
        return String.format("%s %s, věk: %d, telefon: %s", firstName, lastName, age, phoneNumber);
    }
}