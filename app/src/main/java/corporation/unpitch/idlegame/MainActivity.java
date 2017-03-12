package corporation.unpitch.idlegame;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //yolo
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.File;
import java.util.Objects;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    Button parametres = null;
    Button incrementer = null;
    Button recruter = null;
    Button entreprise = null;
    //test
    Button inventaire = null;
    TextView compteurLignes = null;
    TextView compteurArgent = null;
    static TextView nom_entreprise = null;
    static TextView projetCourant = null;
    static boolean presence_fichier = false;
    static Donnees donnees = new Donnees(); //On cree la classe de donnees a enregistrer
    static int objectif = 999999999;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On récupère toutes les vues dont on a besoin
        incrementer = (Button)findViewById(R.id.boutonClavier);
        recruter = (Button)findViewById(R.id.recruter);
        entreprise = (Button)findViewById(R.id.entreprise);
        inventaire = (Button)findViewById(R.id.inventaire);
        compteurLignes = (TextView)findViewById(R.id.compteurLignes);
        compteurArgent = (TextView) findViewById(R.id.compteurArgent);
        projetCourant = (TextView) findViewById(R.id.projet_en_cours);
        nom_entreprise = (TextView) findViewById(R.id.textNomEntreprise);

        // On attribue un listener adapté aux vues qui en ont besoin
        incrementer.setOnClickListener(incrementerListener);
        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        inventaire.setOnClickListener(lienInventaire);

        try {
            //on charge le fichier de sauvegarde
            Donnees data = new Donnees();
            data = Charger.chargerDonnee(this, "sauver");
            if (data != null){
                donnees = data;
                presence_fichier = true;

            }
        }
        catch (Exception ex){
            System.out.println("erreur lors du chargement du fichier");
        }

        if (!presence_fichier){
            Intent introduction = new Intent (MainActivity.this, Introduction.class);
            startActivity(introduction);
        }

        try {
            //On affecte les differentes variables du fichier de donnees presentes dans la fenetre
            System.out.println(donnees.getProjet_courant_general());
            compteurLignes.setText(String.valueOf(donnees.getLignes_de_code_courantes()));
            projetCourant.setText(donnees.getProjet_courant_general());
            compteurArgent.setText(String.valueOf(donnees.getArgent()));
            objectif = Liste_Projets.getProjet(donnees.getProjet_courant_general()).getObjectif();
            nom_entreprise.setText(String.valueOf(donnees.getNom_entreprise()));
        }
        catch(Exception exc){
            System.out.println("Erreur lors de l'affectation des variables sauvées aux champs.");
        }

        //Si aucun projet n'est affecté, alors on amène directement la personne sur le menu de choix de projet.
        if (Objects.equals(MainActivity.donnees.getProjet_courant_general(), "null") && presence_fichier){
            Intent choixprojet = new Intent (MainActivity.this, ChoixProjet.class);
            startActivity(choixprojet);
        }
        final MainActivity myActivity = this;


        new Thread (
                new Runnable(){
                public void run(){
                    Incrementation_automatique.attendre(myActivity);

                }


        }).start();

    }
    private View.OnClickListener incrementerListener = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public void onClick(View v) {
            //On recupere la valeur du compteur de lignes courant
            int ib = getCompteurLigneCourant();
            //On l'incrémente
            ib = ib+donnees.getValeur_du_clic();
            String csb = String.valueOf(ib);
            //On affiche la nouvelle valeur à l'ecran
            compteurLignes.setText(csb);
            donnees.setLignes_de_code_courantes(getCompteurLigneCourant());
            //Si l'objectif est atteint, alors on appelle la fonction objectifatteint
            if (ib >= objectif){
                objectifatteint();
            }
        }
        };
    private View.OnClickListener lienRecrutement = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent recruter = new Intent (MainActivity.this, Recruter.class); // on declare la nouvelle activite reliee au bouton
            startActivity (recruter); //on demarre l'activite
        }

        };
    private View.OnClickListener lienEntreprise = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent entreprise = new Intent (MainActivity.this, Entreprise.class); // on declare la nouvelle activite reliee au bouton
            startActivity (entreprise); //on demarre l'activite
        }

    };
    private View.OnClickListener lienInventaire = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inventaire = new Intent (MainActivity.this, Inventaire.class); // on declare la nouvelle activite reliee au bouton
            startActivity (inventaire); //on demarre l'activite
        }

    };

    public int getCompteurLigneCourant(){
        CharSequence csb = compteurLignes.getText();
        String str = String.valueOf(csb);
        int ib;
        ib = Integer.parseInt(str);
        return ib;
    }

    //Si le nombre de lignes de code fixées comme objectif ont bien êtées atteintes, alors...
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void objectifatteint(){
        //On reset le compteur de lignes courantes
        compteurLignes.setText("0");
        //On affiche un message de félicitations

        //on rend l'argent aux abonnés
        System.out.println(Liste_Projets.getProjet(donnees.getProjet_courant_general()).getGainFinal());
        donnees.setArgent(donnees.getArgent()+Liste_Projets.getProjet(donnees.getProjet_courant_general()).getGainFinal());
        //On actualise les projets courants, de manière à passer par exemple de jeux_video1 à jeux_video2
        actprojetcourant();
        //on reset le projet courant general
        donnees.setProjet_courant_general("null");
        //Puis on renvoie vers la page du choix des projets
        Intent choixprojet = new Intent (MainActivity.this, ChoixProjet.class);
        startActivity(choixprojet);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void actprojetcourant(){
        Projet courant = Liste_Projets.getProjet(donnees.getProjet_courant_general());
        if (Objects.equals(courant.getBranche(), "Jeux videos")){
            donnees.setProjet_courant_jeux_video(courant.getProjet_suivant());
        }
        if (Objects.equals(courant.getBranche(), "Sites Web")){
            donnees.setProjet_courant_site_web(courant.getProjet_suivant());
        }
        if (Objects.equals(courant.getBranche(), "Logiciel")){
            donnees.setProjet_courant_logiciel(courant.getProjet_suivant());
        }
        else {
            System.out.println("blc");
        }
    }

   /* public void actualiserAffichage(){
        compteurLignes.setText(String.valueOf(donnees.getLignes_de_code_courantes()));
        projetCourant.setText(donnees.getProjet_courant_general());
        compteurArgent.setText(String.valueOf(donnees.getArgent()));
    }*/

    @Override
    public void onBackPressed(){
        donnees.setLignes_de_code_courantes(getCompteurLigneCourant());
        System.out.println(getCompteurLigneCourant());
        Sauvegarder.sauvegarder(this, donnees, "sauver");
        this.finish();
    }


}
