package corporation.unpitch.idlegame;

import java.io.Serializable;

/**
 * Created by Un Pitch on 24/12/2016.
 */

class Donnees implements Serializable {
    //On déclare les variables à sauvegarder
    private float lignes_de_code_courantes = 0;
    private float lignes_de_code_total = 0;
    private float argent = 5000;
    private float argent_total= 750;
    private String projet_courant_general ="null";
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
    private int nombre_comptables_j=0;
    private int nombre_comptables_e=0;
    private int nombre_comptables_s=0;
    private int nombre_admin_j=0;
    private int nombre_admin_e=0;
    private int nombre_admin_s=0;
    private int valeur_du_clic = 1;
    private String nom_entreprise = null;
    private String nom_joueur = null;
    private int nombre_ordinateurs_faibles = 0;
    private int nombre_ordinateurs_moyens = 0;
    private int nombre_ordinateurs_badass = 0;
    private int nombre_antivirus_faibles = 0;
    private int nombre_antivirus_moyens = 0;
    private int nombre_antivirus_badass = 0;
    private int nombre_serveurs_faibles = 0;
    private int nombre_serveurs_moyens = 0;
    private int nombre_serveurs_badass = 0;
    private int compteur_projet = 0;
    private int compteur_jeux_videos = 0;
    private int compteur_lgiciels = 0;
    private int compteur_sites = 0;
    


    //On fait les setter pour leur affecter une valeur depuis une autre classe
    void setLignes_de_code_courantes(float lignes_de_code_courantes){
        this.lignes_de_code_courantes = lignes_de_code_courantes;
    }

    void setLignes_de_code_total(float lignes_de_code_total){
        this.lignes_de_code_total = lignes_de_code_total;
    }

    void setArgent(float argent){
        this.argent = argent;
    }

    void setArgent_total(float argent_total){
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
    void setnom_entreprise(String nom_entreprise){
        this.nom_entreprise = nom_entreprise;
    }

    void setNombre_dev_j( int  nombre_dev_j){
        this.nombre_dev_j = nombre_dev_j;
    }

    void setNombre_dev_e( int  nombre_dev_e){
        this.nombre_dev_e = nombre_dev_e;
    }

    void setNombre_dev_s( int  nombre_dev_s){
        this.nombre_dev_s = nombre_dev_s;
    }
    
    void setNombre_chef_projet_j( int  nombre_chef_projet_j){
        this.nombre_chef_projet_j = nombre_chef_projet_j;
    }

    void setNombre_chef_projet_e( int  nombre_chef_projet_e){
        this.nombre_chef_projet_e = nombre_chef_projet_e;
    }

    void setNombre_chef_projet_s( int  nombre_chef_projet_s){
        this.nombre_chef_projet_s = nombre_chef_projet_s;
    }
    void setNombre_comptables_j( int  nombre_comptables_j){
        this.nombre_comptables_j = nombre_comptables_j;
    }

    void setNombre_comptables_e( int  nombre_comptables_e){
        this.nombre_comptables_e = nombre_comptables_e;
    }

    void setNombre_comptables_s( int  nombre_comptables_s){
        this.nombre_comptables_s = nombre_comptables_s;
    }
    
    void setNombre_admin_j( int  nombre_admin_j){
        this.nombre_admin_j = nombre_admin_j;
    }

    void setNombre_admin_e( int  nombre_admin_e){
        this.nombre_admin_e = nombre_admin_e;
    }

    void setNombre_admin_s( int  nombre_admin_s){
        this.nombre_admin_s = nombre_admin_s;
    }
    
    void setProjet_courant_general_id (String projet_courant_general_id){this.projet_courant_general_id=projet_courant_general_id;}

    void setValeur_du_clic( int  i){
        this.valeur_du_clic = i;
    }

    void setNom_joueur (String s) { this.nom_joueur = s;}

    void setNombre_ordinateurs_faibles(int s) { this.nombre_ordinateurs_faibles = s;}
    void setNombre_ordinateurs_moyens(int s) { this.nombre_ordinateurs_moyens = s;}
    void setNombre_ordinateurs_badass(int s) { this.nombre_ordinateurs_badass = s;}
    void setNombre_antivirus_faibles(int s) { this.nombre_antivirus_faibles = s;}
    void setNombre_antivirus_moyens(int s) { this.nombre_antivirus_moyens = s;}
    void setNombre_antivirus_badass(int s) { this.nombre_antivirus_badass = s;}
    void setNombre_serveurs_faibles(int s) { this.nombre_serveurs_faibles = s;}
    void setNombre_serveurs_moyens(int s) { this.nombre_serveurs_moyens = s;}
    void setNombre_serveurs_badass(int s) { this.nombre_serveurs_badass = s;}

    void setCompteur_projet(int s) {this.compteur_projet = s;}
    void setCompteur_jeux_videos(int s) {this.compteur_jeux_videos = s;}
    void setCompteur_lgiciels(int s) {this.compteur_lgiciels = s;}
    void setCompteur_sites(int s) {this.compteur_sites = s;}

    //Puis les getter pour récupérer leur valeur depuis une autre classe
    float getLignes_de_code_courantes(){
        return this.lignes_de_code_courantes;
    }

    float getLignes_de_code_total(){
        return this.lignes_de_code_total;
    }

    float getArgent(){
        return this.argent;
    }

    float getArgent_total(){
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

     int  getNombre_dev_j(){
        return this.nombre_dev_j;
    }

     int  getNombre_dev_e(){
        return this.nombre_dev_e;
    }

     int  getNombre_dev_s(){
        return this.nombre_dev_s;
    }
    
     int  getNombre_chef_projet_j(){
        return this.nombre_chef_projet_j;
    }

     int  getNombre_chef_projet_e(){
        return this.nombre_chef_projet_e;
    }

     int  getNombre_chef_projet_s(){
        return this.nombre_chef_projet_s;
    }
     int  getNombre_comptables_j(){
        return this.nombre_comptables_j;
    }

     int  getNombre_comptables_e(){
        return this.nombre_comptables_e;
    }

     int  getNombre_comptables_s(){
        return this.nombre_comptables_s;
    }
    
     int  getNombre_admins_j(){
        return this.nombre_admin_j;
    }

     int  getNombre_admins_e(){
        return this.nombre_admin_e;
    }

     int  getNombre_admins_s(){
        return this.nombre_admin_s;
    }

    String getProjet_courant_general_id(){ return this.projet_courant_general_id;}

     int  getValeur_du_clic(){return this.valeur_du_clic;}

    String getNom_entreprise(){ return this.nom_entreprise;}

    String getNom_joueur() { return this.nom_joueur;}

    int getNombre_ordinateurs_faibles(){
        return this.nombre_ordinateurs_faibles;
    }
    int getNombre_ordinateurs_moyens(){
        return this.nombre_ordinateurs_moyens;
    }
    int getNombre_ordinateurs_badass(){
        return this.nombre_ordinateurs_badass;
    }
    int getNombre_antivirus_faibles(){
        return this.nombre_antivirus_faibles;
    }
    int getNombre_antivirus_moyens(){
        return this.nombre_antivirus_moyens;
    }
    int getNombre_antivirus_badass(){
        return this.nombre_antivirus_badass;
    }
    int getNombre_serveurs_faibles(){
        return this.nombre_serveurs_faibles;
    }
    int getNombre_serveurs_moyens(){
        return this.nombre_serveurs_moyens;
    }
    int getNombre_serveurs_badass(){
        return this.nombre_serveurs_badass;
    }

    int getCompteur_projet() {return this.compteur_projet;}
    int getCompteur_jeux_videos() {return this.compteur_jeux_videos;}
    int getCompteur_lgiciels() {return this.compteur_lgiciels;}
    int getCompteur_sites() {return this.compteur_sites;}
}
