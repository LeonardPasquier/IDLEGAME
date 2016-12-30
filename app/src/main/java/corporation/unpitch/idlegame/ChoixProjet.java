package corporation.unpitch.idlegame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    }
    @Override
    public void onBackPressed(){
        this.finish();
    }
}
