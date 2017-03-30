package corporation.unpitch.idlegame;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by Un Pitch on 30/12/2016.
 */

public class ChoixProjet extends AppCompatActivity {


    Button accept_projet1 = null;
    Button accept_projet2 = null;
    Button accept_projet3 = null;
    //La zone de texte des noms
    TextView nom_projet1 = null;
    TextView nom_projet2 = null;
    TextView nom_projet3 = null;
    //La zone de texte des descriptions
    TextView descriptionprojet1 = null;
    TextView descriptionprojet2 = null;
    TextView descriptionprojet3 = null;
    //La zone de texte de la catégorie
    TextView cont_branche_projet1 = null;
    TextView cont_branche_projet2 = null;
    TextView cont_branche_projet3 = null;
    //La zone de texte de l'objectif en lignes de code
    TextView cont_objectif_projet1 = null;
    TextView cont_objectif_projet2 = null;
    TextView cont_objectif_projet3 = null;
    //La zone de texte de la recompense
    TextView cont_recompense_projet1 = null;
    TextView cont_recompense_projet2 = null;
    TextView cont_recompense_projet3 = null;
    //La zone de texte du projet suivant
    TextView cont_debloque_projet1 = null;
    TextView cont_debloque_projet2 = null;
    TextView cont_debloque_projet3 = null;
    //Zones de texte des énoncés
    TextView cat_projet1 = null;
    TextView Obj_projet1 = null;
    TextView rec_projet1 = null;
    TextView debloque_projet1 = null;
    TextView cat_projet2 = null;
    TextView Obj_projet2 = null;
    TextView rec_projet2 = null;
    TextView debloque_projet2 = null;
    TextView cat_projet3 = null;
    TextView Obj_projet3 = null;
    TextView rec_projet3 = null;
    TextView debloque_projet3 = null;

    boolean projet_choisi = true;



    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choixprojetihm);

        //On récupère les vues
        accept_projet1 = (Button)findViewById(R.id.acc_projet1);
        accept_projet2 = (Button)findViewById(R.id.acc_projet2);
        accept_projet3 = (Button)findViewById(R.id.acc_projet3);
        accept_projet1.setVisibility(View.INVISIBLE);
        accept_projet2.setVisibility(View.INVISIBLE);
        accept_projet3.setVisibility(View.INVISIBLE);
        nom_projet1 = (TextView) findViewById(R.id.nom_projet1);
        nom_projet2 = (TextView) findViewById(R.id.nom_projet2);
        nom_projet3 = (TextView) findViewById(R.id.nom_projet3);
        descriptionprojet1 = (TextView) findViewById(R.id.descriptionprojet1);
        descriptionprojet2 = (TextView) findViewById(R.id.descriptionprojet2);
        descriptionprojet3 = (TextView) findViewById(R.id.descriptionprojet3);
        cont_branche_projet1 = (TextView) findViewById(R.id.cont_branche_projet1);
        cont_branche_projet2 = (TextView) findViewById(R.id.cont_branche_projet2);
        cont_branche_projet3 = (TextView) findViewById(R.id.cont_branche_projet3);
        cont_objectif_projet1 = (TextView) findViewById(R.id.cont_objectif_projet1);
        cont_objectif_projet2 = (TextView) findViewById(R.id.cont_objectif_projet2);
        cont_objectif_projet3 = (TextView) findViewById(R.id.cont_objectif_projet3);
        cont_recompense_projet1 = (TextView) findViewById(R.id.cont_recompense_projet1);
        cont_recompense_projet2 = (TextView) findViewById(R.id.cont_recompense_projet2);
        cont_recompense_projet3 = (TextView) findViewById(R.id.cont_recompense_projet3);
        cont_debloque_projet1 = (TextView) findViewById(R.id.cont_debloque_projet1);
        cont_debloque_projet2 = (TextView) findViewById(R.id.cont_debloque_projet2);
        cont_debloque_projet3 = (TextView) findViewById(R.id.cont_debloque_projet3);

        cat_projet1 = (TextView) findViewById(R.id.cat_projet1);
        Obj_projet1 = (TextView) findViewById(R.id.obj_projet1);
        rec_projet1 = (TextView) findViewById(R.id.rec_projet1);
        debloque_projet1 = (TextView) findViewById(R.id.debloque_projet1);
        cat_projet2 = (TextView) findViewById(R.id.cat_projet2);
        Obj_projet2 = (TextView) findViewById(R.id.obj_projet2);
        rec_projet2 = (TextView) findViewById(R.id.rec_projet2);
        debloque_projet2 = (TextView) findViewById(R.id.debloque_projet2);
        cat_projet3 = (TextView) findViewById(R.id.cat_projet3);
        Obj_projet3 = (TextView) findViewById(R.id.obj_projet3);
        rec_projet3 = (TextView) findViewById(R.id.rec_projet3);
        debloque_projet3 = (TextView) findViewById(R.id.debloque_projet3);

        if (Objects.equals(MainActivity.donnees.getProjet_courant_general(), "null")){
            //Rendre les boutons visibles
            accept_projet1.setVisibility(View.VISIBLE);
            accept_projet2.setVisibility(View.VISIBLE);
            accept_projet3.setVisibility(View.VISIBLE);
            //Affecter les listener
            accept_projet1.setOnClickListener(accepterProjetjeux_video);
            accept_projet2.setOnClickListener(accepterProjetsite_web);
            accept_projet3.setOnClickListener(accepterProjetlogiciel);
            projet_choisi = false;
        }


        //On récupère les 3 projets à afficher
        Projet projet1 = Liste_Projets.getProjet(MainActivity.donnees.getProjet_courant_jeux_video());
        Projet projet2 = Liste_Projets.getProjet(MainActivity.donnees.getProjet_courant_site_web());
        Projet projet3 = Liste_Projets.getProjet(MainActivity.donnees.getProjet_courant_logiciel());
        //Enfin, on remplit les TextView avec les valeurs des differents projets
        nom_projet1.setText(projet1.getNom());
        nom_projet2.setText(projet2.getNom());
        nom_projet3.setText(projet3.getNom());
        descriptionprojet1.setText(projet1.getDescription());
        descriptionprojet2.setText(projet2.getDescription());
        descriptionprojet3.setText(projet3.getDescription());
        cont_branche_projet1.setText(projet1.getBranche());
        cont_branche_projet2.setText(projet2.getBranche());
        cont_branche_projet3.setText(projet3.getBranche());
        String objp1 = (String.valueOf(projet1.getObjectif()));
        String objp2 = (String.valueOf(projet2.getObjectif()));
        String objp3 = (String.valueOf(projet3.getObjectif()));
        cont_objectif_projet1.setText(objp1);
        cont_objectif_projet2.setText(objp2);
        cont_objectif_projet3.setText(objp3);
        cont_recompense_projet1.setText(String.valueOf(projet1.getGainFinal()));
        cont_recompense_projet2.setText(String.valueOf(projet2.getGainFinal()));
        cont_recompense_projet3.setText(String.valueOf(projet3.getGainFinal()));
        cont_debloque_projet1.setText(projet1.getProjet_suivant());
        cont_debloque_projet2.setText(projet2.getProjet_suivant());
        cont_debloque_projet3.setText(projet3.getProjet_suivant());

        mettrePolices();

    }
    private View.OnClickListener accepterProjetjeux_video = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public void onClick(View v) {
            Projet courant = Liste_Projets.getProjet(MainActivity.donnees.getProjet_courant_jeux_video());
            MainActivity.donnees.setProjet_courant_general(courant.getNom());
            acceptation_generale(courant);
        }
    };
    private View.OnClickListener accepterProjetsite_web = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public void onClick(View v) {
            Projet courant = Liste_Projets.getProjet(MainActivity.donnees.getProjet_courant_site_web());
            MainActivity.donnees.setProjet_courant_general(courant.getNom());
            acceptation_generale(courant);
        }
    };
    private View.OnClickListener accepterProjetlogiciel = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public void onClick(View v){
            Projet courant = Liste_Projets.getProjet(MainActivity.donnees.getProjet_courant_logiciel());
            acceptation_generale(courant);
        }
    };
    public void acceptation_generale(Projet courant){
        projet_choisi = true;
        MainActivity.donnees.setProjet_courant_general(courant.getNom());
        MainActivity.donnees.setProjet_courant_general_id(courant.getprojectId());
        MainActivity.donnees.setLignes_de_code_courantes(0);
        MainActivity.projetCourant.setText(courant.getNom());
        MainActivity.objectif = courant.getObjectif();
        onBackPressed();
    }

    public void setFont(TextView textView) {
        try {
            Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/policePerso.TTF");
            textView.setTypeface(typeface);
        } catch (Exception e) {
            Log.e("FONT", "Font not found", e);
        }
    }

    public void mettrePolices (){
        setFont(nom_projet1);
        setFont(nom_projet2);
        setFont(nom_projet3);

    }

    @Override
    public void onBackPressed(){
        if (!projet_choisi){

            Toast toast = Toast.makeText(getApplicationContext(), "Veuillez choisir un projet.", LENGTH_SHORT);
            toast.show();
        }
        else {
            this.finish();
        }
    }
}
