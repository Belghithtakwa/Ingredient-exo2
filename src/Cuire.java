public class Cuire extends Ingredient{
    int temperature;
   public Cuire(String n, String e, int q, String unite, int temp){
        super(n,e,q,unite);
        this.temperature = temp;
    }
  public void cuire(){
        this.etat = "cuit";
    }

}
