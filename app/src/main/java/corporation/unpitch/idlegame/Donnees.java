package corporation.unpitch.idlegame;

import java.io.Serializable;

/**
 * Created by Un Pitch on 24/12/2016.
 */

class Donnees implements Serializable {
    //On déclare les variables à sauvegarder
    private int lignes_de_code_courantes =0;
    private int lignes_de_code_total =0;
    private int argent = 999;
    private int argent_total=999;
    private String projet_courant_general ="rien";
    private String projet_courant_general_id = "";
    private String projet_courant_jeux_video = "Wyrm Quest";
    private String projet_courant_site_web ="Le site du 1";
    private String projet_courant_logiciel ="Letter Office";
    private int nombre_dev_j= 0;
    private int nombre_dev_e= 0;
    private int nombre_dev_s= 0;
    private int nombre_chef_projet_j= 0;
    private int nombre_chef_projet_e= 0;
    private int nombre_chef_projet_s= 0;

    //On fait les setter pour leur affecter une valeur depuis une autre classe
    void setLignes_de_code_courantes(int lignes_de_code_courantes){
        this.lignes_de_code_courantes = lignes_de_code_courantes;
    }

    void setLignes_de_code_total(int lignes_de_code_total){
        this.lignes_de_code_total = lignes_de_code_total;
    }

    void setArgent(int argent){
        this.argent = argent;
    }

    void setArgent_total(int argent_total){
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

    void setNombre_dev_j(int nombre_dev_j){
        this.nombre_dev_j = nombre_dev_j;
    }

    void setNombre_dev_e(int nombre_dev_e){
        this.nombre_dev_e = nombre_dev_e;
    }

    void setNombre_dev_s(int nombre_dev_s){
        this.nombre_dev_s = nombre_dev_s;
    }
    
    void setNombre_chef_projet_j(int nombre_chef_projet_j){
        this.nombre_chef_projet_j = nombre_chef_projet_j;
    }

    void setNombre_chef_projet_e(int nombre_chef_projet_e){
        this.nombre_chef_projet_e = nombre_chef_projet_e;
    }

    void setNombre_chef_projet_s(int nombre_chef_projet_s){
        this.nombre_chef_projet_s = nombre_chef_projet_s;
    }
    
    void setProjet_courant_general_id (String projet_courant_general_id){this.projet_courant_general_id=projet_courant_general_id;}
    
    

    //Puis les getter pour récupérer leur valeur depuis une autre classe
    int getLignes_de_code_courantes(){
        return this.lignes_de_code_courantes;
    }

    int getLignes_de_code_total(){
        return this.lignes_de_code_total;
    }

    int getArgent(){
        return this.argent;
    }

    int getArgent_total(){
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

    int getNombre_dev_j(){
        return this.nombre_dev_j;
    }

    int getNombre_dev_e(){
        return this.nombre_dev_e;
    }

    int getNombre_dev_s(){
        return this.nombre_dev_s;
    }
    
    int getNombre_chef_projet_j(){
        return this.nombre_chef_projet_j;
    }

    int getNombre_chef_projet_e(){
        return this.nombre_chef_projet_e;
    }

    int getNombre_chef_projet_s(){
        return this.nombre_chef_projet_s;
    }
    
    String getProjet_courant_general_id(){ return this.projet_courant_general_id;}
}
