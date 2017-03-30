package corporation.unpitch.idlegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Un Pitch on 03/11/2016.
 */

public class Entreprise extends AppCompatActivity{

    Button recruter = null;
    Button entreprise = null;
    Button inventaire = null;
    Button choix_projet = null;

    TextView nomEntreprise ;
    TextView nomCreateur ;
    TextView argentTotale;
    TextView LigneDeCodeTotales;

    TextView devj;
    TextView deve;
    TextView devs;

    TextView chefdpj ;
    TextView chefdpe ;
    TextView chefdps ;

    TextView comptj;
    TextView compte;
    TextView compts;

    TextView adminj;
    TextView admine;
    TextView admins;

    TextView projetcourant;

    TextView compteurprojet;
    TextView compteurprojetjeu;
    TextView compteurprojetsite;
    TextView compteurprojetlogi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrepriseihm);


        recruter = (Button)findViewById(R.id.recruter);
        entreprise = (Button)findViewById(R.id.entreprise);
        inventaire = (Button)findViewById(R.id.inventaire);
        choix_projet = (Button)findViewById(R.id.choix_projet);

        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        inventaire.setOnClickListener(lienInventaire);
        choix_projet.setOnClickListener(lienChoixProjet);

        nomEntreprise = (TextView) findViewById(R.id.textViewNomEntreprise);
        nomEntreprise.setText ((" Entreprise : \n ")+(String.valueOf(MainActivity.donnees.getNom_entreprise())));

        nomCreateur = (TextView) findViewById(R.id.textViewNomCreateur);
        nomCreateur.setText((" Créateur : ")+String.valueOf(MainActivity.donnees.getNom_joueur()));

        projetcourant = (TextView) findViewById(R.id.textViewProjetCourant);
        projetcourant.setText((" Projet en cours : ")+String.valueOf(MainActivity.donnees.getProjet_courant_general()));

        argentTotale = (TextView) findViewById(R.id.textViewArgentTotale);
        argentTotale.setText((" Argent total : ")+String.valueOf(MainActivity.donnees.getArgent_total())+("€"));

        LigneDeCodeTotales = (TextView) findViewById(R.id.textViewLignesDeCodesTotales);
        LigneDeCodeTotales.setText((" Lignes de codes totales : ")+String.valueOf(MainActivity.donnees.getLignes_de_code_total()));

        devj = (TextView) findViewById(R.id.textViewdevj);
        devj.setText((" Developpeur junior : ")+String.valueOf(MainActivity.donnees.getNombre_dev_j()));

        deve= (TextView) findViewById(R.id.textViewdeve);
        deve.setText((" Developpeur expert : ")+String.valueOf(MainActivity.donnees.getNombre_dev_e()));

        devs = (TextView) findViewById(R.id.textViewdevs);
        devs.setText((" Developpeur senior : ")+String.valueOf(MainActivity.donnees.getNombre_dev_s()));

        chefdpj = (TextView) findViewById(R.id.textViewchefj);
        chefdpj.setText((" Chef de projet junior : ")+String.valueOf(MainActivity.donnees.getNombre_chef_projet_j()));

        chefdpe = (TextView) findViewById(R.id.textViewchefe);
        chefdpe.setText((" Chef de projet expert : ")+String.valueOf(MainActivity.donnees.getNombre_chef_projet_e()));

        chefdps = (TextView) findViewById(R.id.textViewchefs);
        chefdps.setText((" Chef de projet senior : ")+String.valueOf(MainActivity.donnees.getNombre_chef_projet_s()));

        comptj = (TextView) findViewById(R.id.textViewcomptj);
        comptj.setText((" Comptable junior : ")+String.valueOf(MainActivity.donnees.getNombre_comptables_j()));

        compte = (TextView) findViewById(R.id.textViewcompte);
        compte.setText((" Comptable expert : ")+String.valueOf(MainActivity.donnees.getNombre_comptables_e()));

        compts = (TextView) findViewById(R.id.textViewcompts);
        compts.setText((" Comptable senior : ")+String.valueOf(MainActivity.donnees.getNombre_comptables_s()));

        adminj = (TextView) findViewById(R.id.textViewadminj);
        adminj.setText((" Admin. Reseaux junior : ")+String.valueOf(MainActivity.donnees.getNombre_admins_j()));

        admine = (TextView) findViewById(R.id.textViewadmine);
        admine.setText((" Admin. Reseaux expert : ")+String.valueOf(MainActivity.donnees.getNombre_admins_e()));

        admins = (TextView) findViewById(R.id.textViewadmins);
        admins.setText((" Admin. Reseaux senior : ")+String.valueOf(MainActivity.donnees.getNombre_admins_s()));

        compteurprojet = (TextView) findViewById(R.id.textViewCompteurProjet);
        compteurprojet.setText((" Projets réalisées : ")+String.valueOf(MainActivity.donnees.getCompteur_projet()));

        compteurprojetjeu = (TextView) findViewById(R.id.textViewCompteurProjetJeu);
        compteurprojetjeu.setText((" Jeux vidéos réalisés : ")+String.valueOf(MainActivity.donnees.getCompteur_jeux_videos()));

        compteurprojetsite = (TextView) findViewById(R.id.textViewCompteurSite);
        compteurprojetsite.setText((" Sites Web réalisées : ")+String.valueOf(MainActivity.donnees.getCompteur_sites()));

        compteurprojetlogi = (TextView) findViewById(R.id.textViewCompteurProjetLogi);
        compteurprojetlogi.setText((" Logiciels réalisées : ")+String.valueOf(MainActivity.donnees.getCompteur_lgiciels()));



    }

    private View.OnClickListener lienRecrutement = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent recruter = new Intent (Entreprise.this, Recruter.class); // on declare la nouvelle activite reliee au bouton
            startActivity (recruter); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    private View.OnClickListener lienEntreprise = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent entreprise = new Intent (Entreprise.this, Entreprise.class); // on declare la nouvelle activite reliee au bouton
            startActivity (entreprise); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    private View.OnClickListener lienInventaire = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inventaire = new Intent (Entreprise.this, Inventaire.class); // on declare la nouvelle activite reliee au bouton
            startActivity (inventaire); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    private View.OnClickListener lienChoixProjet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent choixprojet = new Intent (Entreprise.this, ChoixProjet.class); // on declare la nouvelle activite reliee au bouton
            startActivity (choixprojet); //on demarre l'activite

            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    @Override
    public void onBackPressed(){
        this.finish();
    }
}
