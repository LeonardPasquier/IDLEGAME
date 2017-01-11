package corporation.unpitch.idlegame;

import java.io.Serializable;

/**
 * Created by Un Pitch on 30/12/2016.
 */

public class Projet implements Serializable{

    String id = "";
    String nom = "";
    int objectif = 0;
    String branche = "";
    String description = "";
    String difficulte = "";
    int gainfinal = 0;
    //Gain direct / gain courant
    String methode_gain_final = "";//OS = d'un coup, CON = continu, BO = les deux
    String projet_suivant = "";
    String projet_suivant_id = "";

    //On fait les setter
    public void setprojectId(String id){
        this.id = id;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setObjectif(int objectif){
        this.objectif = objectif;
    }
    public void setBranche(String branche){
        this.branche = branche;
    }
    public void setDifficulte(String difficulte){
        this.difficulte = difficulte;
    }
    public void setGainfinal(int gainfinal){
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
    public void setProjetSuivantID(String id){
        this.projet_suivant_id = id;
    }

    //On fait les getter
    String getprojectId(){
        return this.id;
    }
    String getNom(){
        return this.nom;
    }
    int getObjectif(){
        return this.objectif;
    }
    String getBranche(){
        return this.branche;
    }
    String getDifficulte(){
        return this.difficulte;
    }
    int getGainFinal(){
        return this.gainfinal;
    }
    String getMethode_Gain_Final(){
        return this.methode_gain_final;
    }
    String getProjet_suivant(){
        return this.projet_suivant;
    }
    String getDescription(){
        return this.description;
    }
    String getProjetSuivantId(){
        return this.projet_suivant_id;
    }

}
