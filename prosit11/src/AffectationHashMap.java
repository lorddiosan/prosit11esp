import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // 2. ajouterEmployeDepartement method
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    // 3. afficherEmployesEtDepartements method
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employe: " + entry.getKey().getNom() + " - Departement: " + entry.getValue().getNom());
        }
    }

    // 4. supprimerEmploye method
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // 5. supprimerEmployeEtDepartement method
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    // 6. afficherEmployes method
    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println("Employe: " + e.getNom());
        }
    }

    // 7. afficherDepartements method
    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println("Departement: " + d.getNom());
        }
    }

    // 8. rechercherEmploye method
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // 9. rechercherDepartement method
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // 10. trierMap method
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
