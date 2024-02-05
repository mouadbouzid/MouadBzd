public class ClassProgram {
    public static void main(String[] args){
        Habit h1=new Habit(1,"aaa","vv",1.2,"red",5);
        Habit h2=new Habit(2,"bbb","zz",2.1,"red",10);

        Electromenager e1=new Electromenager(3,"ccc","tt",19.99,12,4);
        Electromenager e2=new Electromenager(4,"ddd","gg",29.99,19,2);
        Electromenager e3=new Electromenager(5,"eee","jj",39.99,2,3);

        Magasin m=new Magasin();
        m.nom="MyPOS";
        m.ajouterH(h1);
        m.ajouterH(h2);
        m.ajouterEM(e1);
        m.ajouterEM(e2);
        m.ajouterEM(e3);
        try {
            m.recherchrArticle(1);
        }catch (Exception e){
            e.getMessage();
        }
        System.out.println(m.toString());
        m.enregistrerStocks("myStocks.txt");
    }
}
