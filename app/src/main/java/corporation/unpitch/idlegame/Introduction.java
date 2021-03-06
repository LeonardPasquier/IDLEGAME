package corporation.unpitch.idlegame;

/**
 * Created by Un Pitch on 04/03/2017.
 */
import android.content.Intent;
import android.os.Build;
import android.support.annotation.MainThread;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

import static android.widget.Toast.LENGTH_SHORT;

public class Introduction  extends AppCompatActivity implements View.OnClickListener{

    Button boutonRetour;
    Button boutonSuivant;
    ImageView imageFond;
    EditText nom_ent;
    EditText nom_joueur;
    int compteur = 1;

    //La zone de texte des noms
    TextView scriptProjet = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_introduction);

        boutonRetour = (Button)findViewById(R.id.buttonRetour);
        boutonSuivant = (Button)findViewById(R.id.buttonSuivant);
        imageFond = (ImageView) findViewById(R.id.imageView);

        boutonRetour.setOnClickListener(this);
        boutonSuivant.setOnClickListener(this);

        int image = R.drawable.diplome;
        imageFond.setImageResource(image);


    }

    @Override
    public void onClick(View v)
    {
        //la gestion des boutons en fonction de leurs actions

        if (v.getId() == R.id.buttonRetour)
        {
            if (compteur == 1){
                System.out.println("non");
            }
            else if (compteur == 2){
                int image = R.drawable.diplome;
                imageFond.setImageResource(image);
                compteur -= 1;
            }
            else{
                int image = R.drawable.reflechissement;
                imageFond.setImageResource(image);
                compteur -= 1;
            }
        }
        else if (v.getId() == R.id.buttonSuivant)
        {
            if (compteur == 3){
                this.setContentView(R.layout.lay_intro_2);
                nom_ent = (EditText) findViewById(R.id.editText);
                nom_joueur = (EditText) findViewById(R.id.editText2);
            }
            else if (compteur==2){
                compteur += 1;
                int image = R.drawable.wouhouidee;
                imageFond.setImageResource(image);
            }
            else {
                compteur += 1;
                int image = R.drawable.reflechissement;
                imageFond.setImageResource(image);
            }
        }
        else if(v.getId() == R.id.button){

        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void onClickValider(View v) {
        String enterprise_name = nom_ent.getText().toString();
        String player_name = nom_joueur.getText().toString();
        if (Objects.equals(enterprise_name, "")){
            Toast toast = Toast.makeText(getApplicationContext(), "Veuillez rentrer un nom d'entreprise", LENGTH_SHORT);
            toast.show();
        }
        else if (Objects.equals(player_name, "")){
            Toast toast = Toast.makeText(getApplicationContext(), "Veuillez rentrer un nom de joueur", LENGTH_SHORT);
            toast.show();
        }
        else if(enterprise_name.length()>20){
            Toast toast = Toast.makeText(getApplicationContext(), "Le nom de l'entreprise ne doit pas excéder 20 caractères ", LENGTH_SHORT);
            toast.show();
        }

        else if(player_name.length()>20){
            Toast toast = Toast.makeText(getApplicationContext(), "Le nom du joueur ne doit pas excéder 20 caractères ", LENGTH_SHORT);
            toast.show();
        }
        else {
            MainActivity.donnees.setnom_entreprise(enterprise_name);
            MainActivity.donnees.setNom_joueur(player_name);
            MainActivity.nom_entreprise.setText(enterprise_name);
            Intent choix_projet = new Intent (Introduction.this, ChoixProjet.class);
            startActivity(choix_projet);
            finish();
        }
    }

    @Override
    public void onBackPressed (){
        if (compteur == 1){
            System.out.println("non");
        }
        else{
            int image = R.drawable.introduction1;
            imageFond.setImageResource(image);
            compteur -= 1;
        }
    }

}