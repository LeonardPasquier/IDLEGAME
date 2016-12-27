package corporation.unpitch.idlegame;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.String;

/**
 * Created by Un Pitch on 21/12/2016.
 */

public class Sauvegarder{
    static String nom_fichier = "sauvegarde";

    static void sauvegarder(Context ctx){
        Donnees donnees = new Donnees(); //On cree la classe de donnees a enregistrer
        donnees.setLignes_de_code_total("05");
        donnees.setLignes_de_code_courantes("03" );
        donnees.setArgent("99999£");
        donnees.setArgent_total("78787878£");
        donnees.setNombre_dev_e("10");
        donnees.setNombre_dev_j("50");
        donnees.setNombre_dev_s("3");
        donnees.setProjet_courant("8");
        try
        {
            FileOutputStream fos = ctx.openFileOutput("sauvegarde", Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(donnees);
            oos.close();
            System.out.println("sauvegarde effectuee");
        }
        catch(Exception ex)
        {
            Log.v("SerializationError-s : ",ex.getMessage()); //Erreur pendant la serialization
            ex.printStackTrace();
        }
    }
}
