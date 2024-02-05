import java.util.Objects;

public class Article {
    public int numSerie;
    public String marque;
    public String nom;
    public double prix;
    public Article(){}
    public Article(int numSerie){this.numSerie=numSerie;}
    public Article(int numSerie,String marque,String nom,double prix){
        this.numSerie=numSerie;
        this.marque=marque;
        this.nom=nom;
        this.prix=numSerie;
    }
    public boolean equals(Object o){
        return this==o || (Objects.equals(this.getClass(),o.getClass()) && this.numSerie==((Article)o).numSerie);
    }
    public  String toString(){
        return "Numero de seie "+numSerie+" la marque "+marque+" et le nom "+nom+" le prix hors taxe "+prix;
    }
}
