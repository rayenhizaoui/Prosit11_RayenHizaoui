import java.util.Comparator;
        import java.util.HashSet;
        import java.util.Set;
        import java.util.TreeSet;
public class testtt {


    public static void main(String[] arg){






        AffectationHashMap affectationMap = new AffectationHashMap();


        Employe employee1 = new Employe(1,1,"nom1","prenom1","it1");
        Employe employee2 = new Employe(2,2,"nom2","prenom2","it2");
        Employe employee3 = new Employe(3,3,"nom3","prenom3","it3");
        Employe employee4 = new Employe(4,4,"nom4","prenom4","it4");
        Employe employee5 = new Employe(5,5,"nom5","prenom5","it5");

        Departement dept1 = new Departement(1,"dep1",1);
        Departement dept2 = new Departement(2,"dep2",2);
        Departement dept3 = new Departement(3,"dep3",3);



        System.out.println(affectationMap);

        affectationMap.ajouterEmployeDepartement(employee1,dept1);
        affectationMap.ajouterEmployeDepartement(employee2,dept1);
        affectationMap.ajouterEmployeDepartement(employee3,dept1);
        affectationMap.afficherEmployesEtDepartements();
        affectationMap.supprimerEmploye(employee1);
        affectationMap.supprimerEmploye(employee1);
        affectationMap.afficherEmployesEtDepartements();
        affectationMap.supprimerEmployeEtDepartement(employee2,dept1);
        affectationMap.afficherEmployesEtDepartements();
        System.out.println(affectationMap.rechercherEmploye(employee4));
        System.out.println(affectationMap.rechercherEmploye(employee3));

    }





























 /*   HashMap<Employe, Departement> testtt = new HashMap<Employe, Departement>();


    // Add keys and values (Name, Age)
    testtt.put(1, 32);
    testtt.put(2, 30);
    testtt.put(3, 33);
*/










}