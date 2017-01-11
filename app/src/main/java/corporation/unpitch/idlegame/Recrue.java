package corporation.unpitch.idlegame;

/**
 * Created by Maxime on 04/01/2017.
 *
 * La classe Recrue permet d'instaurer les personnes qui seront recrutées par l'entreprise
 */

public class Recrue {
    private String nom;
    static int prix;
    private String desc;
    private String adrImage;
    static int coeff;
    static int possede = 0;

    //Constructeurs de Recrue. Vide, complet, ou sans image.
    public Recrue (String parNom, int parPrix, String parDesc, String parAdrImg, int parCoeff){
        nom = parNom;
        prix = parPrix;
        desc = parDesc;
        adrImage=parAdrImg;
        coeff = parCoeff;

    }

    public Recrue (String parNom, int parPrix, String parDesc, int parCoeff){
        nom = parNom;
        prix = parPrix;
        desc = parDesc;
        adrImage="null";
        coeff=parCoeff;
    }

    public Recrue (){
        nom = "null";
        prix = Integer.parseInt("null");
        desc = "null";
        adrImage="null";
        coeff = Integer.parseInt("null");
    }
    //setters de la classe Recrue
    public void setNom (String parNom){
        nom = parNom;
    }
    public void setPrix (int parPrix){
        prix = parPrix;
    }
    public void setDesc(String parDesc){
        desc = parDesc;
    }
    public void setAdrImage(String parAdrImage){
        adrImage=parAdrImage;
    }
    public void setCoeff (int parCoeff){
        coeff = parCoeff;
    }
    public void setPossede (int parPossede){ possede = parPossede;}
    //getters de la classe item
    public String getNom (){
        return nom;
    }
    public int getPrix (){
        return prix;
    }
    public String getDesc (){
        return desc;
    }
    public String getAdrImg (){
        return adrImage;
    }
    public int getCoeff(){
        return coeff;
    }
    public int getPossede(){ return possede; }
}
