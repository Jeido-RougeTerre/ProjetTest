import java.util.Scanner;

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
            3. Quitter
            >
            """);

            String choix = sc.nextLine();

            switch (choix) {
                case "1" -> addContact();
                case "2" -> listContacts();
                case "3" -> { flagQuit = true; }
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
        System.out.println(String.join("\n", this.annuaire.listAll().stream.map(Personne::toString).toList()));
    }
}