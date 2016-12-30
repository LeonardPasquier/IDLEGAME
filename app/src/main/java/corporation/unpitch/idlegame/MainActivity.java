package corporation.unpitch.idlegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //yolo
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    Button incrementer = null;
    Button recruter = null;
    Button entreprise = null;
    Button inventaire = null;
    TextView compteurLignes = null;
    TextView compteurArgent = null;
    Donnees donnees = new Donnees(); //On cree la classe de donnees a enregistrer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On récupère toutes les vues dont on a besoin
        incrementer = (Button)findViewById(R.id.boutonClavier);
        recruter = (Button)findViewById(R.id.recruter);
        entreprise = (Button)findViewById(R.id.entreprise);
        inventaire = (Button)findViewById(R.id.inventaire);
        compteurLignes = (TextView)findViewById(R.id.compteurLignes);
        compteurArgent = (TextView) findViewById(R.id.compteurArgent);

        // On attribue un listener adapté aux vues qui en ont besoin
        incrementer.setOnClickListener(incrementerListener);
        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        inventaire.setOnClickListener(lienInventaire);

        try {
            //on charge le fichier de sauvegarde
            Donnees donnees = Charger.chargerObjet(this);
            //On affecte les differentes variables du fichier de donnees presentes dans la fenetre
            compteurLignes.setText(donnees.getLignes_de_code_courantes());
            compteurArgent.setText(donnees.getArgent());
        }
        catch (Exception ex){
            System.out.println("erreur lors du chargement du fichier");
        }

    }
    private View.OnClickListener incrementerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int ib = CompteurLigneCourant();
            ib = ib+1;
            String csb = String.valueOf(ib);
            compteurLignes.setText(csb);
        }
        };
    private View.OnClickListener lienRecrutement = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent recruter = new Intent (MainActivity.this, Recruter.class); // on declare la nouvelle activite reliee au bouton
            startActivity (recruter); //on demarre l'activite
        }

        };
    private View.OnClickListener lienEntreprise = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent entreprise = new Intent (MainActivity.this, Entreprise.class); // on declare la nouvelle activite reliee au bouton
            startActivity (entreprise); //on demarre l'activite
        }

    };
    private View.OnClickListener lienInventaire = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inventaire = new Intent (MainActivity.this, Inventaire.class); // on declare la nouvelle activite reliee au bouton
            startActivity (inventaire); //on demarre l'activite
        }

    };
    @Override
    public void onBackPressed(){
        donnees.setLignes_de_code_courantes(String.valueOf(CompteurLigneCourant()));
        Sauvegarder.sauvegarder(this, donnees);
        this.finish();
    }

    public int CompteurLigneCourant(){
        CharSequence csb = compteurLignes.getText();
        String str = String.valueOf(csb);
        int ib;
        ib = Integer.parseInt(str);
        return ib;
    }
    public static String getCompteurLigneCourant(){
        String valeur = "03";
        return valeur;
    }
}
