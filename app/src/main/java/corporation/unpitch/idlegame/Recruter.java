package corporation.unpitch.idlegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static corporation.unpitch.idlegame.Liste_Recrue.*;

/**
 * Created by Un Pitch on 03/11/2016.
 */

public class Recruter extends AppCompatActivity{

    Button recruter = null;
    Button entreprise = null;
    Button inventaire = null;

    Button recrue1 = null;
    Button recrue2 = null;
    Button recrue3 = null;
    Button recrue4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recruterihm);

        recruter = (Button)findViewById(R.id.recruter);
        entreprise = (Button)findViewById(R.id.entreprise);
        inventaire = (Button)findViewById(R.id.inventaire);

        recrue1 = (Button)findViewById(R.id.recrue1);
        recrue2 = (Button)findViewById(R.id.recrue2);
        recrue3 = (Button)findViewById(R.id.recrue3);
        recrue4 = (Button)findViewById(R.id.recrue4);

        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        inventaire.setOnClickListener(lienInventaire);

        recrue1.setText(developpeur.getNom() + "\n Prix : " + developpeur.getPrix() + "\n" + developpeur.getDesc());
        recrue2.setText(chefProjet.getNom() + "\n Prix : " + chefProjet.getPrix() + "\n" + chefProjet.getDesc());
        recrue3.setText(comptable.getNom() + "\n Prix : " + comptable.getPrix() + "\n" + comptable.getDesc());
        recrue4.setText(adminReseau.getNom() + "\n Prix : " + adminReseau.getPrix() + "\n" + adminReseau.getDesc());
    }

    private View.OnClickListener lienRecrutement = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent recruter = new Intent (Recruter.this, Recruter.class); // on declare la nouvelle activite reliee au bouton
            startActivity (recruter); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    private View.OnClickListener lienEntreprise = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent entreprise = new Intent (Recruter.this, Entreprise.class); // on declare la nouvelle activite reliee au bouton
            startActivity (entreprise); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    private View.OnClickListener lienInventaire = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inventaire = new Intent (Recruter.this, Inventaire.class); // on declare la nouvelle activite reliee au bouton
            startActivity (inventaire); //on demarre l'activite
            finish(); //permet de supprimer l'activite courante de la liste d'activités, et donc de retourner à l'accueil quand on clique sur retour
        }

    };
    @Override
    public void onBackPressed(){
            this.finish();
    }
}
