package corporation.unpitch.idlegame;

import android.app.Activity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Un Pitch on 09/01/2017.
 */

public class Incrementation_automatique {

    static int maligne=0;
    public static void attendre(int nombre_dev_j, int nombre_dev_e, int nombre_dev_s, int nombre_chef_projet_j, int nombre_chef_projet_e, int nombre_chef_projet_s, final MainActivity myActivity){
        final int devj = nombre_dev_j;
        final int deve = nombre_dev_e;
        final int devs = nombre_dev_s;
        final int chefj = nombre_chef_projet_j;
        final int chefe = nombre_chef_projet_e;
        final int chefs = nombre_chef_projet_s;

        Timer timer = new Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {
                int lignes = myActivity.getCompteurLigneCourant();
                int nombre_lignes = 0;
                nombre_lignes = Mult_dev(devj, deve, devs);
                nombre_lignes = Mult_chef_projet(nombre_lignes, chefj, chefe, chefs);
                maligne = nombre_lignes;
                System.out.println(maligne);

                myActivity.runOnUiThread(createRunnableForUI(nombre_lignes, lignes));
            }
            private Runnable createRunnableForUI (final int compteur, final int lignes){
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        int yata = compteur + lignes;
                        System.out.println("lama" + yata);
                        myActivity.compteurLignes.setText(String.valueOf(yata));
                    }
                };
                return r;
            }
        };
        timer.schedule(myTask, 1000, 1000);

    }
    public static int Mult_dev(int j, int e, int s){
        int n;
        n = j*1+e*10+s*50; //le junior produit 1/s, l'expert 10/s, le senor 50/s
        return n; //on renvoie le nombre a additionne, qui sera ensuite
    }
    public static int Mult_chef_projet(int n, int j, int e, int s){
        int x = 0;
        while (x<j){
            n = n*2;
        }
        while (x<e){
            n = n*3;
        }
        while (x<s){
            n = n*4;
        }
        return n;
    }

}
