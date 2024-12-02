public class Main {
    public static void main(String args[]) {
        Personne pers1 = new Personne("test", "01 01 02 02 15");
        Personne pers2 = new Personne("michel test", "+336 05 04 03 01");

        Annuaire annuaire = new Annuaire();

        annuaire.addPersonne(pers1);
        annuaire.addPersonne(pers2);

        IHM ihm = new IHM(annuaire);

        ihm.menu();
    }
}