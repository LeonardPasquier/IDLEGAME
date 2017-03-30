package corporation.unpitch.idlegame;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static corporation.unpitch.idlegame.Liste_Item.*;
import static corporation.unpitch.idlegame.R.drawable.ordi_principal_2;
import static corporation.unpitch.idlegame.R.drawable.ordi_principal_3;
import static corporation.unpitch.idlegame.R.drawable.ordi_principal_4;
import static corporation.unpitch.idlegame.R.id.principalLayout;

/**
 * Created by Helicose on 03/11/2016.
 */

public class Inventaire extends AppCompatActivity{

    Button recruter = null;
    Button entreprise = null;
    Button inventaire = null;

    Button item_1 = null;
    Button item_1_2 = null;
    Button item_1_3 = null;
    Button item_2 = null;
    Button item_2_2 = null;
    Button item_2_3 = null;
    Button item_3 = null;
    Button item_3_2 = null;
    Button item_3_3 = null;

    TextView textOrdi = null;
    TextView textAntivirus = null;
    TextView textServeur = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventaireihm);
        //On récupère les vues du menu
        recruter = (Button)findViewById(R.id.recruter);
        entreprise = (Button)findViewById(R.id.entreprise);
        inventaire = (Button)findViewById(R.id.inventaire);
        //Les vues de l'interface de l'inventaire
        item_1 = (Button)findViewById(R.id.Item1_1);
        item_1_2 = (Button)findViewById(R.id.Item1_2);
        item_1_3 = (Button)findViewById(R.id.item1_3);
        item_2 = (Button)findViewById(R.id.Item2_1);
        item_2_2 = (Button)findViewById(R.id.Item2_2);
        item_2_3 = (Button)findViewById(R.id.Item2_3);
        item_3 = (Button)findViewById(R.id.Item3_1);
        item_3_2 = (Button)findViewById(R.id.Item3_2);
        item_3_3 = (Button)findViewById(R.id.Item3_3);

        textAntivirus = (TextView)findViewById(R.id.textAntivirus);
        textOrdi = (TextView)findViewById(R.id.textOrdi);
        textServeur = (TextView)findViewById(R.id.textServeur);

        mettrePolices();

        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        //inventaire.setOnClickListener(lienInventaire);

        if (MainActivity.donnees.getNombre_ordinateurs_faibles() == 1){
            item_1.setText("Vous avez déjà acheté cet ordinateur ! Chaque clic rapporte maintenant "+MainActivity.donnees.getValeur_du_clic()+" lignes de code !");
            item_1.setOnClickListener(itemIndispo);
        }
        else {
            item_1.setText(ordinateurfaible.getNom() + "\nPrix : 1000" + "\n" + ordinateurfaible.getDesc());
            item_1.setOnClickListener(lienOrdinateur);
        }
        if (MainActivity.donnees.getNombre_ordinateurs_moyens() == 1){
            item_1_2.setText("Vous avez déjà acheté cet ordinateur ! Chaque clic rapporte maintenant "+MainActivity.donnees.getValeur_du_clic()+" lignes de code !");
            item_1_2.setOnClickListener(itemIndispo);
        }
        else {
            item_1_2.setText(ordinateurmoyen.getNom() + "\nPrix : 5500" + "\n" + ordinateurmoyen.getDesc());
            item_1_2.setOnClickListener(lienOrdinateur2);
        }
        if (MainActivity.donnees.getNombre_ordinateurs_badass() == 1){
            item_1_3.setText("Vous avez déjà acheté cet ordinateur ! Chaque clic rapporte maintenant "+MainActivity.donnees.getValeur_du_clic()+" lignes de code !");
            item_1_3.setOnClickListener(itemIndispo);
        }
        else {
            item_1_3.setText(ordinateurbadass.getNom() + "\nPrix : 11000" + "\n" + ordinateurbadass.getDesc());
            item_1_3.setOnClickListener(lienOrdinateur3);
        }
/*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
        if (MainActivity.donnees.getNombre_antivirus_faibles() == 1){
            item_2.setText("Vous avez déjà acheté cet antivirus ! Les virus ont un peut moins de chance de vous atteindre.");
            item_2.setOnClickListener(itemIndispo);
        }
        else {
            item_2.setText(antivirusfaible.getNom() + "\nPrix : 500" + "\n" + antivirusfaible.getDesc());
            item_2.setOnClickListener(lienAntivirus);
        }
        if (MainActivity.donnees.getNombre_antivirus_moyens() == 1){
            item_2_2.setText("Vous avez déjà acheté cet antivirus ! Les virus ont moins de chance de vous atteindre.");
            item_2_2.setOnClickListener(itemIndispo);
        }
        else {
            item_2_2.setText(antivirusmoyen.getNom() + "\nPrix : 5500" + "\n" + antivirusmoyen.getDesc());
            item_2_2.setOnClickListener(lienAntivirus2);
        }
        if (MainActivity.donnees.getNombre_antivirus_badass() == 1){
            item_2_3.setText("Vous avez déjà acheté cet antivirus ! Les virus n'ont aucune chance de vous atteindre.");
            item_2_3.setOnClickListener(itemIndispo);
        }
        else {
            item_2_3.setText(antivirusbadass.getNom() + "\nPrix : 50000" + "\n" + antivirusbadass.getDesc());
            item_2_3.setOnClickListener(lienAntivirus3);
        }
/*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
        item_3.setText(serveurfaible.getNom() + "\n\nPrix : 500" + "\n" + serveurfaible.getDesc()+"\nActuellement possédés :"+MainActivity.donnees.getNombre_serveurs_faibles());
        item_3_2.setText(serveurmoyen.getNom() + "\n\nPrix : 1200" + "\n" + serveurmoyen.getDesc()+"\nActuellement possédés :"+MainActivity.donnees.getNombre_serveurs_moyens());
        item_3_3.setText(serveurbadass.getNom() + "\n\nPrix : 5000" + "\n" + serveurbadass.getDesc()+"\nActuellement possédés :"+MainActivity.donnees.getNombre_serveurs_badass());
        item_3.setOnClickListener(lienServeur);
        item_3_2.setOnClickListener(lienServeur2);
        item_3_3.setOnClickListener(lienServeur3);

    }
    private View.OnClickListener lienOrdinateur = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 1000) {
                MainActivity.donnees.setValeur_du_clic(MainActivity.donnees.getValeur_du_clic()+1);
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent() - 1000);
                MainActivity.donnees.setNombre_ordinateurs_faibles(1);
                item_1.setText("Vous avez déjà acheté cet ordinateur ! Chaque clic rapporte maintenant "+MainActivity.donnees.getValeur_du_clic()+" lignes de code !");
                item_1.setOnClickListener(itemIndispo);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    MainActivity.principalLayout.setBackground(getResources().getDrawable(ordi_principal_2));
                }
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienOrdinateur2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 5500) {
                MainActivity.donnees.setValeur_du_clic(MainActivity.donnees.getValeur_du_clic()+5);
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent() - 5500);
                MainActivity.donnees.setNombre_ordinateurs_moyens(1);
                item_1_2.setText("Vous avez déjà acheté cet ordinateur ! Chaque clic rapporte maintenant "+MainActivity.donnees.getValeur_du_clic()+" lignes de code !");
                item_1_2.setOnClickListener(itemIndispo);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    MainActivity.principalLayout.setBackground(getResources().getDrawable(ordi_principal_3));
                }
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienOrdinateur3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 11000) {
                MainActivity.donnees.setValeur_du_clic(MainActivity.donnees.getValeur_du_clic()+10);
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent() - 11000);
                MainActivity.donnees.setNombre_ordinateurs_badass(1);
                item_1_3.setText("Vous avez déjà acheté cet ordinateur ! Chaque clic rapporte maintenant "+MainActivity.donnees.getValeur_du_clic()+" lignes de code !");
                item_1_3.setOnClickListener(itemIndispo);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    MainActivity.principalLayout.setBackground(getResources().getDrawable(ordi_principal_4));
                }
            }
            else{
                pasdargent();
            }
        }
    };


    private View.OnClickListener lienAntivirus = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 500) {
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-500);
                MainActivity.donnees.setNombre_antivirus_faibles(1);
                item_2.setText("Vous avez déjà acheté cet antivirus ! Les virus ont un peut moins de chance de vous atteindre.");
                item_2.setOnClickListener(itemIndispo);

            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienAntivirus2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 5500) {
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-5500);
                MainActivity.donnees.setNombre_antivirus_moyens(1);
                item_2_2.setText("Vous avez déjà acheté cet antivirus ! Les virus ont moins de chance de vous atteindre.");
                item_2_2.setOnClickListener(itemIndispo);

            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienAntivirus3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 50000) {
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent()-50000);
                MainActivity.donnees.setNombre_antivirus_badass(1);
                item_2_3.setText("Vous avez déjà acheté cet antivirus ! Les virus n'ont aucune chance de vous atteindre.");
                item_2_3.setOnClickListener(itemIndispo);
            }
            else{
                pasdargent();
            }
        }
    };


    private View.OnClickListener lienServeur = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 500) {
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent() - 500);
                MainActivity.donnees.setNombre_serveurs_faibles(MainActivity.donnees.getNombre_serveurs_faibles()+1);
                item_3.setText(serveurfaible.getNom() + "\n\nPrix : 500" + "\n" + serveurfaible.getDesc()+"\nActuellement possédés :"+MainActivity.donnees.getNombre_serveurs_faibles());
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienServeur2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 1200) {
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent() - 1200);
                MainActivity.donnees.setNombre_serveurs_moyens(MainActivity.donnees.getNombre_serveurs_moyens()+1);
                item_3_2.setText(serveurmoyen.getNom() + "\n\nPrix : 1200" + "\n" + serveurmoyen.getDesc()+"\nActuellement possédés :"+MainActivity.donnees.getNombre_serveurs_moyens());
            }
            else{
                pasdargent();
            }
        }
    };
    private View.OnClickListener lienServeur3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (MainActivity.donnees.getArgent() >= 5000) {
                MainActivity.donnees.setArgent(MainActivity.donnees.getArgent() - 5000);
                MainActivity.donnees.setNombre_serveurs_badass(MainActivity.donnees.getNombre_serveurs_badass()+1);
                item_3_3.setText(serveurbadass.getNom() + "\n\nPrix : 5000" + "\n" + serveurbadass.getDesc()+"\nActuellement possédés :"+MainActivity.donnees.getNombre_serveurs_badass());
            }
            else{
                pasdargent();
            }
        }
    };


    private View.OnClickListener itemIndispo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Context context = getApplicationContext();
            CharSequence text = "Vous ne pouvez plus acheter cet item !";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
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
        setFont(textAntivirus);
        setFont(textOrdi);
        setFont(textServeur);
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
}
