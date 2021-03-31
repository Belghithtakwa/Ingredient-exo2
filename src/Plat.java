import java.util.ArrayList;

public class Plat {
    String nom;
    ArrayList<Ingredient> ingredients;
    public Plat(String nom){
        this.nom = nom;
        this.ingredients = new ArrayList<Ingredient>();
    }
    public String getNom(){
        return this.nom;
    }
    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
    }
    public void ajouteIngredient(Ingredient ingre){
        this.ingredients.add(ingre);
    }
    public boolean equals(Object x){
        if(x instanceof Plat){
            for(Ingredient i:this.ingredients){
                if(!((Plat) x).ingredients.contains(i)) return false;
            }
            return this.ingredients.size() ==
                    ((Plat) x).ingredients.size();
        }
        else return false;
    }
    public static void main(String[] args){
        Plat p = new Plat("Choucroute");
        p.ajouteIngredient(new Ingredient("choucroute","cuite",500,"g"));
        p.ajouteIngredient(new Ingredient("lard","cuit_entier",150,"g"));
        p.ajouteIngredient(new Ingredient("saucisse","cuite_entiere",2,
                "cardinalite"));

    }
    }
