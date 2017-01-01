package corporation.unpitch.idlegame;

import java.io.Serializable;

/**
 * Created by Un Pitch on 24/12/2016.
 */

class Donnees implements Serializable {
    //On déclare les variables à sauvegarder
    private String lignes_de_code_courantes ="null";
    private String lignes_de_code_total ="null";
    private String argent = "null";
    private String argent_total="null";
    private String projet_courant_general ="rien";
    private String projet_courant_facile = "facile1";
    private String projet_courant_moyen ="moyen1";
    private String projet_courant_difficile ="difficile1";
    private String nombre_dev_j="null";
    private String nombre_dev_e="null";
    private String nombre_dev_s="null";

    //On fait les setter pour leur affecter une valeur depuis une autre classe
    void setLignes_de_code_courantes(String lignes_de_code_courantes){
        this.lignes_de_code_courantes = lignes_de_code_courantes;
    }

    void setLignes_de_code_total(String lignes_de_code_total){
        this.lignes_de_code_total = lignes_de_code_total;
    }

    void setArgent(String argent){
        this.argent = argent;
    }

    void setArgent_total(String argent_total){
        this.argent_total = argent_total;
    }

    void setProjet_courant_general(String projet_courant_general){
        this.projet_courant_general = projet_courant_general;
    }

    void setProjet_courant_facile(String projet_courant_facile){
        this.projet_courant_facile = projet_courant_facile;
    }

    void setProjet_courant_moyen(String projet_courant_moyen){
        this.projet_courant_moyen = projet_courant_moyen;
    }

    void setProjet_courant_difficile(String projet_courant_difficile){
        this.projet_courant_difficile = projet_courant_difficile;
    }

    void setNombre_dev_j(String nombre_dev_j){
        this.nombre_dev_j = nombre_dev_j;
    }

    void setNombre_dev_e(String nombre_dev_e){
        this.nombre_dev_e = nombre_dev_e;
    }

    void setNombre_dev_s(String nombre_dev_s){
        this.nombre_dev_s = nombre_dev_s;
    }

    //Puis les getter pour récupérer leur valeur depuis une autre classe
    String getLignes_de_code_courantes(){
        return this.lignes_de_code_courantes;
    }

    String getLignes_de_code_total(){
        return this.lignes_de_code_total;
    }

    String getArgent(){
        return this.argent;
    }

    String getArgent_total(){
        return this.argent_total;
    }

    String getProjet_courant_general(){
        return this.projet_courant_general;
    }

    String getProjet_courant_facile(){
        return this.projet_courant_facile;
    }

    String getProjet_courant_moyen(){
        return this.projet_courant_moyen;
    }

    String getProjet_courant_difficile(){
        return this.projet_courant_difficile;
    }

    String getNombre_dev_j(){
        return this.nombre_dev_j;
    }

    String getNombre_dev_e(){
        return this.nombre_dev_e;
    }

    String getNombre_dev_s(){
        return this.nombre_dev_s;
    }
}
