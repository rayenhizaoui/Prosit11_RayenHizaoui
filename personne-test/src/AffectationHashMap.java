import java.util.*;

public class AffectationHashMap {



    private Map<Employe, Departement> employeeDepartments;

    public AffectationHashMap() {
        employeeDepartments = new HashMap<>();
    }


    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employeeDepartments.put(e, d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(employeeDepartments);
        return sortedMap;
    }

    public boolean rechercherDepartement(Departement d) {
        return employeeDepartments.containsValue(d);
    }

    public boolean rechercherEmploye(Employe e) {
        return employeeDepartments.containsKey(e);
    }

    public void supprimerEmploye(Employe e) {
        employeeDepartments.remove(e);
    }


    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        Iterator<Map.Entry<Employe, Departement>> iterator = employeeDepartments.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Employe, Departement> entry = iterator.next();
            Employe employee = entry.getKey();
            Departement department = entry.getValue();

            if (employee.equals(e) && department.equals(d)) {
                iterator.remove();
                System.out.println("Employee " + e.getNom() + " in department " + d.getNom_dep() + " removed successfully");
            }
        }
    }


    public void afficherEmployes() {
        System.out.println("List of Employees:");
        for (Employe employee : employeeDepartments.keySet()) {
            System.out.println(employee.getNom());
        }
    }





    public void afficherEmployesEtDepartements() {
        System.out.println("List of Employees and their Departments:");
        for (Map.Entry<Employe, Departement> entry : employeeDepartments.entrySet()) {
            Employe employee = entry.getKey();
            Departement department = entry.getValue();
            System.out.println("Employee: " + employee.getNom() + " - Department: " + department.getNom_dep());
        }

    }

        public void afficherDepartements() {
            System.out.println("List of Departments:");
            Set<String> departmentNames = new HashSet<>();
            for (Departement department : employeeDepartments.values()) {
                departmentNames.add(department.getNom_dep());
            }
            for (String departmentName : departmentNames) {
                System.out.println(departmentName);
            }
        }










/*
    //HashMap<Employe, Departement> Aff = new HashMap<Employe, Departement>();

  void ajouterEmployeDepartement(Employe e, Departement d) {
      Aff.put(e,d);

  }

  void afficherEmployesEtDepartements(
          for( Employe employe: Aff) {
        System.out.println("key: " + i + " value: " + Departement.get(i));}
*/












}

