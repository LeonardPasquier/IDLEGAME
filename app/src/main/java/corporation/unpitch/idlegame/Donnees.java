package corporation.unpitch.idlegame;

import java.io.Serializable;

/**
 * Created by Un Pitch on 24/12/2016.
 */

public class Donnees implements Serializable {
    //On déclare les variables à sauvegarder
    String lignes_de_code_courantes ="";
    String lignes_de_code_total ="";
    String argent = "";
    String argent_total="";
    String projet_courant ="";
    String nombre_dev_j="";
    String nombre_dev_e="";
    String nombre_dev_s="";
    private static final long serialVersionUID = 46543445;

    //On fait les setter pour leur affecter une valeur depuis une autre classe
    public void setLignes_de_code_courantes(String lignes_de_code_courantes){
        this.lignes_de_code_courantes = lignes_de_code_courantes;
    }

    public void setLignes_de_code_total(String lignes_de_code_total){
        this.lignes_de_code_total = lignes_de_code_total;
    }

    public void setArgent(String argent){
        this.argent = argent;
    }

    public void setArgent_total(String argent_total){
        this.argent_total = argent_total;
    }

    public void setProjet_courant(String projet_courant){
        this.projet_courant = projet_courant;
    }

    public void setNombre_dev_j(String nombre_dev_j){
        this.nombre_dev_j = nombre_dev_j;
    }

    public void setNombre_dev_e(String nombre_dev_e){
        this.nombre_dev_e = nombre_dev_e;
    }

    public void setNombre_dev_s(String nombre_dev_s){
        this.nombre_dev_s = nombre_dev_s;
    }

    //Puis les getter pour récupérer leur valeur depuis une autre classe
    public String getLignes_de_code_courantes(){
        return lignes_de_code_courantes;
    }

    public String getLignes_de_code_total(){
        return lignes_de_code_total;
    }

    public String getArgent(){
        return argent;
    }

    public String getArgent_total(){
        return argent_total;
    }

    public String getProjet_courant(){
        return projet_courant;
    }

    public String getNombre_dev_j(){
        return nombre_dev_j;
    }

    public String getNombre_dev_e(){
        return nombre_dev_e;
    }

    public String getNombre_dev_s(){
        return nombre_dev_s;
    }
}
