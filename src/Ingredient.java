public class Ingredient {
    String nom_aliment, etat;
    int quantite;
    String unite;
    Ingredient(String n,String e,int q,String unite){
        this.nom_aliment = n;
        this.etat = e;
        this.quantite = q;
        this.unite = unite;
    }
    public boolean equals(Object x){
        return (x instanceof Ingredient) &&
                this.nom_aliment.equals(((Ingredient) x).nom_aliment) &&
                this.etat.equals(((Ingredient) x).etat);
    }

}

