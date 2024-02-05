import java.time.LocalDate;

public class Electromenager extends Article{
    public int poids;
    public int dureeGar;
    public Electromenager(){}
    public Electromenager(int numSerie,String marque,String nom,double prix,int poids,int dureeGar){
        super(numSerie,marque,nom,prix);
        this.poids=poids;
        this.dureeGar=dureeGar;
    }
    public LocalDate dateFinGarantie(){
        return LocalDate.now().plusMonths(dureeGar);
    }
    public Electromenager(int numSerie){super(numSerie);}
    public String toString(){
        return super.toString()+" le poids "+poids+" et la duree de garantie en mois"+dureeGar;
    }

}
