package corporation.unpitch.idlegame;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    TextView textDev = null;
    TextView textChefs = null;
    TextView textAdmin = null;
    TextView textComptable = null;

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

        textDev = (TextView)findViewById(R.id.textDev);
        textComptable = (TextView)findViewById(R.id.textComptable);
        textAdmin = (TextView)findViewById(R.id.textAdmin);
        textChefs = (TextView)findViewById(R.id.textChefs);

        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        inventaire.setOnClickListener(lienInventaire);

        recrue1.setText(developpeurJunior.getNom() + "\n Prix : 500" + "\n" + developpeurJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_j());
        recrue2.setText(developpeurExpert.getNom() + "\n Prix : 4500" + "\n" + developpeurExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_e());
        recrue3.setText(developpeurSenior.getNom() + "\n Prix : 20000" + "\n" + developpeurSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_s());
        //recrue4.setText(chefProjet.getNom() + " Junior \n Prix : " + chefProjet.getPrix() + "\n" + chefProjet.getDesc());
        recrue4.setText(chefProjetJunior.getNom() + "\n Prix : 500" + "\n" + chefProjetJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_chef_projet_j());
        recrue5.setText(chefProjetExpert.getNom() + "\n Prix : 500" + "\n" + chefProjetExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_chef_projet_e());
        recrue6.setText(chefProjetSenior.getNom() + "\n Prix : 500" + "\n" + chefProjetSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_chef_projet_s());
        //recrue7.setText(comptable.getNom() + " Junior \n Prix : " + comptable.getPrix() + "\n" + comptable.getDesc());
        recrue7.setText(comptableJunior.getNom() + "\n Prix : 500" + "\n" + comptableJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_comptables_j());
        recrue8.setText(comptableExpert.getNom() + "\n Prix : 500" + "\n" + comptableExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_comptables_e());
        recrue9.setText(comptableSenior.getNom() + "\n Prix : 500" + "\n" + comptableSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_comptables_s());
        //recrue10.setText(adminReseau.getNom() + " Junior \n Prix : " + adminReseau.getPrix() + "\n" + adminReseau.getDesc());
        recrue10.setText(adminReseauJunior.getNom() + "\n Prix : 500" + "\n" + adminReseauJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_admins_j());
        recrue11.setText(adminReseauExpert.getNom() + "\n Prix : 500" + "\n" + adminReseauExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_admins_e());
        recrue12.setText(adminReseauSenior.getNom() + "\n Prix : 500" + "\n" + adminReseauSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_admins_s());

        recrue1.setOnClickListener(lienDevJunior);
        recrue2.setOnClickListener(lienDevExpert);
        recrue3.setOnClickListener(lienDevSenior);
        recrue4.setOnClickListener(lienChefJunior);
        recrue5.setOnClickListener(lienChefExpert);
        recrue6.setOnClickListener(lienChefSenior);
        recrue7.setOnClickListener(lienComptableJunior);
        recrue8.setOnClickListener(lienComptableExpert);
        recrue9.setOnClickListener(lienComptableSenior);
        recrue10.setOnClickListener(lienAdminJunior);
        recrue11.setOnClickListener(lienAdminExpert);
        recrue12.setOnClickListener(lienAdminSenior);

        mettrePolices();
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
                MainActivity.donnees.setNombre_dev_j(MainActivity.donnees.getNombre_dev_j()+1);
                recrue1.setText(developpeurJunior.getNom() + "\n Prix : 500" + "\n" + developpeurJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_j());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-750);
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienDevExpert = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 4500) {
                MainActivity.donnees.setNombre_dev_e(MainActivity.donnees.getNombre_dev_e()+1);
                recrue2.setText(developpeurExpert.getNom() + "\n Prix : 4500" + "\n" + developpeurExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_e());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-4500);
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienDevSenior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 20000) {
                MainActivity.donnees.setNombre_dev_s(MainActivity.donnees.getNombre_dev_s()+1);
                recrue3.setText(developpeurSenior.getNom() + "\n Prix : 20000" + "\n" + developpeurSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_dev_s());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-20000);
            }
            else{
                pasdargent();
            }
        }
    };

    private View.OnClickListener lienChefJunior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 750) {
                MainActivity.donnees.setNombre_chef_projet_j(MainActivity.donnees.getNombre_chef_projet_j()+1);
                recrue4.setText(chefProjetJunior.getNom() + "\n Prix : 500" + "\n" + chefProjetJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_chef_projet_j());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-750);
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienChefExpert = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 4500) {
                MainActivity.donnees.setNombre_chef_projet_e(MainActivity.donnees.getNombre_chef_projet_e()+1);
                recrue5.setText(chefProjetExpert.getNom() + "\n Prix : 500" + "\n" + chefProjetExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_chef_projet_e());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-4500);
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienChefSenior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 20000) {
                MainActivity.donnees.setNombre_chef_projet_s(MainActivity.donnees.getNombre_chef_projet_s()+1);
                recrue6.setText(chefProjetSenior.getNom() + "\n Prix : 500" + "\n" + chefProjetSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_chef_projet_s());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-20000);
            }
            else{
                pasdargent();
            }
        }
    };

    private View.OnClickListener lienComptableJunior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 750) {
                MainActivity.donnees.setNombre_comptables_j(MainActivity.donnees.getNombre_comptables_j()+1);
                recrue7.setText(comptableJunior.getNom() + "\n Prix : 500" + "\n" + comptableJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_comptables_j());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-750);
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienComptableExpert = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 4500) {
                MainActivity.donnees.setNombre_comptables_e(MainActivity.donnees.getNombre_comptables_e()+1);
                recrue8.setText(comptableExpert.getNom() + "\n Prix : 500" + "\n" + comptableExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_comptables_e());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-4500);
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienComptableSenior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 20000) {
                MainActivity.donnees.setNombre_comptables_s(MainActivity.donnees.getNombre_comptables_s()+1);
                recrue9.setText(comptableSenior.getNom() + "\n Prix : 500" + "\n" + comptableSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_comptables_s());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-20000);
            }
            else{
                pasdargent();
            }
        }
    };

    private View.OnClickListener lienAdminJunior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 750) {
                MainActivity.donnees.setNombre_admin_j(MainActivity.donnees.getNombre_admins_j()+1);
                recrue10.setText(adminReseauJunior.getNom() + "\n Prix : 500" + "\n" + adminReseauJunior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_admins_j());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-750);
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienAdminExpert = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 4500) {
                MainActivity.donnees.setNombre_admin_e(MainActivity.donnees.getNombre_admins_e()+1);
                recrue11.setText(adminReseauExpert.getNom() + "\n Prix : 500" + "\n" + adminReseauExpert.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_admins_e());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-4500);
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienAdminSenior = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if (MainActivity.donnees.getArgent() >= 20000) {
                MainActivity.donnees.setNombre_admin_s(MainActivity.donnees.getNombre_admins_s()+1);
                recrue12.setText(adminReseauSenior.getNom() + "\n Prix : 500" + "\n" + adminReseauSenior.getDesc() + "\n Actuellement possédés : " + MainActivity.donnees.getNombre_admins_s());
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-20000);
            }
            else{
                pasdargent();
            }
        }
    };

    public void pasdargent(){
        Context context = getApplicationContext();
        CharSequence text = "Vous n'avez pas assez d'argent !";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
        setFont(textAdmin);
        setFont(textChefs);
        setFont(textComptable);
        setFont(textDev);
    }

    @Override
    public void onBackPressed(){
        this.finish();
    }
    }



