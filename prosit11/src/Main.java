import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectationHashMap = new AffectationHashMap();

        Employe emp1 = new Employe("Alice", 1);
        Employe emp2 = new Employe("Bob", 2);
        Departement dep1 = new Departement("HR");
        Departement dep2 = new Departement("Finance");

        // Add employees to departments
        affectationHashMap.ajouterEmployeDepartement(emp1, dep1);
        affectationHashMap.ajouterEmployeDepartement(emp2, dep2);

        // Display employees and departments
        affectationHashMap.afficherEmployesEtDepartements();

        // Try adding same employee to a different department
        affectationHashMap.ajouterEmployeDepartement(emp1, dep2);
        affectationHashMap.afficherEmployesEtDepartements(); // Check result

        // Remove employee
        affectationHashMap.supprimerEmploye(emp2);
        affectationHashMap.afficherEmployesEtDepartements();

        // Search for an employee and department
        System.out.println(affectationHashMap.rechercherEmploye(emp1)); // true
        System.out.println(affectationHashMap.rechercherDepartement(dep1)); // true

        // Display sorted employees
        TreeMap<Employe, Departement> sortedMap = affectationHashMap.trierMap();
        for (Map.Entry<Employe, Departement> entry : sortedMap.entrySet()) {
            System.out.println("Sorted Employe: " + entry.getKey().getNom() + " - Department: " + entry.getValue().getNom());
        }
    }
}
