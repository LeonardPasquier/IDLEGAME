package corporation.unpitch.idlegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static corporation.unpitch.idlegame.Liste_Item.*;

/**
 * Created by Helicose on 03/11/2016.
 */

public class Inventaire extends AppCompatActivity{

    Button recruter = null;
    Button entreprise = null;
    Button inventaire = null;

    Button item_1 = null;
    Button item_2 = null;
    Button item_3 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventaireihm);
        //On récupère les vues du menu
        recruter = (Button)findViewById(R.id.recruter);
        entreprise = (Button)findViewById(R.id.entreprise);
        inventaire = (Button)findViewById(R.id.inventaire);
        //Les vues de l'interface de l'inventaire
        item_1 = (Button)findViewById(R.id.item1_1);
        item_2 = (Button)findViewById(R.id.item2_1);
        item_3 = (Button)findViewById(R.id.item3_1);

        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        //inventaire.setOnClickListener(lienInventaire);

        item_1.setText(ordinateur.getNom() + "\n\nPrix : " + ordinateur.getPrix() + "\n" + ordinateur.getDesc());
        item_2.setText(antivirus.getNom() + "\n\nPrix : " + antivirus.getPrix() + "\n" + antivirus.getDesc());
        item_3.setText(serveur.getNom() + "\n\nPrix : " + serveur.getPrix() + "\n" + serveur.getDesc());
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
