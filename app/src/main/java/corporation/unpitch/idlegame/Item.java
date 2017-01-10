package corporation.unpitch.idlegame;

/**
 * Created by Maxime on 04/01/2017.
 *
 * La classe item permet d'instaurer les éléments de la fenêtre Inventaire
 */

public class Item {
    private String nom;
    private double prix;
    private String desc;
    private String adrImage;

//Constructeurs d'Item. Vide, complet, ou sans image.
    public Item (String parNom, double parPrix, String parDesc, String parAdrImg){
        nom = parNom;
        prix = parPrix;
        desc = parDesc;
        adrImage="res/drawable/icone_android.png";
    }

    public Item (String parNom, double parPrix, String parDesc){
        nom = parNom;
        prix = parPrix;
        desc = parDesc;
        adrImage="res/drawable/icone_android.png";
    }

    public Item (){
        nom = "null";
        prix = Integer.parseInt("null");
        desc = "null";
        adrImage="res/drawable/icone_android.png";
    }
//setters de la classe item
    public void setNom (String parNom){
        nom = parNom;
    }
    public void setPrix (double parPrix){
        prix = parPrix;
    }
    public void setDesc(String parDesc){
        desc = parDesc;
    }
    public void setAdrImage(String parAdrImage){
        adrImage=parAdrImage;
    }
//getters de la classe item
    public String getNom (){
        return nom;
    }
    public double getPrix (){
        return prix;
    }
    public String getDesc (){
        return desc;
    }
    public String getAdrImg (){
        return adrImage;
    }
}
