public class Personne {
    private String nom;
    private String tel;

    public Personne(String nom, String tel) {
        this.nom = nom;
        this.tel = tel;
    }

    public String getNom() {
        return this.nom;
    }

    public String getTel() {
        return this.tel;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.nom, this.tel);
    }
}