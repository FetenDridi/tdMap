package org.example.tdmap;

public class Test {
    public static void main(String[] args) {

        InterfaceSociete societeHashMap = new SocieteHashMap();

        Employe employe1 = new Employe("12345678", "M1", "Feten", "Dridi");
        Employe employe2 = new Employe("11223344", "M2", "Amina", "Fehri");
        Employe employe3 = new Employe("12332112", "M3", "Mohamed", "Salah");


        Departement departement1 = new Departement(1, "Finance");
        Departement departement2 = new Departement(2, "RH");

        societeHashMap.ajouterEmployeDepartement(employe1, departement1);
        societeHashMap.ajouterEmployeDepartement(employe2, departement2);
        societeHashMap.ajouterEmployeDepartement(employe3, departement1);


        System.out.println("Employés et leurs départements (HashMap) :");
        societeHashMap.afficherLesEmployesLeursDepartements();


        System.out.println("\nEmployés (HashMap) :");
        societeHashMap.afficherLesEmployes();

        System.out.println("\nDépartements (HashMap) :");
        societeHashMap.afficherLesDepartements();


        System.out.println("\nRecherche d'un employé:");
        boolean isFound = societeHashMap.rechercherEmploye(employe1);
        System.out.println(isFound ? "Employé trouvé." : "Employé non trouvé.");


        System.out.println("\nSuppression d'un employé:");
        societeHashMap.supprimerEmploye(employe2);

        System.out.println("\nEmployés après suppression (HashMap) :");
        societeHashMap.afficherLesEmployes();

        // Création de la société avec TreeMap
        InterfaceSociete societeTreeMap = new SocieteTreeMap();

        //Ajout des employés et départements à la societe treemap
        societeTreeMap.ajouterEmployeDepartement(employe1, departement1);
        societeTreeMap.ajouterEmployeDepartement(employe3, departement1);

        // Afficher les employés et leurs départements (TreeMap)
        System.out.println("\nEmployés et leurs départements (TreeMap) :");
        societeTreeMap.afficherLesEmployesLeursDepartements();
    }
}
