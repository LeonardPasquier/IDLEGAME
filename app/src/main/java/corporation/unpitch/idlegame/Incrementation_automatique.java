package corporation.unpitch.idlegame;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Un Pitch on 09/01/2017.
 */

public class Incrementation_automatique {

    static int virusencours = 0;
    private static int timerVirus = 0;
    private static float maligne=0;
    static float duree = 60;
    private static float tempsrestantvirus = -1;
    public static void attendre(final MainActivity myActivity){


        Timer timer = new Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {
                final int devj = (int) MainActivity.donnees.getNombre_dev_j();
                final int deve = (int) MainActivity.donnees.getNombre_dev_e();
                final int devs = (int) MainActivity.donnees.getNombre_dev_s();
                final int chefj = (int) MainActivity.donnees.getNombre_chef_projet_j();
                final int chefe = (int) MainActivity.donnees.getNombre_chef_projet_e();
                final int chefs = (int) MainActivity.donnees.getNombre_chef_projet_s();
                final float argent = MainActivity.donnees.getArgent();
                final float objectif = MainActivity.objectif;
                float lignes = myActivity.getCompteurLigneCourant();
                float nombre_lignes = 0;
                nombre_lignes = Mult_dev(devj, deve, devs);
                nombre_lignes = Mult_chef_projet(nombre_lignes, chefj, chefe, chefs);
                maligne = nombre_lignes;

                myActivity.runOnUiThread(createRunnableForUI(maligne, lignes, objectif, argent));
            }
            private Runnable createRunnableForUI (final float compteur, final float lignes, final float objectif, final float argent){
                return new Runnable() {
                    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                    @Override
                    public void run() {
                        if (!Objects.equals(MainActivity.donnees.getProjet_courant_general(), "null")) {

                            timerVirus += 1;
                            tempsrestantvirus -= 1;
                            if (timerVirus == 30){
                                if (virusencours==0){
                                    ouaisouaisouaislevirus(myActivity);
                                    calculDureeVirus();
                                }
                            }
                            if (virusencours == 1) {
                                if (tempsrestantvirus <= 0) {
                                    lafinduvirus();
                                }
                                else{
                                    float yata = lignes-compteur;
                                    if (yata > 0){
                                        myActivity.compteurLignes.setText(String.valueOf(yata));
                                        myActivity.compteurArgent.setText(String.valueOf(argent));
                                        MainActivity.donnees.setLignes_de_code_courantes(myActivity.getCompteurLigneCourant());
                                        MainActivity.donnees.setLignes_de_code_total(MainActivity.donnees.getLignes_de_code_total()+compteur);
                                        if (yata >= objectif) {
                                            myActivity.objectifatteint();
                                        }
                                    }
                                    else{
                                        lafinduvirus();
                                    }
                                    MainActivity.compteurvirus.setText(String.valueOf(tempsrestantvirus));
                                }
                            }
                            else {
                                float yata = compteur + lignes;
                                myActivity.compteurLignes.setText(String.valueOf(yata));
                                myActivity.compteurArgent.setText(String.valueOf(argent));
                                MainActivity.donnees.setLignes_de_code_courantes(myActivity.getCompteurLigneCourant());
                                MainActivity.donnees.setLignes_de_code_total(MainActivity.donnees.getLignes_de_code_total()+compteur);
                                if (yata >= objectif) {
                                    myActivity.objectifatteint();
                                }
                            }
                        }
                    }
                };
            }
        };
        timer.schedule(myTask, 1000, 1000);

    }
    private static float Mult_dev(float j, float e, float s){
        float n;
        n = j*1+e*10+s*50; //le junior produit 1/s, l'expert 10/s, le senor 50/s

        return n; //on renvoie le nombre a additionne, qui sera ensuite
    }
    private static float Mult_chef_projet(float n, float j, float e, float s){
        float x = 0;
        while (x<j){
            n = 2*n;
            x ++;
        }
        x = 0;
        while (x<e){
            n = 3*n;
            x++;
        }
        x = 0;
        while (x<s){
            n = 4*n;
            x++;
        }
        return n;
    }
    private static void ouaisouaisouaislevirus(final MainActivity myActivity){
        myActivity.afficherVirus();
        virusencours = 1;
        timerVirus = 0;
        duree = 60;
        tempsrestantvirus = duree;
    }
    private static void lafinduvirus(){
        MainActivity.attaquer.performClick();
        MainActivity.tuer.performClick();
        timerVirus = 0;
        duree = 60;
    }

    static private void calculDureeVirus(){
        int serv_f = MainActivity.donnees.getNombre_serveurs_faibles();
        int serv_m = MainActivity.donnees.getNombre_serveurs_moyens();
        int serv_b = MainActivity.donnees.getNombre_serveurs_badass();
        while (serv_f !=0){
            duree = duree - (5*duree/100);
            serv_f -= 1;
        }
        while (serv_m != 0){
            duree = duree - (10*duree/100);
            serv_m -= 1;

        }
        while (serv_b != 0){
            duree = duree - (15*duree/100);
            serv_b -= 1;

        }
        tempsrestantvirus = duree;
    }
}
