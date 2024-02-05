import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Magasin {
    public String nom;
    public ArrayList<Electromenager> listElectroMenagers=new ArrayList<>();
    public ArrayList<Habit> listHabits=new ArrayList<>();
    public void ajouterEM(Electromenager elm){
        if (elm!=null)listElectroMenagers.add(elm);
    }
    public void ajouterH(Habit elm){
        if (elm!=null)listHabits.add(elm);
    }
    public Article recherchrArticle(int numSerie)throws Exception{
        for (Habit h:listHabits){
            if (h.numSerie==numSerie)return h;
        }
        for (Electromenager e:listElectroMenagers){
            if (e.numSerie==numSerie)return e;
        }
        throw new Exception("Aucun Article ne correspond a votre Recherche");
    }
    public String toString(){
        String s="Les Articles du Magasin : "+nom+"\nListe des Habit : \n\n" +
                "Num Serie      Marque      Nom     Taille     Couleur    PrixHT\n";
        for (Habit h:listHabits){
            s+=h.numSerie+"     "+h.marque+"     "+h.nom+"     "+h.taille+"     "+h.couleur+"     "+h.prix+"\n";
        }
        s+="Liste des Electromenager : \nNum Serie      Marque      Nom     Poids     Duree fin Granatie    PrixHT\n";
        for (Electromenager e:listElectroMenagers){
            s+=e.numSerie+"     "+e.marque+"     "+e.nom+"     "+e.poids+"     "+e.dureeGar+"     "+e.prix+"\n";
        }
        return s;
    }
    public void enregistrerStocks(String nomFichier){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier));
            writer.write((toString()));
        }catch (IOException e) {e.printStackTrace();}
    }
}
































