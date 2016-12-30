package corporation.unpitch.idlegame;

import java.io.Serializable;

/**
 * Created by Un Pitch on 30/12/2016.
 */

public class Projet implements Serializable{

    String id = "";
    String nom = "";
    String objectif = "";
    String branche = "";
    String difficulte = "";
    String gainfinal = "";
    String methode_gain_final = "";
    String projet_suivant = "";
    String description = "";

    //On fait les setter
    public void setprojectId(String id){
        this.id = id;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setObjectif(String objectif){
        this.objectif = objectif;
    }
    public void setBranche(String branche){
        this.branche = branche;
    }
    public void setDifficulte(String difficulte){
        this.difficulte = difficulte;
    }
    public void setGainfinal(String gainfinal){
        this.gainfinal = gainfinal;
    }
    public void setMethode_gain_final(String methode_gain_final){
        this.methode_gain_final = methode_gain_final;
    }
    public void setProjet_suivant(String projet_suivant){
        this.projet_suivant = projet_suivant;
    }
    public void setDescription(String description){
        this.description = description;
    }

    //On fait les getter
    public String getprojectId(){
        return this.id;
    }
    public String getNom(){
        return this.nom;
    }
    public String getObjectif(){
        return this.objectif;
    }
    public String getBranche(){
        return this.branche;
    }
    public String getDifficulte(){
        return this.difficulte;
    }
    public String getGainFinal(){
        return this.gainfinal;
    }
    public String getMethode_Gain_Final(){
        return this.methode_gain_final;
    }
    public String getProjet_suivant(){
        return this.projet_suivant;
    }
    public String getDescription(){
        return this.description;
    }

}
