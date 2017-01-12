package corporation.unpitch.idlegame;

import android.content.DialogInterface;
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
    Button recrue5 = null;
    Button recrue6 = null;
    Button recrue7 = null;
    Button recrue8 = null;
    Button recrue9 = null;
    Button recrue10 = null;
    Button recrue11 = null;
    Button recrue12 = null;

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
        recrue5 = (Button)findViewById(R.id.recrue5);
        recrue6 = (Button)findViewById(R.id.recrue6);
        recrue7 = (Button)findViewById(R.id.recrue7);
        recrue8 = (Button)findViewById(R.id.recrue8);
        recrue9 = (Button)findViewById(R.id.recrue9);
        recrue10 = (Button)findViewById(R.id.recrue10);
        recrue11 = (Button)findViewById(R.id.recrue11);
        recrue12 = (Button)findViewById(R.id.recrue12);


        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        inventaire.setOnClickListener(lienInventaire);

        recrue1.setText(developpeurJunior.getNom() + "\n Prix : 500" + "\n" + developpeurJunior.getDesc() + "\n Actuellement possédés : " + developpeurJunior.getPossede());
        recrue2.setText(developpeurExpert.getNom() + "\n Prix : 4500" + "\n" + developpeurExpert.getDesc() + "\n Actuellement possédés : " + developpeurExpert.getPossede());
        recrue3.setText(developpeurSenior.getNom() + "\n Prix : 20000" + "\n" + developpeurSenior.getDesc() + "\n Actuellement possédés : " + developpeurSenior.getPossede());
        //recrue4.setText(chefProjet.getNom() + " Junior \n Prix : " + chefProjet.getPrix() + "\n" + chefProjet.getDesc());
        recrue4.setText("Niveau Junior prochainement");
        recrue5.setText("Niveau Expert prochainement");
        recrue6.setText("Niveau Senior prochainement");
        //recrue7.setText(comptable.getNom() + " Junior \n Prix : " + comptable.getPrix() + "\n" + comptable.getDesc());
        recrue7.setText("Niveau Junior prochainement");
        recrue8.setText("Niveau Expert prochainement");
        recrue9.setText("Niveau Senior prochainement");
        //recrue10.setText(adminReseau.getNom() + " Junior \n Prix : " + adminReseau.getPrix() + "\n" + adminReseau.getDesc());
        recrue10.setText("Niveau Junior prochainement");
        recrue11.setText("Niveau Expert prochainement");
        recrue12.setText("Niveau Senior prochainement");

        recrue1.setOnClickListener(lienDevJunior);
        recrue2.setOnClickListener(lienDevExpert);
        recrue3.setOnClickListener(lienDevSenior);
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


    private View.OnClickListener lienDevJunior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 750) {
                recrue1.setText(developpeurJunior.getNom() + "\n Prix : 500" + "\n" + developpeurJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_j());
                MainActivity.donnees.setNombre_dev_j(MainActivity.donnees.getNombre_dev_j()+1);
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-750);

            }

        }
    };
    private View.OnClickListener lienDevExpert = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 4500) {
                recrue2.setText(developpeurExpert.getNom() + "\n Prix : 4500" + "\n" + developpeurExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_e());
                MainActivity.donnees.setNombre_dev_e(MainActivity.donnees.getNombre_dev_e()+1);
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-4500);

            }

        }
    };
    private View.OnClickListener lienDevSenior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 20000) {
                recrue3.setText(developpeurSenior.getNom() + "\n Prix : 20000" + "\n" + developpeurSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_s());
                MainActivity.donnees.setNombre_dev_s(MainActivity.donnees.getNombre_dev_s()+1);
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-20000);

            }

        }
    };
    @Override
    public void onBackPressed(){
        this.finish();
    }
}
