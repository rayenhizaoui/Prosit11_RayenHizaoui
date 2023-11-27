public class Departement {


    int id;
    String nom_dep;
    int nbr_emp;

    public Departement(int id, String nom_dep, int nbr_emp) {
        this.id = id;
        this.nom_dep = nom_dep;
        this.nbr_emp = nbr_emp;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public void setNbr_emp(int nbr_emp) {
        this.nbr_emp = nbr_emp;
    }

    public int getId() {
        return id;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public int getNbr_emp() {
        return nbr_emp;
    }




    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom_dep='" + nom_dep + '\'' +
                ", nbr_emp='" + nbr_emp + '\'' +
                '}';
    }










}
