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
    private String projet_courant_general_id = "";
    private String projet_courant_jeux_video = "Wyrm Quest";
    private String projet_courant_site_web ="Le site du 1";
    private String projet_courant_logiciel ="Letter Office";
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

    void setProjet_courant_jeux_video(String projet_courant_jeux_video){
        this.projet_courant_jeux_video = projet_courant_jeux_video;
    }

    void setProjet_courant_site_web(String projet_courant_site_web){
        this.projet_courant_site_web = projet_courant_site_web;
    }

    void setProjet_courant_logiciel(String projet_courant_logiciel){
        this.projet_courant_logiciel = projet_courant_logiciel;
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
    void setProjet_courant_general_id (String projet_courant_general_id){this.projet_courant_general_id=projet_courant_general_id;}

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

    String getProjet_courant_jeux_video(){
        return this.projet_courant_jeux_video;
    }

    String getProjet_courant_site_web(){
        return this.projet_courant_site_web;
    }

    String getProjet_courant_logiciel(){
        return this.projet_courant_logiciel;
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
    String getProjet_courant_general_id(){ return this.projet_courant_general_id;}
}
