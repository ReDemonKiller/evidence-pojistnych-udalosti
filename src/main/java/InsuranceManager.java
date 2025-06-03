import java.util.ArrayList;
import java.util.List;

// Třída pro správu pojištěných
public class InsuranceManager {
    // Kolekce pro uložení pojištěných
    private List<InsuredPerson> insuredList;

    // Konstruktor inicializuje prázdný seznam
    public InsuranceManager() {
        insuredList = new ArrayList<>();
    }

    // Přidání pojištěného do kolekce
    public void addInsured(InsuredPerson person) {
        insuredList.add(person);
        System.out.println("Pojištěný přidán: " + person);
    }

    // Výpis všech pojištěných
    public void displayAllInsured() {
        if (insuredList.isEmpty()) {
            System.out.println("Žádní pojištění nejsou v evidenci.");
        } else {
            System.out.println("Seznam pojištěných:");
            insuredList.forEach(System.out::println);

        }
    }

    // Vyhledání pojištěného podle jména a příjmení
    public void findInsured(String firstName, String lastName) {
        boolean found = false;
        for (InsuredPerson person : insuredList) {
            if (person.getFirstName().equalsIgnoreCase(firstName.trim()) &&
                person.getLastName().equalsIgnoreCase(lastName.trim())) {
                System.out.println("Nalezen: " + person);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Pojištěný " + firstName + " " + lastName + " nebyl nalezen.");
        }
    }
}