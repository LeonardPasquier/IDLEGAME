package corporation.unpitch.idlegame;
//Test de la branche local sur Macbook Pro
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageButton incrementer = null;
    Button recruter = null;
    Button entreprise = null;
    Button inventaire = null;
    TextView compteurLignes = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On récupère toutes les vues dont on a besoin
        incrementer = (ImageButton)findViewById(R.id.imageButton);
        recruter = (Button)findViewById(R.id.recruter);
        entreprise = (Button)findViewById(R.id.entreprise);
        inventaire = (Button)findViewById(R.id.inventaire);
        compteurLignes = (TextView)findViewById(R.id.compteurLignes);

        // On attribue un listener adapté aux vues qui en ont besoin
        incrementer.setOnClickListener(incrementerListener);
        recruter.setOnClickListener(lienRecrutement);
        entreprise.setOnClickListener(lienEntreprise);
        inventaire.setOnClickListener(incrementerListener);
    }
    private View.OnClickListener incrementerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            CharSequence csb;
            csb = compteurLignes.getText();
            String sb;
            sb = String.valueOf(csb);
            int ib;
            ib = Integer.parseInt(sb);
            ib = ib+1;
            csb = String.valueOf(ib);
            compteurLignes.setText(csb);
        }
        };
    private View.OnClickListener lienRecrutement = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            System.out.println("Ca rentre la");
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
}
