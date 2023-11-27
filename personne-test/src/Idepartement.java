import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public interface Idepartement <T>{

        public void ajouterDepartement(T t);
        public boolean rechercherDepartement(String nom);
        public boolean rechercherDepartement(T t);
        public void supprimerDepartement(T t);
        public void displayDepartement();
        public TreeSet<T> trierDepartementById();
    }




