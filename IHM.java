import java.util.*;

public class IHM {
    private Annuaire annuaire;

    public IHM(Annuaire annuaire) {
        this.annuaire = annuaire;
    }

    public void menu() {
        boolean flagQuit = false;
        while (!flagQuit) {
            Scanner sc = new Scanner(System.in);
            System.out.print("""
            1. Ajouter un contact
            2. Lister les contacts
            3. Rechercher un contact par nom
            4. Quitter
            >\s""");

            String choix = sc.nextLine();

            switch (choix) {
                case "1" -> addContact();
                case "2" -> listContacts();
                case "3" -> findContact();
                case "4" -> { flagQuit = true; }
                default -> System.out.println("Choix invalide !");
            }

        }
    }

    private void addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nom: ");
        String nom = sc.nextLine();
        System.out.print("tel: ");
        String tel = sc.nextLine();

        System.out.println(this.annuaire.addPersonne(new Personne(nom, tel))?
        "Personne Ajouté avec succé !" : "Déjà dans l'annuaire !"
        );
    }

    private void listContacts() {
        System.out.println(String.join("\n", this.annuaire.listAll().stream().map(Personne::toString).toList()));
    }

    private void findContact() {
        System.out.print("nom: ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();

        List<Personne> pers = annuaire.findByName(nom);
        if (pers.isEmpty()) {
            System.out.println("Aucun contacts trouvé !");
            return;
        }

        System.out.println(String.join("\n", pers.stream().map(Personne::toString).toList()));
    }
}