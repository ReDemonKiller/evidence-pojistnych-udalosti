package main.java;

/**
 * Třída reprezentující pojištěnou osobu.
 * Obsahuje informace o jménu, příjmení, věku a telefonním čísle.
 * Provádí validaci vstupních dat při vytváření instance.
 */
public class InsuredPerson {

    // Privátní atributy
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    // Konstruktor s validací prázdného jména a příjmení
    /**
     * Vytvoří instanci pojištěné osoby.
     *
     * @param firstName jméno osoby, nesmí být prázdné
     * @param lastName příjmení osoby, nesmí být prázdné
     * @param age věk osoby, musí být v rozmezí 0–128
     * @param phoneNumber telefonní číslo osoby
     * @throws IllegalArgumentException pokud jsou vstupní data neplatná
     */
    public InsuredPerson(String firstName, String lastName, int age, String phoneNumber) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Jméno nesmí být prázdné.");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Příjmení nesmí být prázdné.");
        }
        if (age < 0 || age > 128) {
            throw new IllegalArgumentException("Věk musí být v rozmezí 0–128.");
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