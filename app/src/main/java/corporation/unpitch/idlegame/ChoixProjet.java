package corporation.unpitch.idlegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Un Pitch on 30/12/2016.
 */

public class ChoixProjet extends AppCompatActivity {

    Button accept_projet1 = null;
    Button accept_projet2 = null;
    Button accept_projet3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choixprojetihm);

        accept_projet1 = (Button)findViewById(R.id.acc_projet1);
        accept_projet2 = (Button)findViewById(R.id.acc_projet2);
        accept_projet3 = (Button)findViewById(R.id.acc_projet3);

        accept_projet1.setOnClickListener(accepterProjet);
        accept_projet2.setOnClickListener(accepterProjet);
        accept_projet3.setOnClickListener(accepterProjet);

    }
    private View.OnClickListener accepterProjet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inventaire = new Intent (ChoixProjet.this, MainActivity.class); // on declare la nouvelle activite reliee au bouton
            startActivity (inventaire); //on demarre l'activite
        }

    };
    @Override
    public void onBackPressed(){
        this.finish();
    }
}
