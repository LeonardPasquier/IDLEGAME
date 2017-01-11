package corporation.unpitch.idlegame;

import android.content.Context;
import android.util.Log;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by Un Pitch on 25/12/2016.
 */


class Charger {

    //Si on veut charger des donnees de sauvegarde
    static Donnees chargerDonnee(Context ctx, String nom_fichier){//La methode chargerObjet va retourner un objet de type Donnees
        try
        {
            FileInputStream fis = ctx.openFileInput(nom_fichier);
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (Donnees) ois.readObject();
        }
        catch(Exception ex)
        {
            MainActivity.presence_fichier = false;
            Log.v("SerializationError-l : ",ex.getMessage());//Erreur pendant la lecture du fichier
            ex.printStackTrace();
        }
        return null;
    }
}
