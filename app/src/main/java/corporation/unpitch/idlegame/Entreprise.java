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

        argentTotale = (TextView) findViewById(R.id.textViewArgentTotale);
        argentTotale.setText((" Argent total : ")+String.valueOf(MainActivity.donnees.getArgent_total())+("€"));

        LigneDeCodeTotales = (TextView) findViewById(R.id.textViewLignesDeCodesTotales);
        LigneDeCodeTotales.setText((" Lignes de codes totales : ")+String.valueOf(MainActivity.donnees.getLignes_de_code_total()));



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
