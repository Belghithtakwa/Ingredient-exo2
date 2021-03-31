public class Decouper extends Ingredient{
   public Decouper(String n, String e, int q, String unite){
        super(n,e,q,unite);
    }
   public void decouper(){
        this.etat = "decoupe";
    }
}
