import java.util.List;
import java.util.ArrayList;

public class Annuaire {
    private List<Personne> personnes;

    public Annuaire() {
        personnes = new ArrayList<Personne>();
    }

    public List<Personne> listAll() {
        return this.personnes;
    }

    public boolean addPersonne(Personne pers) {

        if (this.personnes.contains(pers)) return false;

        this.personnes.add(pers);

        return true;
    }
}