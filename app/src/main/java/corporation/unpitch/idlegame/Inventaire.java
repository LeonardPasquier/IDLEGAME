package corporation.unpitch.idlegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Helicose on 03/11/2016.
 */

public class Inventaire extends AppCompatActivity{

    Button recruter = null;
    Button entreprise = null;
    Button inventaire = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventaireihm);

        recruter = (Button)findViewById(R.id.recruter);
        entreprise = (Button)findViewById(R.id.entreprise);
        inventaire = (Button)findViewById(R.id.inventaire);

        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        //inventaire.setOnClickListener(lienInventaire);


    }

    private View.OnClickListener lienRecrutement = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent recruter = new Intent (Inventaire.this, Recruter.class); // on declare la nouvelle activite reliee au bouton
            startActivity (recruter); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    private View.OnClickListener lienEntreprise = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent entreprise = new Intent (Inventaire.this, Entreprise.class); // on declare la nouvelle activite reliee au bouton
            startActivity (entreprise); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    private View.OnClickListener lienInventaire = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inventaire = new Intent (Inventaire.this, Inventaire.class); // on declare la nouvelle activite reliee au bouton
            startActivity (inventaire); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
}
