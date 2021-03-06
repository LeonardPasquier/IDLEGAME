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

class Sauvegarder{

    static void sauvegarder(Context ctx, Donnees donnees, String nom_fichier){

        try
        {

            System.out.println(donnees.getArgent());
            FileOutputStream fos = ctx.openFileOutput(nom_fichier, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(donnees);
            oos.close();
            System.out.println("sauvegarde donnees effectuee");
        }
        catch(Exception ex)
        {
            Log.v("SerializationError-s : ",ex.getMessage()); //Erreur pendant la serialization
            ex.printStackTrace();
        }
    }
}
