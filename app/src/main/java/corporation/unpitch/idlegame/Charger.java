package corporation.unpitch.idlegame;

import android.util.Log;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by Un Pitch on 25/12/2016.
 */

public class Charger {
    public static Donnees chargerObjet(){//La methode chargerObjet va retourner un objet de type Donnees
        try
        {
            FileInputStream fis = new FileInputStream(Sauvegarder.nom_fichier);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Donnees donnees = (Donnees) ois.readObject(); //le (Donnees) permet au ois.readObject de savoir que l'objet lu sera du type Donnees
            return donnees;
        }
        catch(Exception ex)
        {
            Log.v("SerializationError-l : ",ex.getMessage());//Erreur pendant la lecture du fichier
            ex.printStackTrace();
        }
        return null;
    }
}
