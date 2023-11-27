import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SocieteHashSet implements Idepartement<Departement>{

    Set<Departement> deps;

    public SocieteHashSet(){

        deps = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        deps.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return false;
    }

    /*
        @Override
        public boolean rechercherDepartement(String nom_dep) {

            if (deps.contains(rechercherDepartement())) {
                System.out.println("Departement " + nom_dep + " a été trouvée !");
            } else {
                System.out.println("Departement " + nom_dep + " n'a pas été trouvée.");
            }
            return false;
        }
    */
    @Override
    public boolean rechercherDepartement(Departement departement) {
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {

    }

    @Override
    public void displayDepartement() {

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return null;
    }
}
