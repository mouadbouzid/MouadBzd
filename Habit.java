public class Habit extends Article{
    public String couleur;
    public double taille;
    public Habit(){}
    public Habit(int numSerie,String marque,String nom,double prix,String couleur,double taille){
        super(numSerie,marque,nom,prix);
        this.couleur=couleur;
        this.taille=taille;
    }
    public Habit(int numSerie){super(numSerie);}
    public String toString(){
        return super.toString()+" et le couleur "+couleur+" la taille "+taille;
    }
}
