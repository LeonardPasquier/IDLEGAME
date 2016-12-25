package corporation.unpitch.idlegame;

import android.util.Log;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Un Pitch on 21/12/2016.
 */

public class Sauvegarder{
    static String nom_fichier = "sauvegarde.tmp";

    public void sauvegarder(){
        Donnees donnees = new Donnees(); //On cree la classe de donnees a enregistrer
        donnees.setLignes_de_code_total("10");
        donnees.setLignes_de_code_courantes("10");
        donnees.setArgent("99999£");
        donnees.setArgent_total("78787878£");
        donnees.setNombre_dev_e("10");
        donnees.setNombre_dev_j("50");
        donnees.setNombre_dev_s("3");
        donnees.setProjet_courant("8");
        try
        {

            FileOutputStream fos = new FileOutputStream(nom_fichier);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(donnees);

            oos.close();
        }
        catch(Exception ex)
        {
            Log.v("SerializationError-s : ",ex.getMessage()); //Erreur pendant la serialization
            ex.printStackTrace();
        }
    }
}
